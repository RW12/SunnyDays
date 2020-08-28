package com.rebeccawu.sunnydays.framework.injection

import com.rebeccawu.core.GetForecasts
import com.rebeccawu.core.Interactor
import com.rebeccawu.core.data.ForecastsDataSource
import com.rebeccawu.core.data.ForecastsRepository
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

private const val WEATHER_BIT_API_BASE_URL = "https://api.weatherbit.io/v2.0/"

@Module
class SunnyDaysAppModule {

    @Singleton
    @Provides
    fun provideOkHttpClient() = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY })
        .build()

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient) = Retrofit.Builder()
        .baseUrl(WEATHER_BIT_API_BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(MoshiConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()

    @Singleton
    @Provides
    fun provideForecastsDataSource(retrofit: Retrofit) = retrofit.create(ForecastsDataSource::class.java)

    @Singleton
    @Provides
    fun provideForecastsRepository(forecastsDataSource: ForecastsDataSource) = ForecastsRepository(forecastsDataSource)

    @Singleton
    @Provides
    fun provideInteractor(forecastsRepository: ForecastsRepository) = Interactor(GetForecasts(forecastsRepository))
}