package com.rebeccawu.sunnydays.presentation.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.rebeccawu.core.domain.Forecast
import com.rebeccawu.sunnydays.R
import com.rebeccawu.sunnydays.presentation.view.viewholder.SunnyDaysForecastViewHolder

class SunnyDaysRecyclerViewAdapter(private val data: List<Forecast?>) :
    ListAdapter<Forecast, SunnyDaysForecastViewHolder>(SunnyDaysRecyclerViewDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SunnyDaysForecastViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.sunnydays_view_forecast, parent, false)
    )

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: SunnyDaysForecastViewHolder, position: Int) {
        holder.update(data[position])
    }
}