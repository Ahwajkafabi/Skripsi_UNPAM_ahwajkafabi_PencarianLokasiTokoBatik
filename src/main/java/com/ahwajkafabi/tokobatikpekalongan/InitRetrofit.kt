package com.ahwajkafabi.tokobatikpekalongan.www.listmovierecyclerview.network

import com.ahwajkafabi.tokobatikpekalongan.listmovierecyclerview.network.ApiServices
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class InitRetrofit {
    companion object {
        //api database batik
        val BASE_URL = "https://apibatikpekalongan.000webhostapp.com/";
        //link gambar batik diambil dari api db
        val BASE_URL_IMAGE = "${BASE_URL}images/";
    }

    fun getInit(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    fun getInstance(): ApiServices {
        return getInit().create(ApiServices::class.java)
    }
}
