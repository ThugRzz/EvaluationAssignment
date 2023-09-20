package com.example.evaluationassignment.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.evaluationassignment.R
import com.example.evaluationassignment.ui.theme.AppTheme

@AppPreview
@Composable
private fun Preview() {
    AppTheme {
        AppToolbar(
            modifier = Modifier.fillMaxWidth(),
            title = "Toolbar",
            style = AppTheme.typography.h2,
            actions = {
                AppIcon(
                    painter = painterResource(R.drawable.ic_user_plus),
                    onClick = {},
                )
                Spacer12()
                AppIcon(
                    painter = painterResource(R.drawable.ic_search),
                    onClick = {},
                )
            }
        )
    }
}

@Composable
fun AppToolbar(
    title: String,
    style: TextStyle,
    modifier: Modifier = Modifier,
    actions: @Composable RowScope.() -> Unit,
    onBackClick: (() -> Unit)? = null,
) {
    Row(
        modifier = modifier
            .height(72.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (onBackClick != null) {
            Spacer16()
            AppIcon(
                painter = painterResource(R.drawable.ic_chevron_left),
                onClick = onBackClick,
            )
        }
        Spacer16()
        Text(
            modifier = Modifier.weight(1f),
            text = title,
            style = style,
            color = AppTheme.colors.black,
            textAlign = if (onBackClick != null) {
                TextAlign.Center
            } else {
                TextAlign.Start
            },
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        Spacer16()
        actions()
        Spacer16()
    }
}