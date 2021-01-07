package com.barasan.myapp02

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TodoService {
    @GET("/todos/{userId}")
    fun get(@Path("userId") userId: Int) : Call<Todo>

    @GET("/todos/{userId}")
    suspend fun getSuspend(@Path("userId") userId: Int) : Todo
}