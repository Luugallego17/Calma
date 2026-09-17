# Play Console — Publicación (issues #33, #34)

## ⚠️ Reglas oficiales Shipaton 2026
- La app debe estar **PÚBLICA en producción** en Google Play entre 1 ago y **30 sep 2026**. **El closed testing NO cuenta** como público; los jueces deben poder descargarla.
- **Deadline: mié 30 sep 2026, 11:45 PM Pacífico** (= jue 1 oct, 2:45 AM Bolivia).
- **RevenueCat SDK obligatorio** para ≥1 compra in-app.
- **Cuenta de Play del equipo = vieja (>1 año)** → **NO hay regla de 14 días**; se puede promover a producción directo. ✅
- Meta interna: **producción live ≤ 28 sep** (buffer de 2 días).

Dueña: Adriana (P6). El README (plan Shipaton) no se toca; esto es solo la publicación.

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
2. Subí el AAB a una pista de **Closed testing** para validar rápido con el equipo.
3. Invitá a algunos testers, confirmá que la app abre y que funciona la compra RevenueCat.

> La regla de Google Play de **12 testers × 14 días** aplica solo a cuentas **nuevas** (post-nov 2023). Como la cuenta del equipo es vieja, **no hay que esperar**: este paso es solo para probar antes de ir a producción.

## Promover a PRODUCCIÓN (esto es lo que exige el Shipaton)

1. Con la app validada y RevenueCat funcionando, en Play Console: promové el release de **Closed testing → Production** (cuenta vieja: sin espera de 14 días).
2. Completá la ficha de tienda obligatoria (descripción, screenshots de B4/#15, política de privacidad, clasificación de contenido).
3. Esperá la revisión de Google y confirmá que la app quedó **pública y descargable por cualquiera** (probá con una cuenta que no sea tester).
4. Guardá el **link público** de la ficha para el Devpost (F7/#39).

## Seguimiento (completar del dashboard — no inventar fechas)

| Campo | Valor |
|-------|-------|
| Cuenta Play (pre-nov 2023: sí/no) | |
| Nombre de la app en Play | Samay |
| Package | `com.samay.app` |
| Track (objetivo) | Production (pública) |
| Fecha subida closed testing | |
| Fecha producción LIVE (≤28 sep) | |
| Link público de la app | |
| Testers que probaron | |

## Testers

| # | Nombre | Invitado | Aceptó | Instaló |
|---|--------|----------|--------|---------|
| 1 | | | | |
| 2 | | | | |
| … | | | | |

Contacto del equipo para Play/Devpost: **adriana.hernandez@ucb.edu.bo**
