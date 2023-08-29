package com.example.evaluationassignment.ui.theme

import androidx.compose.ui.graphics.Color


private val Black = Color(0xFF000000)
private val White = Color(0xFFFFFFFF)
private val Surface = Color(0xFF49454F)
private val AndroidGray50 = Color(0xFFFAFAFA)
private val AndroidGray100 = Color(0xFFF5F5F5)
private val AndroidGray200 = Color(0xFFEEEEEE)
private val AndroidGray400 = Color(0xFFBDBDBD)
private val AndroidGray600 = Color(0xFF757575)
private val AndroidGray700 = Color(0xFF616161)
private val AndroidGray900 = Color(0xFF212121)
private val Grey50 = Color(0xFFF6F6F6)
private val Grey600 = Color(0xFF545454)
private val Blue50 = Color(0xFFEEF3FE)
private val Blue400 = Color(0xFF276EF1)
private val AndroidBlue400 = Color(0xFF42A5F5)
private val Red50 = Color(0xFFFDF0EF)
private val Red400 = Color(0xFFD44333)
private val Green50 = Color(0xFFF0F9F4)
private val Green400 = Color(0xFF3AA76D)
private val Orange50 = Color(0xFFFEF3EF)
private val Orange200 = Color(0xFFE8A889)
private val Orange400 = Color(0xFFED6E33)
private val AndroidOrange300 = Color(0xFFFFB74D)
private val AndroidOrange400 = Color(0xFFFFA726)
private val Pink400 = Color(0xFFEC407A)
private val Purple400 = Color(0xFFAB47BC)
private val Lime400 = Color(0xFFD4E157)
private val LightGreen400 = Color(0xFF9CCC65)
private val AndroidRed400 = Color(0xFFEF5350)

data class TintColor(
    val tint50: Color = Color.Unspecified,
    val tint100: Color = Color.Unspecified,
    val tint200: Color = Color.Unspecified,
    val tint300: Color = Color.Unspecified,
    val tint400: Color = Color.Unspecified,
    val tint500: Color = Color.Unspecified,
    val tint600: Color = Color.Unspecified,
    val tint700: Color = Color.Unspecified,
    val tint800: Color = Color.Unspecified,
    val tint900: Color = Color.Unspecified,
)

data class AppColors(
    val black: Color,
    val white: Color,
    val surface: Color,
    val androidGray: TintColor,
    val grey: TintColor,
    val blue: TintColor,
    val androidBlue: TintColor,
    val red: TintColor,
    val androidRed: TintColor,
    val green: TintColor,
    val orange: TintColor,
    val androidOrange: TintColor,
    val pink: TintColor,
    val purple: TintColor,
    val lime: TintColor,
    val lightGreen: TintColor,
)

val lightColors = AppColors(
    black = Black,
    white = White,
    surface = Surface,
    androidGray = TintColor(
        tint50 = AndroidGray50,
        tint100 = AndroidGray100,
        tint200 = AndroidGray200,
        tint400 = AndroidGray400,
        tint600 = AndroidGray600,
        tint700 = AndroidGray700,
        tint900 = AndroidGray900,
    ),
    grey = TintColor(
        tint50 = Grey50,
        tint600 = Grey600
    ),
    blue = TintColor(
        tint50 = Blue50,
        tint400 = Blue400,
    ),
    androidBlue = TintColor(
        tint400 = AndroidBlue400,
    ),
    red = TintColor(
        tint50 = Red50,
        tint400 = Red400,
    ),
    androidRed = TintColor(
        tint400 = AndroidRed400,
    ),
    green = TintColor(
        tint50 = Green50,
        tint400 = Green400,
    ),
    orange = TintColor(
        tint50 = Orange50,
        tint200 = Orange200,
        tint400 = Orange400,
    ),
    androidOrange = TintColor(
        tint300 = AndroidOrange300,
        tint400 = AndroidOrange400,
    ),
    pink = TintColor(
        tint400 = Pink400,
    ),
    purple = TintColor(
        tint400 = Purple400,
    ),
    lime = TintColor(
        tint400 = Lime400,
    ),
    lightGreen = TintColor(
        tint400 = LightGreen400,
    ),
)