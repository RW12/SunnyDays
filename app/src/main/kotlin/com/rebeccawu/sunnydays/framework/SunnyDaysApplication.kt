package com.rebeccawu.sunnydays.framework

import com.rebeccawu.sunnydays.framework.injection.DaggerSunnyDaysAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class SunnyDaysApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerSunnyDaysAppComponent.create()
}