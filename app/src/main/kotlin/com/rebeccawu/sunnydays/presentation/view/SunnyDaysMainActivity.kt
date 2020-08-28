package com.rebeccawu.sunnydays.presentation.view

import android.os.Bundle
import androidx.fragment.app.commit
import com.rebeccawu.sunnydays.R
import dagger.android.support.DaggerAppCompatActivity

class SunnyDaysMainActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sunnydays_activity_main)
        supportFragmentManager.commit { replace(R.id.mainFragmentContainer, SunnyDaysForecastFragment()) }
    }
}