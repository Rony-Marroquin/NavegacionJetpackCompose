package com.example.practicanavegacionapi.core.navigation

import android.telecom.Call.Details
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.practicanavegacionapi.core.navigation.HomeScreen.HomeScreen
import com.example.practicanavegacionapi.core.navigation.detail.DetailScreen
import com.example.practicanavegacionapi.core.navigation.login.LoginScreen


@Composable
fun NavigationWrapper () {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Login) {

        composable<Login> {
            LoginScreen { navController.navigate(Home) }
        }
        composable<Home> {
            HomeScreen({ navController.navigate(Detail) })


        }

        composable<Detail> {
            DetailScreen()
             {navController.popBackStack()}  }
    }
}

