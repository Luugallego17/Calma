# Calm — Cronograma Shipaton 2026 (15 días)

> Este documento **no cambia** el plan del `README.md`; le pone nombres, fechas e issues.
> Tablero vivo: issue [#7](https://github.com/Luugallego17/Calma/issues/7).

**Día 0 = jue 17 sep 2026 · Feature freeze = mar 29 sep (Día 12) · Demo freeze = mié 30 sep (Día 13) · Submit = jue 1 – vie 2 oct (Día 14–15).**
Clock Play: AAB subido el 17 sep → 14 días cumplidos el **jue 1 oct**.

## Equipo

| | Persona | Rol (README §4) | Epic | Rama |
|--|---------|-----------------|------|------|
| P1 | Paola Quinteros | UX/UI + design system | [#1](https://github.com/Luugallego17/Calma/issues/1) | `design/tokens` |
| P2 | Alicia Belaunde | Arquitectura Compose + nav + QA E2E + merge owner | [#2](https://github.com/Luugallego17/Calma/issues/2) | `feat/p2-nav` |
| P3 | Luna Gallego (@Luugallego17) | Onboarding + Kit + persistencia | [#3](https://github.com/Luugallego17/Calma/issues/3) | `feat/p3-onboarding` |
| P4 | Karen Landivar | Modo Terapia + audio + voz | [#4](https://github.com/Luugallego17/Calma/issues/4) | `feat/p4-therapy` |
| P5 | Belen Mejia | Crisis + contactos + OneSignal/Firebase | [#5](https://github.com/Luugallego17/Calma/issues/5) | `feat/p5-crisis` |
| P6 | Adriana Hernandez | RevenueCat + Play + ship + demo | [#6](https://github.com/Luugallego17/Calma/issues/6) | `feat/p6-revenuecat` |

## Calendario por día

| Día | Fecha | P1 Paola | P2 Alicia | P3 Luna | P4 Karen | P5 Belen | P6 Adriana |
|-----|-------|----------|-----------|---------|----------|----------|------------|
| 0 | jue 17 sep | B1 journey+wires · B2 tokens | A1 repo · A2 gradle · A3 nav · A4 theme | C1 Kit Room · C3 content | D1 AudioPlayer | E1 Contact · E2 CrisisLines | **F1 AAB closed testing** · F2 testers · F8 |
| 1 | vie 18 sep | B2 tokens (DoD) · B3 copy | A3 · A4 (DoD nav stub) | C1 · C2 DataStore · C4 onboarding | D1 (CP2 lluvia) · D2 breath | E1 · E2 (CP2 crisis dial) | F2 testers · F3 RC · F8 |
| 2 | sáb 19 sep | B3 copy · QA visual | apoyo anim D2 | C4 onboarding | D2 · D4 voz | E1 (fin) · E2 | F2 (12 aceptados) · F3 · F8 |
| 3 | dom 20 sep | Theme.kt con P2 | apoyo integración | C4 (fin) · C5 persist · C3 (fin) | D3 integra kit (**CP3**) · D4 | E2 (fin) · E3 OneSignal | F4 paywall · F8 |
| 4 | lun 21 sep | TherapyEnd wires | back stack | C5 (fin) | D4 (fin) · D5 call/SMS | E3 (fin) | F4 · F8 |
| 5 | mar 22 sep | QA visual device | G1 E2E QA | fixes C · apoyo G1 | D3 (fin) · D5 (fin) · H2 TherapyEnd | apoyo G1 | F4 · F8 |
| 6 | mié 23 sep | storyboard video | G1 | fixes | H2 | fixes | F4 · F8 |
| 7 | jue 24 sep | storyboard | G1 (**CP4**) | fixes | H2 (P0 TherapyEnd listo) | fixes | F4 sandbox OK (**CP4**) · F8 |
| 8 | vie 25 sep | B4 icon+screenshots | H3 i18n · ayuda F6 | H1 KitSettings | H2 Estás acompañado | E4 notif · E5 Firebase | F6 Codemagic+Sentry · F8 |
| 9 | sáb 26 sep | B4 | H3 | H1 | H2 | E4 · E5 | F6 · F8 |
| 10 | dom 27 sep | B4 (fin) · listing | H3 (fin) | H1 (fin) | H2 (fin) | E4 (fin) · E5 | F6 (fin) · F8 |
| 11 | lun 28 sep | QA edge cases | QA edge cases | QA edge cases | QA edge cases | E5 (corte) · QA | F5 promo codes · F8 |
| 12 | mar 29 sep | **FREEZE** · polish visual | **FREEZE** · release candidate | bugs P0 | bugs P0 | bugs P0 | F5 (fin) · **FREEZE** · F8 |
| 13 | mié 30 sep | assets video · posts | backup técnico | bugs P0 | demo en vivo (grabación) | bugs P0 | **F7 video** · production track si clock OK · F8 |
| 14 | jue 1 oct | pitch (problema) | pitch (tech) | apoyo Devpost | ensayo demo | pitch (safety) | F7 Devpost · clock 14 días cumplido · F8 |
| 15 | vie 2 oct | ensayo pitch | ensayo pitch | ensayo pitch | ensayo pitch | ensayo pitch | **F7 submit** · backup APK · F8 |

## Tareas (README §26 → issues)

| ID | Issue | Tarea | Persona | Pri | Inicio | Fin | Est. | Depende de | Bloquea a |
|----|-------|-------|---------|-----|--------|-----|------|------------|-----------|
| A1 | [#8](https://github.com/Luugallego17/Calma/issues/8) | Proyecto Android base + carpetas | P2 Alicia | P0 | jue 17 sep | jue 17 sep | 1h | — | todo el código |
| A2 | [#9](https://github.com/Luugallego17/Calma/issues/9) | Gradle deps + Application stubs + Manifest | P2 Alicia | P0 | jue 17 sep | jue 17 sep | 2h | A1 | A3 A4 C1 C2 D1 D4 E1 E3 F1 F6 |
| A3 | [#10](https://github.com/Luugallego17/Calma/issues/10) | NavHost + Screen sealed + stubs + contratos | P2 Alicia | P0 | jue 17 sep | vie 18 sep | 3h | A2 | C4 D2 E1 E2 E4 F4 H3 |
| A4 | [#11](https://github.com/Luugallego17/Calma/issues/11) | Theme placeholders + componentes stub | P2 Alicia | P0 | jue 17 sep | vie 18 sep | 2h | A2 | polish UI |
| B1 | [#12](https://github.com/Luugallego17/Calma/issues/12) | Journey + wireframes P0 | P1 Paola | P0 | jue 17 sep | jue 17 sep | 3h | — | B2 B3 |
| B2 | [#13](https://github.com/Luugallego17/Calma/issues/13) | Tokens + component specs + handoff | P1 Paola | P0 | jue 17 sep | vie 18 sep | 3h | B1 | C4 A4 |
| B3 | [#14](https://github.com/Luugallego17/Calma/issues/14) | Copy disclaimer + crisis + empty states | P1 Paola | P0 | vie 18 sep | sáb 19 sep | 1h | B1 | C5 E2 F4 H3 |
| B4 | [#15](https://github.com/Luugallego17/Calma/issues/15) | Screenshots + icono 1024 + listing | P1 Paola | P1 | vie 25 sep | dom 27 sep | 3h | G1 | F7 |
| C1 | [#16](https://github.com/Luugallego17/Calma/issues/16) | Kit entity + KitDao + AppDatabase | P3 Luna | P0 | jue 17 sep | vie 18 sep | 2h | A2 | C5 D3 |
| C2 | [#17](https://github.com/Luugallego17/Calma/issues/17) | DataStore flags | P3 Luna | P0 | vie 18 sep | vie 18 sep | 1h | A2 | C5 A3 E2 |
| C3 | [#18](https://github.com/Luugallego17/Calma/issues/18) | Content pack poemas/música | P3 Luna (A: P6) | P0 | jue 17 sep | dom 20 sep | 3h | — | C4 D3 |
| C4 | [#19](https://github.com/Luugallego17/Calma/issues/19) | Onboarding screens flow | P3 Luna | P0 | vie 18 sep | dom 20 sep | 8h | A3 B2 | C5 |
| C5 | [#20](https://github.com/Luugallego17/Calma/issues/20) | Persistir kit + ConfirmReady | P3 Luna | P0 | dom 20 sep | lun 21 sep | 2h | C1 C4 | D3 G1 H1 |
| D1 | [#22](https://github.com/Luugallego17/Calma/issues/22) | AudioPlayer Media3 + rain | P4 Karen | P0 | jue 17 sep | vie 18 sep | 3h | A2 | D3 C4 |
| D2 | [#23](https://github.com/Luugallego17/Calma/issues/23) | BreathCircle + timer + ViewModel | P4 Karen | P0 | vie 18 sep | sáb 19 sep | 4h | A3 B2 | D3 |
| D3 | [#24](https://github.com/Luugallego17/Calma/issues/24) | TherapyScreen integra kit | P4 Karen | P0 | dom 20 sep | mar 22 sep | 4h | C5 D1 D2 | G1 H2 F7 |
| D4 | [#25](https://github.com/Luugallego17/Calma/issues/25) | Grabación voz + playback | P4 Karen | P0 | sáb 19 sep | lun 21 sep | 4h | A2 C4 | D3 |
| D5 | [#26](https://github.com/Luugallego17/Calma/issues/26) | Call/SMS intents | P4 Karen | P0 | lun 21 sep | mar 22 sep | 1h | E1 D3 | G1 |
| E1 | [#28](https://github.com/Luugallego17/Calma/issues/28) | Contact entity + Dao + ContactScreen | P5 Belen | P0 | jue 17 sep | sáb 19 sep | 4h | A2 A3 | D5 C5 H1 |
| E2 | [#29](https://github.com/Luugallego17/Calma/issues/29) | CrisisLines + Country + CrisisScreen | P5 Belen | P0 | jue 17 sep | dom 20 sep | 3h | A3 C2 B3 | G1 H2 |
| E3 | [#30](https://github.com/Luugallego17/Calma/issues/30) | OneSignal init + permiso | P5 Belen | P0 | dom 20 sep | lun 21 sep | 2h | A2 | E4 E5 |
| E4 | [#31](https://github.com/Luugallego17/Calma/issues/31) | Notif "Abrir Modo Terapia" + persistente | P5 Belen | P1 | vie 25 sep | dom 27 sep | 3h | E3 A3 | — |
| E5 | [#32](https://github.com/Luugallego17/Calma/issues/32) | Firebase notifyContact + toggle Premium | P5 Belen | P1 | vie 25 sep | lun 28 sep | 5h | E3 F4 D3 | — |
| F1 | [#33](https://github.com/Luugallego17/Calma/issues/33) | Play app + AAB Closed Testing | P6 Adriana | P0 🔴 | jue 17 sep | **jue 17 sep** | 3h | A2 | F2 F3 deadline |
| F2 | [#34](https://github.com/Luugallego17/Calma/issues/34) | 12 testers aceptados | P6 Adriana | P0 🔴 | jue 17 sep | sáb 19 sep | 1–2d | F1 | production |
| F3 | [#35](https://github.com/Luugallego17/Calma/issues/35) | RC project + producto + entitlement | P6 Adriana | P0 | vie 18 sep | sáb 19 sep | 3h | F1 | F4 H1 E5 |
| F4 | [#36](https://github.com/Luugallego17/Calma/issues/36) | PaywallScreen + sandbox | P6 Adriana | P0 | dom 20 sep | jue 24 sep | 4h | A3 F3 B3 | F5 H1 E5 G1 |
| F5 | [#37](https://github.com/Luugallego17/Calma/issues/37) | Promo codes jueces | P6 Adriana | P1 | lun 28 sep | mar 29 sep | 2h | F4 C4 | F7 |
| F6 | [#38](https://github.com/Luugallego17/Calma/issues/38) | Codemagic + Sentry | P6 Adriana (+P2) | P2 | vie 25 sep | dom 27 sep | 3h | A2 | — |
| F7 | [#39](https://github.com/Luugallego17/Calma/issues/39) | Video 2 min + Devpost + submit | P6 Adriana | P0 | mié 30 sep | vie 2 oct | 6h | G1 G2 B4 F2 | submit |
| F8 | [#40](https://github.com/Luugallego17/Calma/issues/40) | #BuildInPublic ≥1 post/día | P6 Adriana (+P1) | P1 | jue 17 sep | vie 2 oct | diario | — | BIP |
| G1 | [#41](https://github.com/Luugallego17/Calma/issues/41) | E2E QA checklist device real | P2 Alicia (A: P6) | P0 | mar 22 sep | jue 24 sep | 4h | C5 D3 D5 E2 F4 | B4 F7 G2 |
| G2 | [#43](https://github.com/Luugallego17/Calma/issues/43) | Feature freeze + demo freeze | Todos | P0 | lun 28 sep | mar 29 sep | — | G1 | F7 |
| H1 | [#21](https://github.com/Luugallego17/Calma/issues/21) | KitSettings + gate multi-kit Premium | P3 Luna | P1 | vie 25 sep | dom 27 sep | 4h | C5 F4 | — |
| H2 | [#27](https://github.com/Luugallego17/Calma/issues/27) | TherapyEnd + "Estás acompañado" | P4 Karen | P0/P1 | mar 22 sep | dom 27 sep | 4h | D3 E2 D5 | F7 |
| H3 | [#42](https://github.com/Luugallego17/Calma/issues/42) | i18n ES/EN + back stack | P2 Alicia | P1 | vie 25 sep | dom 27 sep | 4h | A3 B3 C2 | — |

H1–H3 no están en la tabla §26 del README; salen de §13 (Día 8–10), §3 (P1) y P0-17.

## Checkpoints

| CP | Fecha | Criterio (README §16) | Issues |
|----|-------|-----------------------|--------|
| CP1 | jue 17 sep, +3h | Entorno + Play upload | #8 #9 #10 #33 |
| CP2 | vie 18 sep | Vertical stub Therapy + Crisis | #22 #29 |
| CP3 | dom 20 sep | Onboarding → Therapy con kit real | #20 #24 |
| CP4 | jue 24 sep | MVP P0 E2E + paywall sandbox | #41 #36 |
| CP5 | mar 29 sep | **Feature freeze** | #43 |
| CP6 | mié 30 sep | **Demo freeze** | #39 |
| CP7 | vie 2 oct | Submit: Devpost + video + repo + store o Next Gen | #39 |

**Daily 10 min** (Ayer / Hoy / Bloqueo / Ayuda): dueño rotativo Alicia (P2) / Adriana (P6).

## Ruta crítica y bloqueadores

- **Ruta crítica:** A1 → A2 → A3 → C4 → C5 → D3 → G1 → G2 → F7.
- **Bloqueadores #1:** A1/A2 (#8 #9), F1/F2 (#33 #34), A3 (#10). Si el jue 17 sep no hay AAB en closed testing, el production track no llega y la categoría principal pasa a Next Gen.
- **Regla anti-cuello:** P3–P6 arrancan con mocks; P2 publica theme + stubs el Día 0–1; P1 entrega tokens el Día 1.

## Labels del repo

- `persona:P1-paola` … `persona:P6-adriana` — dueño
- `prio:P0` / `prio:P1` / `prio:P2` — prioridad del README §2–3
- `fase:dia-0-1` … `fase:dia-14-15` — semana del plan §13
- `epic`, `todos`, `critico`
