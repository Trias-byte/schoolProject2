package com.example.schoolproject2.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.schoolproject2.R

private val DarkColorPalette = darkColors(
//    primary = Purple200,
//    primaryVariant = Purple700,
//    secondary = Teal200
    onSurface = Login_black,
//    background = Color(R.color.white),
//    surface = Color(R.color.white),
//    onPrimary = Color(R.color.white),
//    onSecondary = Color(R.color.white),
//    onBackground = Color(R.color.white),

)

private val LightColorPalette = lightColors(

    background = Color(R.color.white),
    surface = Color(R.color.white),
    onPrimary = Color(R.color.white),
    onSecondary = Color(R.color.white),
    onBackground = Color(R.color.white),
    onSurface = Color(R.color.white),

)

@Composable
fun SchoolProject2Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}