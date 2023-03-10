package com.example.schoolproject2.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp
import com.example.schoolproject2.R


@Composable
fun BottomMenu(){
    var menuVisibility by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxWidth()
            .height(110.dp)
            .width(352.dp)
            ) {
        if (menuVisibility) {
            Menu()
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent),

            horizontalArrangement = Arrangement.End
        ){
            Image(
                painter = painterResource(id = R.drawable.sc_pr_botom),
                contentDescription = "bottom",
                modifier = Modifier
                    .width(292.dp)
                    .height(110.dp)
                    .clickable {
                        ++menuVisibility
                    }
            )
        }


    }
}

private operator fun Boolean.inc() = !this


@Composable
fun Menu(){
    val lstRes: Array<Int> = arrayOf( R.drawable.teachers_icon, R.drawable.home_icon)
    Row(
        modifier = Modifier
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically

    ) {
        for (iconRes in lstRes) {
        Box(
            Modifier.clickable{

            },
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier
                    .width(20.dp)
                    .height(25.dp),
                painter = painterResource(id = iconRes),
                contentDescription = "teachers_icon"
            )

            Image(
                modifier = Modifier
                    .size(40.dp),
                painter = painterResource(id = R.drawable.background_ellipse_menu),
                contentDescription = "background_ellipse"
            )

        }

        }
    }

}
