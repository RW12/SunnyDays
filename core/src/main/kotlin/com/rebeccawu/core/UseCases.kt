package com.rebeccawu.core

import com.rebeccawu.core.data.ForecastsRepository

data class Interactor(
    val getForecasts: GetForecasts
)

class GetForecasts(private val forecastsRepository: ForecastsRepository) {
    operator fun invoke(
        path: String,
        queryMap: Map<String, String>
    ) = forecastsRepository.forecasts(path, queryMap)
}