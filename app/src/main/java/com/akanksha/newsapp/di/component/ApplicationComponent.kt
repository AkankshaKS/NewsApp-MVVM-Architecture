package com.akanksha.newsapp.di.component

import com.akanksha.newsapp.NewsApplication
import com.akanksha.newsapp.di.ApplicationContext
import com.akanksha.newsapp.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject (newsApplication: NewsApplication)


}