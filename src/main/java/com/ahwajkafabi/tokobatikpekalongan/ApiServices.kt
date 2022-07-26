package com.ahwajkafabi.tokobatikpekalongan.listmovierecyclerview.network

import com.ahwajkafabi.tokobatikpekalongan.ResponseArticles
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {
    //TODO: Menampilkan semua artikel ensiklopedia
    @GET("discover.php")
    fun requestGetArticles(): Call<ResponseArticles>

    //TODO: Pencarian artikel berdasarkan kata kunci
    @GET("search.php")
    fun requestSearchArticles(
            @Query("q") keyword: String
    ): Call<ResponseArticles>
}
