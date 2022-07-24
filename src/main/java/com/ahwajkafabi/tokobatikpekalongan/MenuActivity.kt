package com.ahwajkafabi.tokobatikpekalongan

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    var arrList = arrayOf("Peta Toko","Model Batik","Map Toko","Tentang Aplikasi","Keluar")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        circle_menu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.menu,R.drawable.pkl)
            .addSubMenu(Color.parseColor("#25BCFE"),R.drawable.peta)
            .addSubMenu(Color.parseColor("#6D4C41"),R.drawable.modelbaju)
            .addSubMenu(Color.parseColor("#ff0000"),R.drawable.shopkeranjang)
            .addSubMenu(Color.parseColor("#1a237e"),R.drawable.aboutimages)
            .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.m_icon_logout)
            .setOnMenuSelectedListener {
                    index -> Toast.makeText(this,"Selected" +arrList[index], Toast.LENGTH_SHORT).show()
                when(arrList[index])
                {
                    "Peta Toko" -> {
                        val intent = Intent(this, PetabatikActivity :: class.java)
                        startActivity(intent)
                    }
                }
            }
            .setOnMenuSelectedListener {
                    index -> Toast.makeText(this,"Selected" +arrList[index], Toast.LENGTH_SHORT).show()
                when(arrList[index])
                {
                    "Model Batik" -> {
                        val intent = Intent(this, SplashActivity :: class.java)
                        startActivity(intent)
                    }
                }
            }
            .setOnMenuSelectedListener {
                    index -> Toast.makeText(this,"Selected" +arrList[index], Toast.LENGTH_SHORT).show()
                when(arrList[index])
                {
                    "Map Toko" -> {
                        val intent = Intent(this, SplashActivity3 :: class.java)
                        startActivity(intent)
                    }
                }
            }
            .setOnMenuSelectedListener {
                    index -> Toast.makeText(this,"Selected" +arrList[index], Toast.LENGTH_SHORT).show()
                when(arrList[index])
                {
                    "Tentang Aplikasi" -> {
                        val intent = Intent(this, AboutActivity :: class.java)
                        startActivity(intent)
                    }
                }
            }
            .setOnMenuSelectedListener {
                    index -> Toast.makeText(this,"Selected" +arrList[index], Toast.LENGTH_SHORT).show()
                when(arrList[index])
                {
                    "Keluar" -> {
                        val intent = Intent(this, finish() :: class.java)
                        startActivity(intent)
                    }
                }
            }
    }
}