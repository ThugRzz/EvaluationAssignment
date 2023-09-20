package com.example.evaluationassignment.presentation.leads.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.evaluationassignment.R
import com.example.evaluationassignment.ui.components.AppIcon
import com.example.evaluationassignment.ui.components.AppToolbar
import com.example.evaluationassignment.ui.components.Spacer12
import com.example.evaluationassignment.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LeadsScreen() {
    Scaffold(
        topBar = {
            AppToolbar(
                title = stringResource(R.string.leads_title),
                style = AppTheme.typography.button1,
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
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            LeadsBody(
                modifier = Modifier.fillMaxSize(),
                leads = emptyList(),
                filterChips = emptyList(),
                selectedChip = null,
                onChipClick = {},
                onLeadClick = {},
            )
        }
    }
}