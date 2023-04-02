package com.example.schoolproject2.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.schoolproject2.R

val montserrat = FontFamily(
    Font(R.font.montserrat_thin, FontWeight.Thin),
    Font(R.font.montserrat_thin_italic, FontWeight.Thin, FontStyle.Italic),
    Font(R.font.montserrat_light, FontWeight.Light),
    Font(R.font.montserrat_light_italic, FontWeight.Light, FontStyle.Italic),
    Font(R.font.montserrat, FontWeight.Normal),
    Font(R.font.montserrat_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.montserrat_medium, FontWeight.Medium),
    Font(R.font.montserrat_medium_italic, FontWeight.Medium, FontStyle.Italic),
    Font(R.font.montserrat_semibold, FontWeight.SemiBold),
    Font(R.font.montserrat_semibold_italic, FontWeight.SemiBold, FontStyle.Italic),
    Font(R.font.montserrat_bold, FontWeight.Bold),
    Font(R.font.montserrat_bold_italic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.montserrat_extrabold, FontWeight.ExtraBold),
    Font(R.font.montserrat_extrabold_italic, FontWeight.ExtraBold, FontStyle.Italic),
    Font(R.font.montserrat_black, FontWeight.Black),
    Font(R.font.montserrat_black_italic, FontWeight.Black, FontStyle.Italic),
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle( // it's a standard text
        fontFamily = montserrat,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        letterSpacing = 0.05.sp,
    ),

    h1 = TextStyle( // it's a header text
        fontFamily = montserrat,
        fontWeight = FontWeight.SemiBold,
        fontSize = 25.sp,
    ),

    subtitle1 = TextStyle( // it's bold text
        fontFamily = montserrat,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
    ),

    subtitle2 = TextStyle( // it's important text
        fontFamily = montserrat,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp
    ),

    caption = TextStyle( // it's form text
        fontFamily = montserrat,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
    ),

)