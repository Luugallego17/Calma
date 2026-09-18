package com.samay.app.ui.onboarding

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import com.samay.app.data.AppDatabase
import com.samay.app.data.content.PublicDomainContent
import com.samay.app.data.kit.KitRepository
import com.samay.app.data.kit.KitType
import com.samay.app.data.kit.RoomKitRepository
import com.samay.app.data.prefs.OnboardingPrefs
import kotlinx.coroutines.launch

/**
 * Flujo de onboarding completo, autocontenido: Welcome → Idioma → KitChoose →
 * contenido/voz → Confirm. Hace su propia navegación por pasos (no usa el NavHost
 * de la app), así P2 puede montarlo como un solo destino cuando A3 esté listo:
 *
 *     composable(Screen.Onboarding.route) { OnboardingFlow(onFinished = { navToHome() }) }
 *
 * @param onFinished se llama cuando el kit quedó guardado y onboarding_done = true.
 */
@Composable
fun OnboardingFlow(
    onFinished: () -> Unit,
    controller: OnboardingController = remember { OnboardingController() },
    kitRepo: KitRepository? = null,
    prefs: OnboardingPrefs? = null
) {
    val context = LocalContext.current
    val repo = remember(kitRepo) { kitRepo ?: RoomKitRepository(AppDatabase.get(context).kitDao()) }
    val onboardingPrefs = remember(prefs) { prefs ?: OnboardingPrefs(context) }
    val scope = rememberCoroutineScope()

    val state by controller.state.collectAsState()
    val content = remember { PublicDomainContent.load(context) }

    when (state.step) {
        OnboardingStep.WELCOME ->
            WelcomeStep(onStart = { controller.next() })

        OnboardingStep.LANGUAGE ->
            LanguageStep(
                selected = state.language,
                onSelect = controller::setLanguage,
                onBack = { controller.back() },
                onNext = { controller.next() }
            )

        OnboardingStep.KIT_CHOOSE ->
            KitChooseStep(
                selected = state.kitType,
                onSelect = controller::setKitType,
                canAdvance = controller.canAdvance(),
                onBack = { controller.back() },
                onNext = { controller.next() }
            )

        OnboardingStep.KIT_CONTENT -> {
            val items = if (state.kitType == KitType.MUSIC)
                content.filter { it.type == KitType.MUSIC }
            else
                content.filter { it.type == KitType.POEM }
            KitContentStep(
                items = items,
                selectedId = state.selectedContentId,
                onSelect = { controller.selectContent(it.id, it.title) },
                canAdvance = controller.canAdvance(),
                onBack = { controller.back() },
                onNext = { controller.next() }
            )
        }

        OnboardingStep.VOICE ->
            VoiceStep(onBack = { controller.back() }, onNext = { controller.next() })

        OnboardingStep.CONFIRM ->
            ConfirmStep(
                kitTitle = state.selectedTitle.ifBlank {
                    when (state.kitType) {
                        KitType.MUSIC -> "Lluvia"
                        KitType.VOICE -> "Voz de mi persona"
                        else -> "Kit de calma"
                    }
                },
                saving = state.saving,
                error = state.error,
                onBack = { controller.back() },
                onFinish = {
                    scope.launch {
                        controller.persist(repo, onboardingPrefs)
                        if (controller.state.value.error == null) onFinished()
                    }
                }
            )
    }
}
