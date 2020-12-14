package com.example.chuck_noris_jokes.Network

import com.example.chuck_noris_jokes.Network.NetworkService
import com.example.chuck_noris_jokes.Network.Post
import retrofit2.Call


class Repository {
    fun getJoke (quantity: Int): Call<Post> {
        return NetworkService.getApiRepositories().getPostWithID(quantity)
    }
}