package com.example.evaluationassignment

import android.util.Log

object Logger {

    const val HTTP = "OkHttp"
    private var localEnabled: Boolean = true

    fun initialize(
        localEnabled: Boolean,
    ) {
        this.localEnabled = localEnabled
    }

    fun e(tag: String, message: String, e: Throwable? = null) {
        if (localEnabled) {
            Log.e(tag, message, e)
        }
    }

    fun v(tag: String, message: String, e: Throwable? = null) {
        if (localEnabled) {
            Log.v(tag, message, e)
        }
    }

    fun local(tag: String, message: String, e: Throwable? = null) {
        if (localEnabled) {
            Log.v(tag, message, e)
        }
    }
}