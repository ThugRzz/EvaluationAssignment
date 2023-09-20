package com.example.evaluationassignment.presentation.leads.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.evaluationassignment.R
import com.example.evaluationassignment.presentation.leads.model.UiFilterChip
import com.example.evaluationassignment.ui.components.AppPreview
import com.example.evaluationassignment.ui.components.Spacer12
import com.example.evaluationassignment.ui.components.Spacer16
import com.example.evaluationassignment.ui.theme.AppTheme

@AppPreview
@Composable
private fun FilterChipsPreview() {
    AppTheme {
        FilterChips(
            modifier = Modifier.fillMaxWidth(),
            chips = UiFilterChip.values().toList(),
            selectedChip = UiFilterChip.ALL_LEADS,
            onClick = {},
        )
    }
}

@AppPreview
@Composable
private fun FilterChipPreview() {
    AppTheme {
        FilterChip(
            modifier = Modifier.padding(16.dp),
            chip = UiFilterChip.FILTER,
            selected = false,
            onClick = {},
        )
    }
}

@Composable
fun FilterChips(
    chips: List<UiFilterChip>,
    selectedChip: UiFilterChip?,
    modifier: Modifier = Modifier,
    onClick: (UiFilterChip) -> Unit,
) {
    Row(
        modifier = modifier
            .padding(vertical = 8.dp)
            .horizontalScroll(rememberScrollState()),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Spacer16()
        chips.forEachIndexed { index, chip ->
            FilterChip(
                chip = chip,
                selected = chip == selectedChip,
                onClick = { onClick(chip) },
            )
            if (index < chips.lastIndex) {
                Spacer12()
            }
        }
        Spacer16()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun FilterChip(
    chip: UiFilterChip,
    selected: Boolean,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
) {
    val verticalPadding = if (chip == UiFilterChip.FILTER) {
        8.dp
    } else {
        6.dp
    }
    val horizontalPadding = if (chip == UiFilterChip.FILTER) {
        8.dp
    } else {
        12.dp
    }
    val text = when (chip) {
        UiFilterChip.FILTER -> null
        UiFilterChip.ALL_LEADS -> stringResource(R.string.leads_all_leads)
        UiFilterChip.DUE_TODAY -> stringResource(R.string.leads_due_today)
    }
    val backgroundColor = if (selected) {
        AppTheme.colors.black
    } else {
        AppTheme.colors.white
    }
    val contentColor = if (selected) {
        AppTheme.colors.androidGray.tint50
    } else {
        AppTheme.colors.black
    }
    Surface(
        modifier = modifier,
        shape = AppTheme.shapes.small,
        border = BorderStroke(
            width = 1.dp,
            color = AppTheme.colors.androidGray.tint200,
        ),
        color = backgroundColor,
        contentColor = contentColor,
        interactionSource = interactionSource,
        onClick = onClick,
    ) {
        Box(
            modifier = Modifier
                .padding(vertical = verticalPadding, horizontal = horizontalPadding),
        ) {
            if (chip == UiFilterChip.FILTER) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(R.drawable.ic_filter),
                    contentDescription = null,
                )
            } else {
                Text(
                    text = text ?: "",
                    style = AppTheme.typography.label1,
                )
            }
        }
    }
}