package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.myDiModule
import org.koin.android.ext.android.startKoin

class MyApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(applicationContext, myDiModule)
    }
}