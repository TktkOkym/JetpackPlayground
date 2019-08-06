package com.project.taewon.jetpackplayground.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.project.taewon.jetpackplayground.R
import com.project.taewon.jetpackplayground.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityHomeBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_home)

        // Set up ActionBar
        supportActionBar?.setDisplayShowTitleEnabled(true)
    }
}
