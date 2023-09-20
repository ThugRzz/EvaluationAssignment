package com.example.evaluationassignment.ui.components

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.evaluationassignment.ui.theme.AppTheme

@Composable
fun LoadableImage(
    imageUrl: String?,
    modifier: Modifier = Modifier,
    errorPainter: Painter? = null,
) {
    AsyncImage(
        modifier = modifier
            .background(color = AppTheme.colors.white),
        model = ImageRequest.Builder(LocalContext.current)
            .data(imageUrl)
            .crossfade(false)
            .build(),
        placeholder = ColorPainter(AppTheme.colors.white),
        error = errorPainter,
        contentDescription = null,
        contentScale = ContentScale.Fit,
        alignment = Alignment.Center,
    )
}

@Composable
fun getErrorAvatarPainter(name: String): BitmapPainter {
    val bitmap = textAsBitmap(name.firstOrNull().toString(), 14.sp.value, 40.dp.value).asImageBitmap()
    return BitmapPainter(bitmap)
}

fun textAsBitmap(text: String, textSize: Float, size: Float): Bitmap {
    val paint = Paint()
    paint.textSize = textSize
    paint.color = Color.BLACK
    paint.typeface = Typeface.DEFAULT_BOLD
    paint.textAlign = Paint.Align.LEFT
    val textWidth = paint.measureText(text)
    val textHeight = paint.measureText(text)
    val image = Bitmap.createBitmap(size.toInt(), size.toInt(), Bitmap.Config.ARGB_8888)
    val canvas = Canvas(image)
    canvas.drawText(text, ((size / 2) - (textWidth / 2)), ((size / 2) + (textHeight / 2)), paint)
    return image
}