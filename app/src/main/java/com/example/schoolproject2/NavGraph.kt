package com.example.schoolproject2

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.example.schoolproject2.ui.pages.*


import com.example.schoolproject2.ui.pages.HomeScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.Enter.route
    ){
        composable(
            route = Screen.Enter.route,

        ){
            Enter(navController = navController)
        }

        composable(
            route = Screen.Reg1.route,

            ){
            RegistrationPart1(navController = navController)
        }
    }
}