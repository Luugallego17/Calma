package com.samay.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.samay.app.ui.paywall.PaywallScreen

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
            PlaceholderScreen("Language", "P3",
                onNext = { navController.navigate(Screen.KitChoose.route) })
        }
        composable(Screen.KitChoose.route) {
            PlaceholderScreen("Choose kit", "P3",
                onNext = { navController.navigate(Screen.Contact.route) })
        }
        composable(Screen.KitVoice.route) {
            PlaceholderScreen("Kit: Voice", "P3")
        }
        composable(Screen.KitPoems.route) {
            PlaceholderScreen("Kit: Poems", "P3")
        }
        composable(Screen.KitMusic.route) {
            PlaceholderScreen("Kit: Music", "P3")
        }
        composable(Screen.Contact.route) {
            PlaceholderScreen("Trusted person", "P5",
                onNext = { navController.navigate(Screen.CrisisConfirm.route) })
        }
        composable(Screen.CrisisConfirm.route) {
            PlaceholderScreen("Crisis line / country", "P5",
                onNext = { navController.navigate(Screen.ConfirmReady.route) })
        }
        composable(Screen.ConfirmReady.route) {
            PlaceholderScreen("Your kit is ready", "P3",
                onNext = { navController.navigate(Screen.Home.route) },
                nextLabel = "Go to app")
        }

        // ---------- Main app ----------
        composable(Screen.Home.route) {
            PlaceholderScreen(
                title = "Home",
                owner = "P4",
                onNext = { navController.navigate(Screen.Therapy.route) },
                nextLabel = "Therapy Mode",
                onSecondary = { navController.navigate(Screen.Paywall.route) },
                secondaryLabel = "Planes / Premium"
            )
        }
        composable(Screen.Therapy.route) {
            PlaceholderScreen("Therapy Mode", "P4",
                onNext = { navController.navigate(Screen.Crisis.route) },
                nextLabel = "Go to Crisis")
        }
        composable(Screen.TherapyEnd.route) {
            PlaceholderScreen("Well done", "P4")
        }
        composable(Screen.Help.route) {
            PlaceholderScreen("You're not alone", "P5")
        }
        composable(Screen.Settings.route) {
            PlaceholderScreen("Settings", "P1")
        }
        composable(Screen.Paywall.route) {
            PaywallScreen(
                onPromoCodeClick = { /* F5 promo codes */ },
                onClose = { navController.popBackStack() }
            )
        }
        composable(Screen.Crisis.route) {
            PlaceholderScreen("Crisis", "P5")
        }
    }
}