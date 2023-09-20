package com.example.evaluationassignment.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.evaluationassignment.R
import com.example.evaluationassignment.ui.theme.AppTheme

@AppPreview
@Composable
private fun Preview() {
    AppTheme {
        AppIcon(
            modifier = Modifier.padding(16.dp),
            painter = painterResource(R.drawable.ic_user_plus),
            onClick = {},
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppIcon(
    painter: Painter,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
) {
    Surface(
        modifier = modifier,
        shape = AppTheme.shapes.small,
        color = AppTheme.colors.androidGray.tint100,
        contentColor = AppTheme.colors.black,
        interactionSource = interactionSource,
        onClick = onClick
    ) {
        Icon(
            modifier = Modifier.padding(10.dp),
            painter = painter,
            contentDescription = null,
        )
    }
}