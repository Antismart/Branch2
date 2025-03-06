package com.example.branch.data
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {
    @POST("api/login")
    suspend fun login(@Body request: LoginRequest): LoginResponse

    @GET("api/messages")
    suspend fun getMessages(@Header("X-Branch-Auth-Token") token: String): List<Message>
}