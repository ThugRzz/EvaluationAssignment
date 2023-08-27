package com.example.evaluationassignment.di

import com.example.evaluationassignment.data.network.AuthInterceptor
import com.example.evaluationassignment.data.provider.ApiProvider
import org.koin.dsl.module

val providerModule = module {
    single {
        ApiProvider(
            authInterceptor = get<AuthInterceptor>(),
        )
    }
}