package com.example.branch.ui.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.branch.data.LoginRequest
import com.example.branch.data.RetrofitInstance
import kotlinx.coroutines.launch

class LoginViewModel: ViewModel() {
    private var authToken: String? = null

    fun login(email: String, password: String, onSuccess: () -> Unit) {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.login(LoginRequest(email, password))
                authToken = response.auth_token
                onSuccess()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}