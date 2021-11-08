package ru.android.mytranslator.application

import android.app.Application
import org.koin.core.context.startKoin
import ru.android.mytranslator.di.application
import ru.android.mytranslator.di.mainScreen


class TranslatorApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(application, mainScreen))
        }
    }
}