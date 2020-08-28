package com.rebeccawu.core.domain

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ForecastResponse(

	@Json(name="country_code")
	val countryCode: String? = null,

	@Json(name="city_name")
	val cityName: String? = null,

	@Json(name="data")
	val data: List<Forecast?>? = null,

	@Json(name="timezone")
	val timezone: String? = null,

	@Json(name="lon")
	val lon: String? = null,

	@Json(name="state_code")
	val stateCode: String? = null,

	@Json(name="lat")
	val lat: String? = null
)

@JsonClass(generateAdapter = true)
data class Weather(

	@Json(name="code")
	val code: Int? = null,

	@Json(name="icon")
	val icon: String? = null,

	@Json(name="description")
	val description: String? = null
)

@JsonClass(generateAdapter = true)
data class Forecast(

	@Json(name="pres")
	val pres: Double? = null,

	@Json(name="moon_phase")
	val moonPhase: Double? = null,

	@Json(name="wind_cdir")
	val windCdir: String? = null,

	@Json(name="moonrise_ts")
	val moonriseTs: Int? = null,

	@Json(name="clouds")
	val clouds: Int? = null,

	@Json(name="low_temp")
	val lowTemp: Double? = null,

	@Json(name="wind_spd")
	val windSpd: Double? = null,

	@Json(name="ozone")
	val ozone: Double? = null,

	@Json(name="pop")
	val pop: Int? = null,

	@Json(name="valid_date")
	val validDate: String? = null,

	@Json(name="datetime")
	val datetime: String? = null,

	@Json(name="precip")
	val precip: Double? = null,

	@Json(name="sunrise_ts")
	val sunriseTs: Int? = null,

	@Json(name="min_temp")
	val minTemp: Double? = null,

	@Json(name="weather")
	val weather: Weather? = null,

	@Json(name="app_max_temp")
	val appMaxTemp: Double? = null,

	@Json(name="max_temp")
	val maxTemp: Double? = null,

	@Json(name="snow_depth")
	val snowDepth: Int? = null,

	@Json(name="sunset_ts")
	val sunsetTs: Int? = null,

	@Json(name="max_dhi")
	val maxDhi: Any? = null,

	@Json(name="clouds_mid")
	val cloudsMid: Int? = null,

	@Json(name="vis")
	val vis: Double? = null,

	@Json(name="uv")
	val uv: Double? = null,

	@Json(name="high_temp")
	val highTemp: Double? = null,

	@Json(name="temp")
	val temp: Double? = null,

	@Json(name="clouds_hi")
	val cloudsHi: Int? = null,

	@Json(name="app_min_temp")
	val appMinTemp: Double? = null,

	@Json(name="moon_phase_lunation")
	val moonPhaseLunation: Double? = null,

	@Json(name="dewpt")
	val dewpt: Double? = null,

	@Json(name="wind_dir")
	val windDir: Int? = null,

	@Json(name="wind_gust_spd")
	val windGustSpd: Double? = null,

	@Json(name="clouds_low")
	val cloudsLow: Int? = null,

	@Json(name="rh")
	val rh: Int? = null,

	@Json(name="slp")
	val seaLevelPressure: Double? = null,

	@Json(name="snow")
	val snow: Int? = null,

	@Json(name="wind_cdir_full")
	val windCdirFull: String? = null,

	@Json(name="moonset_ts")
	val moonsetTs: Int? = null,

	@Json(name="ts")
	val timestamp: Int? = null
)
