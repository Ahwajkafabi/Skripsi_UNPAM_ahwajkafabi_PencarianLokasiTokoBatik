package com.ahwajkafabi.tokobatikpekalongan.listmovierecyclerview.network


import com.ahwajkafabi.tokobatikpekalongan.ResponseArticles3
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices3 {
    //TODO: Menampilkan semua artikel ensiklopedia
    @GET("discover_location.php")
    fun requestGetArticles3(): Call<ResponseArticles3>

    //TODO: Pencarian artikel berdasarkan kata kunci
    @GET("search_location.php")
    fun requestSearchArticles3(
            @Query("q") keyword: String
    ): Call<ResponseArticles3>
}
