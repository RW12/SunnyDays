package com.rebeccawu.sunnydays.presentation.view

import android.graphics.Rect
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rebeccawu.core.domain.Forecast
import com.rebeccawu.sunnydays.R
import com.rebeccawu.sunnydays.databinding.SunnydaysFragmentForecastsBinding
import com.rebeccawu.sunnydays.presentation.view.adapter.SunnyDaysRecyclerViewAdapter
import com.rebeccawu.sunnydays.presentation.viewmodel.ForecastsViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SunnyDaysForecastFragment : DaggerFragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val forecastsViewModel: ForecastsViewModel by activityViewModels { viewModelFactory }

    private lateinit var binding: SunnydaysFragmentForecastsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = SunnydaysFragmentForecastsBinding.inflate(inflater)
        .also {
            binding = it
            observeForecasts()
//            TODO
//            initSwipeRefresh()
        }.root

    private fun observeForecasts() {
        forecastsViewModel.loading.observe(viewLifecycleOwner, Observer {
            if (it) {
                binding.forecastsProgressBar.visibility = View.VISIBLE
                binding.forecastsRecyclerView.visibility = View.GONE
            } else {
                binding.forecastsProgressBar.visibility = View.GONE
                binding.forecastsRecyclerView.visibility = View.VISIBLE
//                with(binding.forecastsSwipeRefresh) {
//                    if (isRefreshing) {
//                        isRefreshing = false
//                    }
//                }
                initRecyclerView(forecastsViewModel.forecasts.value)
            }
        })
    }

//    private fun initSwipeRefresh() {
//        with(binding.forecastsSwipeRefresh){
//            setOnRefreshListener {
//                forecastsViewModel.requestForecasts()
//            }
//        }
//    }

    private fun initRecyclerView(items: List<Forecast?>?) {
        with(binding.forecastsRecyclerView) {
            adapter = SunnyDaysRecyclerViewAdapter(items ?: emptyList())
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(object: RecyclerView.ItemDecoration() {
                override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
                    super.getItemOffsets(outRect, view, parent, state)
                    outRect.bottom = resources.getDimensionPixelOffset(R.dimen.itemDecoratorSize)
                }
            })
        }
    }
}