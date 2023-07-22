package com.example.dependencyinjectionstart.example2.di

import android.app.Application

class App: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}