package com.samay.app

import android.app.Application
import com.revenuecat.purchases.LogLevel
import com.revenuecat.purchases.Purchases
import com.revenuecat.purchases.PurchasesConfiguration

/**
 * Application de Samay. Inicializa RevenueCat si hay API key configurada.
 *
 * La key se lee de local.properties (revenuecat.apiKey) vía BuildConfig; nunca va a git.
 * Si no hay key (build sin configurar), la app arranca igual sin RevenueCat, para no romper
 * el desarrollo de las demás verticales.
 *
 * El flujo de compra / paywall (offering "default", entitlement "premium") lo implementa F4.
 */
class SamayApp : Application() {
    override fun onCreate() {
        super.onCreate()
        configureRevenueCat()
    }

    private fun configureRevenueCat() {
        val apiKey = BuildConfig.REVENUECAT_API_KEY
        if (apiKey.isBlank()) return // sin key configurada: se omite RevenueCat

        Purchases.logLevel = if (BuildConfig.DEBUG) LogLevel.DEBUG else LogLevel.INFO
        Purchases.configure(
            PurchasesConfiguration.Builder(this, apiKey).build()
        )
    }
}
