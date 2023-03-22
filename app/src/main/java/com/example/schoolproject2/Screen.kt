package com.example.schoolproject2

sealed class Screen(val route: String){
    object Reg1: Screen("reg_screen")
    object Enter: Screen("enter_screen")
}
