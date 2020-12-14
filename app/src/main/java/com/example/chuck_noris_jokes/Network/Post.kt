package com.example.chuck_noris_jokes.Network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("type")
    @Expose
    val type: String,
    @SerializedName("value")
    @Expose
    val value: List<Value>
)

data class Value(
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("joke")
    @Expose
    val joke: String,
    @SerializedName("categories")
    @Expose
    val categories: List<String>
)