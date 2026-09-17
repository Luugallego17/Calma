# Git y colaboración (README §19)

## Ramas

- `main` protegida — 1 review ideal; si no hay tiempo, pair merge.
- Una rama por vertical:
  - `feat/p2-nav` — Alicia (P2)
  - `feat/p3-onboarding` — Luna (P3)
  - `feat/p4-therapy` — Karen (P4)
  - `feat/p5-crisis` — Belen (P5)
  - `feat/p6-revenuecat` — Adriana (P6)
  - `design/tokens` — Paola (P1)
- PR pequeño (< 400 líneas) cuando se pueda. Merge **≥ 1 por día** a `main`.

## Commits

Prefijos: `feat:` `fix:` `ui:` `docs:` `chore:` `release:`

Ejemplo: `feat: KitDao insert/get (#16)` — referenciá siempre el issue.

## Conflictos calientes

`AppNavigation.kt`, `Theme.kt`, `build.gradle.kts` → **P2 (Alicia) es merge owner**. Avisá antes de tocarlos.

## Secrets

`local.properties` + CI secrets. **Nunca keys en git** (RevenueCat, OneSignal, Firebase, Sentry, keystore).

## Después del feature freeze (mar 29 sep 2026)

Solo PRs de bugs P0, copy, visual, estabilidad, video, Devpost. Cualquier P2/P3 nuevo va a backlog post-submit.

## Issues

- Cada tarea del tablero (README §26) es un issue con responsable, fechas y dependencias: ver `docs/CRONOGRAMA.md` y el issue #7.
- Bugs: usar la plantilla `Bug` y poner el label `persona:*` de quien es dueño del módulo.
- Estados: cambiá el label o comentá en el issue en el daily (Ayer / Hoy / Bloqueo / Ayuda).
