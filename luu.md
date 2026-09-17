# Guía para Luu — Esqueleto Android (Closed Testing Play)

Este repositorio incluye el **esqueleto Android** listo para subir a **Google Play Closed Testing**. El README principal del repo (plan Shipaton) **no se modifica**; esta guía es solo para el esqueleto y la publicación.

## Identidad de la app (no cambiar)

| Campo | Valor |
|--------|--------|
| **applicationId** | `com.calm.appcalma` |
| **versionCode** | `1` |
| **versionName** | `0.1.0-skeleton` |

**Importante:** en builds posteriores **no cambies el `applicationId`**. Si lo cambias, Play lo trata como otra app.

## Qué incluye el esqueleto

- Package / applicationId: `com.calm.appcalma`
- UI: Jetpack Compose (pantalla Welcome + disclaimer)
- SDK: minSdk 26 · targetSdk 34

## Abrir en Android Studio

1. Abre esta carpeta del repo en **Android Studio**.
2. Deja que Gradle haga **Sync**.
3. Ejecuta la app en un emulador o dispositivo para verificar que arranca.

## Generar el AAB firmado (para Play)

1. Crea un **keystore** de release (guárdalo en lugar seguro; no lo subas a git).
2. Usa `keystore.properties.example` como referencia para configurar la firma localmente (`keystore.properties` no va a git).
3. En Android Studio: **Build → Generate Signed Bundle / APK** → elige **Android App Bundle (.aab)**.
4. Firma con tu keystore y genera el AAB.

**No subas a git:** `*.keystore`, `*.jks`, `keystore.properties` ni `local.properties`.

## Closed Testing en Google Play

1. Crea (o usa) la app en Play Console con el mismo **applicationId** `com.calm.appcalma`.
2. Sube el AAB a una pista de **Closed testing**.
3. Requisito del challenge: **12 testers** activos durante **14 días**.
4. Invita a los testers, confirma que aceptan y que pueden instalar/abrir la app.

## Contacto del equipo

Si hace falta un correo de contacto del equipo: **adriana.hernandez@ucb.edu.bo**
