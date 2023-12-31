package com.example.evaluationassignment.ui.theme

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

/**
 * @property extraSmall - 4dp
 * @property small - 8dp
 * @property medium - 12dp
 * @property large - 20dp
 * @property circle - 50%
 */
data class AppShape(
    val extraSmall: CornerBasedShape,
    val small: CornerBasedShape,
    val medium: CornerBasedShape,
    val large: CornerBasedShape,
    val circle: CornerBasedShape,
)

val shapes = AppShape(
    extraSmall = RoundedCornerShape(4.dp),
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(12.dp),
    large = RoundedCornerShape(20.dp),
    circle = CircleShape,
)