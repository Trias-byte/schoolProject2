package com.example.schoolproject2

import android.os.Bundle
import androidx.compose.runtime.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

import com.example.schoolproject2.ui.theme.SchoolProject2Theme
import com.example.schoolproject2.ui.elements.*
class MainActivity : ComponentActivity() {
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
                   Main()
                }
            }
        }
    }
}

class Page (){
    var page = 2
    fun change (page: Int)  {
        this.page = page
    }
}
val page = Page()
@Composable
fun Main(){
    val ok by remember {
        mutableStateOf(4)
    }
    Column(
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        TopMenu()
        NowDisplay(page = ok)
        BottomMenu()
    }

}
@Composable
fun NowDisplay(page: Int) {
    when (page) {
        1 -> {
            Enter()
        }
        2 -> {
            RegistrationPart1()
        }
        3 -> {
            RegistrationPart2Student()
        }
        4 -> {
            RegistrationPart2Teacher()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SchoolProject2Theme {
        Main()
    }
}