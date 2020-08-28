package com.rebeccawu.sunnydays.presentation.injection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rebeccawu.core.Interactor
import com.rebeccawu.sunnydays.presentation.viewmodel.ForecastsViewModel
import com.rebeccawu.sunnydays.presentation.viewmodel.SunnyDaysViewModelFactory
import com.rebeccawu.sunnydays.presentation.viewmodel.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Provider

@Module
class SunnyDaysViewModelModule {
    @Provides
    fun provideViewModelFactory(
        viewModels: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>
    ): ViewModelProvider.Factory = SunnyDaysViewModelFactory(viewModels)

    @Provides
    @IntoMap
    @ViewModelKey(ForecastsViewModel::class)
    fun provideForecastsViewModel(
        interactor: Interactor
    ): ViewModel = ForecastsViewModel(interactor)
}