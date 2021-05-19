package com.jordivh.hololive_infoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*
class SplashActivity : AppCompatActivity() {
    fun endSplash()=runBlocking{
        delay(2000L)
        val mainIntent = Intent(this@SplashActivity,MainActivity::class.java)
        startActivity(mainIntent)
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        endSplash()
    }
}