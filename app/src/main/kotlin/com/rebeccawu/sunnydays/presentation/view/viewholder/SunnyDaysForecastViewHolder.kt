package com.rebeccawu.sunnydays.presentation.view.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rebeccawu.core.domain.Forecast
import com.rebeccawu.sunnydays.R
import com.rebeccawu.sunnydays.databinding.SunnydaysViewForecastBinding

private const val IMAGE_BASE_URL = "https://www.weatherbit.io/static/img/icons/"

class SunnyDaysForecastViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun update(forecast: Forecast?) {
        val resources = view.context.resources
        with(SunnydaysViewForecastBinding.bind(view)) {
            forecastDate.text = forecast?.validDate.toString()
            forecastWindSpeed.text = resources.getString(R.string.m_s, forecast?.windSpd?.toString())
            forecastMaxTemp.text = resources.getString(R.string.deg_C, forecast?.highTemp.toString())
            forecastMinTemp.text = resources.getString(R.string.deg_C, forecast?.lowTemp.toString())
            forecastWindDirection.text = resources.getString(R.string.degrees, forecast?.windDir.toString())

            Glide.with(view.context).load("$IMAGE_BASE_URL${forecast?.weather?.icon}.png").centerCrop().into(forecastIcon)
        }
    }
}