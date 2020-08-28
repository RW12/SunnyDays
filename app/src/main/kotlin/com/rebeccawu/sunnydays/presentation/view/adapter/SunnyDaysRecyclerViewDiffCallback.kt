package com.rebeccawu.sunnydays.presentation.view.adapter

import androidx.recyclerview.widget.DiffUtil
import com.rebeccawu.core.domain.Forecast

class SunnyDaysRecyclerViewDiffCallback : DiffUtil.ItemCallback<Forecast>() {
    override fun areItemsTheSame(oldItem: Forecast, newItem: Forecast) = oldItem == newItem

    override fun areContentsTheSame(oldItem: Forecast, newItem: Forecast) = oldItem == newItem

}