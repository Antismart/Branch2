package com.example.branch.data

data class LoginRequest(val username: String, val password: String)
data class LoginResponse(val auth_token: String)
data class Message(
    val id: Int,
    val thread_id: Int,
    val user_id: Int?,
    val agent_id: Int?,
    val body: String,
    val timestamp: String
)
