package com.example.branch.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.branch.ui.login.LoginScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Login") {
        composable("login") { LoginScreen(navController)}
//        TODO: add message List and Conversation Screens
    }
}