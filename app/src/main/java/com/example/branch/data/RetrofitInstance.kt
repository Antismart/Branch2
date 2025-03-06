package com.example.branch.data

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
object RetrofitInstance {
    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://android-messaging.branch.co")
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}