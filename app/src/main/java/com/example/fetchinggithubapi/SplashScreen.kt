package com.example.fetchinggithubapi

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.fetchinggithubapi.databinding.ActivitySplashScreenBinding
import com.example.fetchinggithubapi.views.SearchActivity

class SplashScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    // Loading Time
    private val SPLASH_TIME_OUT:Long = 3000 // 1 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        binding.constraintLayout
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this,SearchActivity::class.java))

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)
    }
}