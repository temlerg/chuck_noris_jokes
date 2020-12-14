package com.example.chuck_noris_jokes.Network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface JSON {
    @GET("/jokes/random/{count}")
    fun getPostWithID(@Path("count") count: Int): Call<Post>
}