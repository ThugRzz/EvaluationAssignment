package com.example.evaluationassignment

import android.app.ActivityManager
import android.app.Application
import com.example.evaluationassignment.di.networkModule
import com.example.evaluationassignment.di.providerModule
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        Logger.initialize(localEnabled = BuildConfig.DEBUG)

        if (isMainProcess()) {
            startKoin {
                androidContext(this@Application)
                modules(
                    networkModule,
                    providerModule,
                )
            }
        }
    }

    private fun isMainProcess(): Boolean {
        val pid = android.os.Process.myPid()
        val packageName = packageName
        return getSystemService(ActivityManager::class.java)
            .runningAppProcesses
            ?.any { it.pid == pid && it.processName == packageName }
            ?: false
    }
}