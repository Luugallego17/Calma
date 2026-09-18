package com.samay.app.data.kit

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Tipo de kit de calma que arma el usuario (README §7.1).
 * VOICE = grabación de una persona de confianza (P4 llena voiceFilePath).
 * POEM  = versículo/poema de dominio público (texto).
 * MUSIC = ambient desde res/raw.
 */
enum class KitType { VOICE, POEM, MUSIC }

/**
 * Un kit guardado. El MVP usa 1 kit primario; multi-kit es Premium (H1).
 *
 * @param type       tipo primario elegido en KitChoose.
 * @param contentId  id del contenido elegido (poema/música del content pack C3); null para VOICE.
 * @param voiceFilePath  ruta local del archivo de voz grabado por P4 (D4); null si no es VOICE.
 * @param title      etiqueta visible del kit (ej. "Salmo 23", "Lluvia", "Voz de mamá").
 */
@Entity(tableName = "kit")
data class Kit(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val type: KitType,
    val contentId: String? = null,
    val voiceFilePath: String? = null,
    val title: String = "",
    val createdAt: Long = System.currentTimeMillis()
)
