package com.rebeccawu.core.data

import com.rebeccawu.core.domain.ForecastResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.QueryMap
import retrofit2.http.Url

interface ForecastsDataSource {
    @GET
    fun forecasts(
        @Url url: String,
        @QueryMap queryParams: Map<String, String>
    ): Single<ForecastResponse>
}