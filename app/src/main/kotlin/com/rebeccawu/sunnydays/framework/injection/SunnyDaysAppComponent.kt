package com.rebeccawu.sunnydays.framework.injection

import com.rebeccawu.sunnydays.framework.SunnyDaysApplication
import com.rebeccawu.sunnydays.presentation.injection.SunnyDaysMainActivityModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        SunnyDaysMainActivityModule::class,
        SunnyDaysAppModule::class
    ]
)
interface SunnyDaysAppComponent: AndroidInjector<SunnyDaysApplication>