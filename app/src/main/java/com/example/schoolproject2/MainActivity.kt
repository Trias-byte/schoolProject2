package com.example.schoolproject2

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.*

import androidx.compose.material.Surface

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.schoolproject2.ui.theme.SchoolProject2Theme
import com.example.schoolproject2.ui.elements.*
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SchoolProject2Theme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = Color.White
                ) {
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        TopMenu()
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .height(550.dp)
                        ){
                            navController = rememberNavController()
                            SetupNavGraph(navController = navController)
                        }


                        BottomMenu()
                    }

                }
            }
        }
    }
}

