package com.stefanus_ayudha.news_app.presentation

import android.app.Application
import com.stefanus_ayudha.news_app.data.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.core.logger.Level

class App : Application() {

    private val koinModules =
        listOf(
            presentationModule,
            dataModule
        )

    override fun onCreate() {
        super.onCreate()
        startKoin {
            printLogger(Level.DEBUG)
            androidContext(this@App)
            modules(koinModules)
        }
    }

    override fun onTerminate() {
        stopKoin()
        super.onTerminate()
    }
}