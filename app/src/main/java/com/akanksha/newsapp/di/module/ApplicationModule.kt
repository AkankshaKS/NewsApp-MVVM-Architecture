package com.akanksha.newsapp.di.module

import android.content.Context
import com.akanksha.newsapp.NewsApplication
import com.akanksha.newsapp.di.ApplicationContext
import dagger.Module
import dagger.Provides


@Module
class ApplicationModule(private val newsApplication: NewsApplication) {


    @ApplicationContext
    @Provides
    fun provideContext(): Context {
        return newsApplication
    }
}