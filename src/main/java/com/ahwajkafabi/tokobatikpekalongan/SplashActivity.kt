package com.ahwajkafabi.tokobatikpekalongan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //TODO: Delay selama 2 detik lalu pindah ke MainActivity
        Timer("splahDisappear", true).schedule(2000){
            startActivity(Intent(this@SplashActivity, MainActivity2::class.java))
            finish()
        }
    }
}