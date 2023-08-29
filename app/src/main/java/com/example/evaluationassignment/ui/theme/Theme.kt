package com.example.evaluationassignment.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

private val LocalAppColors = staticCompositionLocalOf<AppColors> {
    error("No colors provided")
}
private val LocalAppTypography = staticCompositionLocalOf<AppTypography> {
    error("No typography provided")
}
private val LocalAppShapes = staticCompositionLocalOf<AppShape> {
    error("No shapes provided")
}

object AppTheme {

    val colors: AppColors
        @Composable
        @ReadOnlyComposable
        get() = LocalAppColors.current

    val typography: AppTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalAppTypography.current

    val shapes: AppShape
        @Composable
        @ReadOnlyComposable
        get() = LocalAppShapes.current
}

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    val colors = lightColors
    val typography = typography
    val shapes = shapes

    CompositionLocalProvider(
        LocalAppColors provides colors,
        LocalAppTypography provides typography,
        LocalAppShapes provides shapes,
        content = content,
    )
}