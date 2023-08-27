package com.example.evaluationassignment.di

import com.example.evaluationassignment.data.network.AuthInterceptor
import com.example.evaluationassignment.data.network.service.NetworkApiSource
import com.example.evaluationassignment.data.provider.ApiProvider
import org.koin.dsl.module


val networkModule = module {
    factory {
        AuthInterceptor()
    }
    single<NetworkApiSource> {
        val apiProvider = get<ApiProvider>()
        apiProvider.apiRetrofit.create(NetworkApiSource::class.java)
    }
}