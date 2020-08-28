package com.rebeccawu.core.data

class ForecastsRepository(private val forecastsDataSource: ForecastsDataSource) {
    fun forecasts(
        path: String,
        queryMap: Map<String, String>
    ) = forecastsDataSource.forecasts(path, queryMap)
}