package com.example.schoolproject2.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.schoolproject2.R
import com.example.schoolproject2.ui.theme.SchoolProject2Theme

@Composable
fun TopMenu(){
    Box(
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxWidth()
            .height(110.dp)
            .width(352.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.sc_pr_top),
            contentDescription = "top",
            modifier = Modifier
                .width(292.dp)
                .height(110.dp)
        )
    }
}