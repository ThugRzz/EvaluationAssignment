package com.example.evaluationassignment.presentation.leads.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.evaluationassignment.presentation.leads.model.UiFilterChip
import com.example.evaluationassignment.presentation.leads.model.UiLead
import com.example.evaluationassignment.ui.components.Spacer8

@Composable
fun LeadsBody(
    leads: List<UiLead>,
    filterChips: List<UiFilterChip>,
    selectedChip: UiFilterChip?,
    modifier: Modifier = Modifier,
    onChipClick: (UiFilterChip) -> Unit,
    onLeadClick: (UiLead) -> Unit,
) {
    Column(
        modifier = modifier,
    ) {
        FilterChips(
            chips = filterChips,
            selectedChip = selectedChip,
            onClick = onChipClick,
        )
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Spacer8()
            leads.forEach { lead ->
                LeadItem(
                    lead = lead,
                    onClick = { onLeadClick(lead) }
                )
            }
        }
    }
}