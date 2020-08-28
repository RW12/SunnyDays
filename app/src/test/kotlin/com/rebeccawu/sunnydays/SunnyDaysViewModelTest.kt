package com.rebeccawu.sunnydays

import com.rebeccawu.core.GetForecasts
import com.rebeccawu.core.Interactor
import com.rebeccawu.core.domain.Forecast
import com.rebeccawu.core.domain.ForecastResponse
import com.rebeccawu.sunnydays.presentation.viewmodel.ForecastsViewModel
import io.kotest.matchers.beOfType
import io.kotest.matchers.should
import io.mockk.every
import io.mockk.mockk
import io.reactivex.Single
import org.junit.Test

private const val URL_PATH_FORECAST_DAILY = "forecast/daily"
private const val QUERY_PARAM_CITY = "city"
private const val QUERY_VALUE_LOS_ANGELES_CA = "Los Angeles, CA"
private const val QUERY_PARAM_KEY = "key"
private const val QUERY_PARAM_API_KEY = "f5c11f0245ea4d87aa7abcdee3090fad"

//TODO
class SunnyDaysViewModelTest {

    @Test
    fun `forecasts LiveData - carries list of Forecast data`() {
        //arrange
        val mockGetForecasts = mockk<GetForecasts>(relaxed = true)
        val testInteractor = Interactor(mockGetForecasts)
        val forecastsViewModel = ForecastsViewModel(testInteractor)
        val mockkForecastsResponse = mockk<ForecastResponse>()
        every {
            mockGetForecasts.invoke(
                URL_PATH_FORECAST_DAILY,
                mapOf(
                    QUERY_PARAM_CITY to QUERY_VALUE_LOS_ANGELES_CA,
                    QUERY_PARAM_KEY to QUERY_PARAM_API_KEY
                )
            )
        } answers { Single.just(mockkForecastsResponse) }

        //act
        val data = forecastsViewModel.forecasts.value

        //assert
        data should beOfType(List::class)
        data?.get(0) should beOfType(Forecast::class)
    }
}