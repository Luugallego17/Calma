package com.samay.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF1B4332),
    onPrimary = Color.White,
    background = Color(0xFFF7F3EA),
    onBackground = Color(0xFF1B4332),
    surface = Color(0xFFF7F3EA),
    onSurface = Color(0xFF1B4332)
)

@Composable
fun SamayTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        content = content
    )
}
