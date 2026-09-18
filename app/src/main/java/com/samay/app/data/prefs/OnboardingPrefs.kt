package com.samay.app.data.prefs

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/** DataStore único de la app (nivel de archivo, como pide la librería). */
private val Context.dataStore by preferencesDataStore(name = "samay_prefs")

/**
 * Flags de onboarding y locale (README §7.3).
 * P2 (Alicia) usa `onboardingDone` para el startDestination del NavHost.
 * P5 (Belen) usa `countryCode` para la línea de crisis por país.
 *
 * Defaults: onboarding sin completar, idioma español, país sin definir.
 */
class OnboardingPrefs(private val context: Context) {

    val onboardingDone: Flow<Boolean> =
        context.dataStore.data.map { it[KEY_ONBOARDING_DONE] ?: false }

    val language: Flow<String> =
        context.dataStore.data.map { it[KEY_LANGUAGE] ?: "es" }

    val countryCode: Flow<String?> =
        context.dataStore.data.map { it[KEY_COUNTRY] }

    suspend fun setOnboardingDone(done: Boolean) {
        context.dataStore.edit { it[KEY_ONBOARDING_DONE] = done }
    }

    suspend fun setLanguage(code: String) {
        context.dataStore.edit { it[KEY_LANGUAGE] = code }
    }

    suspend fun setCountryCode(code: String) {
        context.dataStore.edit { it[KEY_COUNTRY] = code }
    }

    private companion object {
        val KEY_ONBOARDING_DONE = booleanPreferencesKey("onboarding_done")
        val KEY_LANGUAGE = stringPreferencesKey("language")
        val KEY_COUNTRY = stringPreferencesKey("country_code")
    }
}
