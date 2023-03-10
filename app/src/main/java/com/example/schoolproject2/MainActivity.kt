package com.example.schoolproject2

import android.os.Bundle
//import androidx.compose.runtime.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.schoolproject2.ui.theme.SchoolProject2Theme
import com.example.schoolproject2.ui.elements.*
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SchoolProject2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NowDisplay(1)
                }
            }
        }
    }
}

@Composable
fun NowDisplay(page: Int) {
//    val nowPageLink by remember { mutableStateOf(1) }
//    val nowPage = when(nowPageLink){
//        1 -> Enter()
//        2 -> Registration()
//        else -> MainPage()
//    }
    Column(
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        TopMenu()
        Enter()
        BottomMenu()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SchoolProject2Theme {
        NowDisplay(1)
    }
}