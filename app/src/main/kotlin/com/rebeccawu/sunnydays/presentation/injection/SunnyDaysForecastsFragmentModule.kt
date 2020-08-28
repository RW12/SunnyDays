package com.rebeccawu.sunnydays.presentation.injection

import com.rebeccawu.sunnydays.presentation.view.SunnyDaysForecastFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface SunnyDaysForecastsFragmentModule {
    @ContributesAndroidInjector(modules = [SunnyDaysViewModelModule::class])
    fun provideMyYouTubeCommentsFragment(): SunnyDaysForecastFragment
}