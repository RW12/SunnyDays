package com.rebeccawu.sunnydays.presentation.injection

import com.rebeccawu.sunnydays.presentation.view.SunnyDaysMainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface SunnyDaysMainActivityModule {
    @ContributesAndroidInjector(
        modules = [SunnyDaysForecastsFragmentModule::class]
    )
    fun provideSunnyDaysMainActivity(): SunnyDaysMainActivity
}