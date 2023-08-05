package com.akanksha.newsapp

import android.app.Application

class NewsApplication : Application()  {


    override fun onCreate() {
        super.onCreate()
        injectDependencies()

    }

    private fun injectDependencies(){

    }

}