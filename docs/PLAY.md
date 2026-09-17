# Play Console — Closed Testing (issues #33, #34)

Guía y seguimiento de la publicación del esqueleto Android en Google Play.
Dueña: Adriana (P6). El README principal (plan Shipaton) no se toca; esto es solo sobre el esqueleto y la subida.

## Identidad de la app (NO cambiar)

| Campo | Valor |
|-------|-------|
| **applicationId** | `com.samay.app` |
| **versionCode** | `1` |
| **versionName** | `0.1.0-skeleton` |

**Importante:** en builds posteriores **no cambies el `applicationId`**. Si lo cambiás, Play lo trata como otra app y se reinicia el reloj de 14 días.

## Abrir y verificar en Android Studio

1. Abrí la carpeta del repo en Android Studio.
2. Dejá que Gradle haga **Sync**.
3. Corré la app en un emulador o dispositivo para confirmar que arranca.

## Generar el AAB firmado

1. Creá un **keystore** de release y guardalo en lugar seguro (no va a git).
2. Usá `keystore.properties.example` como referencia para configurar la firma local (`keystore.properties` no va a git).
3. Android Studio → **Build → Generate Signed Bundle / APK** → **Android App Bundle (.aab)**.
4. Firmá con tu keystore y generá el AAB.

**Nunca a git:** `*.keystore`, `*.jks`, `keystore.properties`, `local.properties`.

## Subir a Closed Testing

1. Creá (o usá) la app en Play Console con el **applicationId** `com.samay.app`.
2. Subí el AAB a una pista de **Closed testing**.
3. Requisito del challenge: **12 testers** activos durante **14 días**.
4. Invitá a los testers, confirmá que aceptan y que pueden instalar/abrir la app.

## Seguimiento (completar del dashboard — no inventar fechas)

| Campo | Valor |
|-------|-------|
| Cuenta Play (pre-nov 2023: sí/no) | |
| Nombre de la app en Play | Samay |
| Package | `com.samay.app` |
| Track | Closed testing |
| Fecha de subida del AAB esqueleto | |
| Fecha en que se cumplen los 14 días | |
| Link de opt-in para testers | |
| Testers aceptados / 12 | |

## Testers

| # | Nombre | Invitado | Aceptó | Instaló |
|---|--------|----------|--------|---------|
| 1 | | | | |
| 2 | | | | |
| … | | | | |

Contacto del equipo para Play/Devpost: **adriana.hernandez@ucb.edu.bo**
