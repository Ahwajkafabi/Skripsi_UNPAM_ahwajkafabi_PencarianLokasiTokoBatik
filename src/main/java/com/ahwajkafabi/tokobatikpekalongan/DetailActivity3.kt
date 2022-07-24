package com.ahwajkafabi.tokobatikpekalongan

import android.annotation.TargetApi
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail3)
        setUpComponent()
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    fun setUpComponent(){
        wvContentOfPost.isNestedScrollingEnabled = true
        //TODO: Ambil data dari Intent lalu tampilkan
        tvWikiTitle.text = intent.getStringExtra("TITLE")
        tvWikiWritter.text = "Penulis: ${intent.getStringExtra("WRITTER")}"
        wvContentOfPost.loadData(intent.getStringExtra("POST_CONTENT"), "text/html", null)
        Picasso.get().load(intent.getStringExtra("POSTER_URL")).into(ivWikiPoster)
    }
}