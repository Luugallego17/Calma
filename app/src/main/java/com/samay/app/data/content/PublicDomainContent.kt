package com.samay.app.data.content

import android.content.Context
import com.samay.app.data.kit.KitType
import org.json.JSONObject

/**
 * Carga el content pack de dominio público desde assets/content/public_domain.json.
 * Usa org.json (incluido en Android) → sin dependencias extra.
 *
 * Content pack C3 (README §7.15). Los textos están marcados verified=false hasta
 * confirmarlos contra su fuente; NO usar textos con copyright.
 */
object PublicDomainContent {

    private const val ASSET_PATH = "content/public_domain.json"

    fun load(context: Context): List<CalmContent> {
        val json = context.assets.open(ASSET_PATH)
            .bufferedReader()
            .use { it.readText() }
        val root = JSONObject(json)
        val out = mutableListOf<CalmContent>()

        root.optJSONArray("poems")?.let { arr ->
            for (i in 0 until arr.length()) {
                val o = arr.getJSONObject(i)
                out += CalmContent(
                    id = o.getString("id"),
                    type = KitType.POEM,
                    title = o.getString("title"),
                    author = o.optString("author"),
                    text = o.optString("text"),
                    rawResName = null,
                    source = o.optString("source"),
                    license = o.optString("license"),
                    verified = o.optBoolean("verified", false)
                )
            }
        }

        root.optJSONArray("music")?.let { arr ->
            for (i in 0 until arr.length()) {
                val o = arr.getJSONObject(i)
                out += CalmContent(
                    id = o.getString("id"),
                    type = KitType.MUSIC,
                    title = o.getString("title"),
                    author = o.optString("author"),
                    text = null,
                    rawResName = o.optString("rawResName").ifBlank { null },
                    source = o.optString("source"),
                    license = o.optString("license"),
                    verified = o.optBoolean("verified", false)
                )
            }
        }
        return out
    }

    fun poems(context: Context): List<CalmContent> = load(context).filter { it.type == KitType.POEM }
    fun music(context: Context): List<CalmContent> = load(context).filter { it.type == KitType.MUSIC }
}
