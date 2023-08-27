package com.example.evaluationassignment.data.provider

import com.example.evaluationassignment.BASE_URL
import com.example.evaluationassignment.Logger
import com.example.evaluationassignment.data.network.AuthInterceptor
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import java.util.concurrent.*

class ApiProvider(
    private val authInterceptor: AuthInterceptor,
) {


    private val loggingInterceptor =
        HttpLoggingInterceptor { message -> Logger.local(Logger.HTTP, message) }
            .setLevel(HttpLoggingInterceptor.Level.BODY)

    val json: Json =
        Json {
            ignoreUnknownKeys = true
        }

    private val jsonConverterFactory: Converter.Factory
        get() {
            val jsonContentType = "application/json".toMediaType()
            return json.asConverterFactory(jsonContentType)
        }

    private val apiOkHttpClient: OkHttpClient
        get() {
            val builder = OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .addInterceptor(authInterceptor)
                .addInterceptor(loggingInterceptor)
            return builder.build()
        }

    val apiRetrofit: Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(apiOkHttpClient)
            .addConverterFactory(jsonConverterFactory)
            .build()
}