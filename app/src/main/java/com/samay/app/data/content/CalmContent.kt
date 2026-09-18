package com.samay.app.data.content

import com.samay.app.data.kit.KitType

/**
 * Un ítem de contenido del kit (poema/versículo de dominio público o pista ambient).
 * Cada ítem lleva su fuente y licencia para atribuir en Settings/About (checklist §17).
 */
data class CalmContent(
    val id: String,
    val type: KitType,          // POEM o MUSIC
    val title: String,
    val author: String,
    val text: String?,          // POEM: texto; MUSIC: null
    val rawResName: String?,    // MUSIC: nombre en res/raw; POEM: null
    val source: String,
    val license: String,
    val verified: Boolean
)
