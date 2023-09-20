package com.example.evaluationassignment.presentation.leads.model

data class UiLead(
    val id: Long,
    val name: String,
    val followDate: String,
    val status: UiLeadStatus,
    val avatarUrl: String,
    val countryEmoji: String,
)
