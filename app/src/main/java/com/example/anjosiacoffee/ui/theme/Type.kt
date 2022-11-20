package com.example.anjosiacoffee.ui.theme


import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.anjosiacoffee.R

private val quicksand = FontFamily(
    Font(R.font.quicksandregular, FontWeight.W300),
    Font(R.font.quicksandlight, FontWeight.W400),
    Font(R.font.quicksandmedium, FontWeight.W500),
    Font(R.font.quicksandbold, FontWeight.W600),
)
// Set of Material typography styles to start with
val Typography: Typography
    get() = Typography(
        body1 = TextStyle(
            fontFamily = quicksand,
            fontWeight = FontWeight.W300,
            fontSize = 16.sp
        ),
        h1 = TextStyle(
            fontFamily = quicksand,
            fontWeight = FontWeight.W600,
            fontSize = 16.sp
        ),
        h2 = TextStyle(
            fontFamily = quicksand,
            fontWeight = FontWeight.W500,
            fontSize = 16.sp
        ),
        h3 = TextStyle(
            fontFamily = quicksand,
            fontWeight = FontWeight.W400,
            fontSize = 16.sp
        )

        /* Other default text styles to override
        button = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.W500,
            fontSize = 14.sp
        ),
        caption = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp
        )
        */
    )