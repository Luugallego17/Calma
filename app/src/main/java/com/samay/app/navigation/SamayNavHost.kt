package com.samay.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SamayNavHost(
    navController: NavHostController = rememberNavController(),
    onboardingDone: Boolean = false
) {
    val start = if (onboardingDone) Screen.Home.route else Screen.Welcome.route

    NavHost(navController = navController, startDestination = start) {

        // ---------- Onboarding ----------
        composable(Screen.Welcome.route) {
            PlaceholderScreen("Welcome", "P3",
                onNext = { navController.navigate(Screen.LangSelect.route) })
        }
        composable(Screen.LangSelect.route) {
            PlaceholderScreen("Idioma", "P3",
                onNext = { navController.navigate(Screen.KitChoose.route) })
        }
        composable(Screen.KitChoose.route) {
            PlaceholderScreen("Elegir kit", "P3",
                onNext = { navController.navigate(Screen.Contact.route) })
        }
        composable(Screen.KitVoice.route) {
            PlaceholderScreen("Kit: Voz", "P3")
        }
        composable(Screen.KitPoems.route) {
            PlaceholderScreen("Kit: Poemas", "P3")
        }
        composable(Screen.KitMusic.route) {
            PlaceholderScreen("Kit: Música", "P3")
        }
        composable(Screen.Contact.route) {
            PlaceholderScreen("Persona de confianza", "P5",
                onNext = { navController.navigate(Screen.CrisisConfirm.route) })
        }
        composable(Screen.CrisisConfirm.route) {
            PlaceholderScreen("Línea de crisis / país", "P5",
                onNext = { navController.navigate(Screen.ConfirmReady.route) })
        }
        composable(Screen.ConfirmReady.route) {
            PlaceholderScreen("Tu kit está listo", "P3",
                onNext = { navController.navigate(Screen.Home.route) },
                nextLabel = "Ir a la app")
        }

        // ---------- App principal ----------
        composable(Screen.Home.route) {
            PlaceholderScreen("Home", "P4",
                onNext = { navController.navigate(Screen.Therapy.route) },
                nextLabel = "Modo Terapia")
        }
        composable(Screen.Therapy.route) {
            PlaceholderScreen("Modo Terapia", "P4",
                onNext = { navController.navigate(Screen.Crisis.route) },
                nextLabel = "Ir a Crisis")
        }
        composable(Screen.TherapyEnd.route) {
            PlaceholderScreen("Bien hecho", "P4")
        }
        composable(Screen.Help.route) {
            PlaceholderScreen("Estás acompañado", "P5")
        }
        composable(Screen.Settings.route) {
            PlaceholderScreen("Configuración", "P1")
        }
        composable(Screen.Paywall.route) {
            PlaceholderScreen("Planes / Premium", "P6")
        }
        composable(Screen.Crisis.route) {
            PlaceholderScreen("Crisis", "P5")
        }
    }
}