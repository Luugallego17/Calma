package com.samay.app.navigation

sealed class Screen(val route: String) {

    // Onboarding
    data object Welcome : Screen("welcome")
    data object LangSelect : Screen("lang_select")
    data object KitChoose : Screen("kit_choose")
    data object KitVoice : Screen("kit_voice")
    data object KitPoems : Screen("kit_poems")
    data object KitMusic : Screen("kit_music")
    data object Contact : Screen("contact")
    data object CrisisConfirm : Screen("crisis_confirm")
    data object ConfirmReady : Screen("confirm_ready")

    data object Home : Screen("home")
    data object Therapy : Screen("therapy")
    data object TherapyEnd : Screen("therapy_end")
    data object Help : Screen("help")
    data object Settings : Screen("settings")
    data object Paywall : Screen("paywall")
    data object Crisis : Screen("crisis")
}