package com.rebeccawu.sunnydays.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rebeccawu.core.Interactor
import com.rebeccawu.core.domain.Forecast
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

private const val URL_PATH_FORECAST_DAILY = "forecast/daily"
private const val QUERY_PARAM_CITY = "city"
private const val QUERY_VALUE_LOS_ANGELES_CA = "Los Angeles, CA"
private const val QUERY_PARAM_KEY = "key"
private const val QUERY_PARAM_API_KEY = "f5c11f0245ea4d87aa7abcdee3090fad"

class ForecastsViewModel(private val interactor: Interactor) : ViewModel() {
    val loading by lazy { MutableLiveData(false) }
    val forecasts by lazy { MutableLiveData<List<Forecast?>>() }

    init {
        requestForecasts()
    }

    fun requestForecasts() =
        interactor.getForecasts(
            URL_PATH_FORECAST_DAILY,
            mapOf(
                QUERY_PARAM_CITY to QUERY_VALUE_LOS_ANGELES_CA,
                QUERY_PARAM_KEY to QUERY_PARAM_API_KEY
            )
        ).observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .doOnSubscribe {
                loading.value = true
            }
            .doFinally {
                loading.value = false
            }
            .subscribe(
                { forecasts.value = it.data },
                { Log.e("SunnyDaysViewModel", "Error fetching forecasts:\n$it") }
            )
}