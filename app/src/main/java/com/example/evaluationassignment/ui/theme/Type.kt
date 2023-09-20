package com.example.evaluationassignment.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

data class AppTypography(
    val h2: TextStyle,
    val h3: TextStyle,
    val label1: TextStyle,
    val label2: TextStyle,
    val label3: TextStyle,
    val label4: TextStyle,
    val inputLabel: TextStyle,
    val body1: TextStyle,
    val body2: TextStyle,
    val body3: TextStyle,
    val caption: TextStyle,
    val navigation: TextStyle,
    val button1: TextStyle,
    val button2: TextStyle,
)

val typography = AppTypography(
    h2 = TextStyle(
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontWeight = FontWeight.Bold,
    ),
    h3 = TextStyle(
        fontSize = 20.sp,
        lineHeight = 32.sp,
        fontWeight = FontWeight.Bold,
    ),
    label1 = TextStyle(
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp,
        fontWeight = FontWeight.Medium,
    ),
    label2 = TextStyle(
        fontSize = 12.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp,
        fontWeight = FontWeight.SemiBold,
    ),
    label3 = TextStyle(
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp,
        fontWeight = FontWeight.SemiBold,
    ),
    label4 = TextStyle(
        fontSize = 14.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.1.sp,
        fontWeight = FontWeight.Medium,
    ),
    inputLabel = TextStyle(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp,
        fontWeight = FontWeight.Bold,
    ),
    body1 = TextStyle(
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Normal,
    ),
    body2 = TextStyle(
        fontSize = 14.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Normal,
    ),
    body3 = TextStyle(
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp,
        fontWeight = FontWeight.Medium,
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.Normal,
    ),
    navigation = TextStyle(
        fontSize = 12.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Bold,
    ),
    button1 = TextStyle(
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Bold,
    ),
    button2 = TextStyle(
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Medium,
    ),
)