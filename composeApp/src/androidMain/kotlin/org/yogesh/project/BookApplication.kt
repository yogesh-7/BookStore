package org.yogesh.project

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.yogesh.project.di.initKoin

class BookApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@BookApplication)
        }
    }
}