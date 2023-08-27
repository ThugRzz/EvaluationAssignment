package com.example.evaluationassignment.data.network

import okhttp3.Interceptor
import okhttp3.Response
import org.koin.core.component.KoinComponent

/**
 * Interceptor для добавления в каждый запрос заголовока авторизации
 */
class AuthInterceptor : Interceptor, KoinComponent {


    override fun intercept(chain: Interceptor.Chain): Response {
        val builder = chain.request().newBuilder()

        builder.addHeader(HEADER_AUTHORIZATION, BEARER_TOKEN)

        return chain.proceed(builder.build())
    }

    companion object {
        private const val HEADER_AUTHORIZATION = "Authorization"

        /**
         * По хорошему токен нужно бы хранить в DataStore и получать его актуальное значение от туда,
         * но так как тут он хардкодный и получать не от куда, сделал его константой в этом классе
         */
        private const val BEARER_TOKEN =
            "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlSWQiOjE1ODUsImZJZCI6Ikx1dGViMUE5a29rNDkwWUYiLCJzSWQiOjY2LCJpYXQiOjE2OTIxOTMxMzgsImV4cCI6MTY5MzQwMjczOH0.qpknmYHp7mUPHXU53MyknTIBnvmIyBt0IDiUbDan5uY"
    }
}