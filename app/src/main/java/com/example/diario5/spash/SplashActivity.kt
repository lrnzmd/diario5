package com.example.diario5.spash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.diario5.MainActivity
import com.example.diario5.R

const val SPLASH_DURATION = 2000L

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

    Handler().postDelayed(Runnable {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }, SPLASH_DURATION)

    }
}

