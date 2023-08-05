package com.akanksha.newsapp

import android.app.Application
import com.akanksha.newsapp.di.component.ApplicationComponent
import com.akanksha.newsapp.di.component.DaggerApplicationComponent
import com.akanksha.newsapp.di.module.ApplicationModule

class NewsApplication : Application()  {

    private lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()

    }

    private fun injectDependencies(){
        applicationComponent = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)

    }

}