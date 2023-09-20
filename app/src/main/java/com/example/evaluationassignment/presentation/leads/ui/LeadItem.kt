package com.example.evaluationassignment.presentation.leads.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.core.graphics.toColorInt
import com.example.evaluationassignment.presentation.leads.model.UiLead
import com.example.evaluationassignment.presentation.leads.model.UiLeadStatus
import com.example.evaluationassignment.ui.components.AppPreview
import com.example.evaluationassignment.ui.components.LoadableImage
import com.example.evaluationassignment.ui.components.Spacer4
import com.example.evaluationassignment.ui.components.Spacer8
import com.example.evaluationassignment.ui.theme.AppTheme

@AppPreview
@Composable
private fun Preview() {
    AppTheme {
        LeadItem(
            modifier = Modifier.fillMaxWidth(),
            lead = UiLead(
                id = 1,
                name = "Jane Cooper",
                followDate = "Follow up: March 13, 2023",
                status = UiLeadStatus(
                    backgroundColor = "#EEF3FE",
                    color = "#276EF1",
                    title = "New"
                ),
                avatarUrl = "",
                countryEmoji = "",
            ),
            onClick = {},
        )
    }
}

@Composable
fun LeadItem(
    lead: UiLead,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
) {
    Row(
        modifier = modifier
            .clickable(
                interactionSource = interactionSource,
                indication = rememberRipple(),
                onClick = onClick
            )
            .padding(8.dp),
    ) {
        LoadableImage(
            modifier = Modifier
                .size(40.dp)
                .clip(AppTheme.shapes.circle)
                .border(
                    width = 1.dp,
                    color = AppTheme.colors.androidGray.tint200,
                    shape = AppTheme.shapes.circle,
                ),
            imageUrl = lead.avatarUrl,
        )
        Spacer8()
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = lead.name,
                    style = AppTheme.typography.body3,
                    color = AppTheme.colors.androidGray.tint900,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Spacer8()
                LoadableImage(
                    modifier = Modifier
                        .size(16.dp)
                        .clip(AppTheme.shapes.circle),
                    imageUrl = lead.countryEmoji,
                )
            }
            Spacer4()
            Text(
                text = lead.followDate,
                style = AppTheme.typography.caption,
                color = AppTheme.colors.androidGray.tint600,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
        Spacer8()
        StatusBadge(status = lead.status)
        Spacer8()
    }
}

@Composable
private fun StatusBadge(
    status: UiLeadStatus,
    modifier: Modifier = Modifier,
) {
    Surface(
        modifier = modifier,
        shape = AppTheme.shapes.circle,
        color = Color(status.backgroundColor.toColorInt()),
        contentColor = Color(status.color.toColorInt()),
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 8.dp),
            text = status.title,
            style = AppTheme.typography.navigation,
        )
    }
}