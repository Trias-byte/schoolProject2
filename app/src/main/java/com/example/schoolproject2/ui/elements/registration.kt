package com.example.schoolproject2.ui.elements

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import com.example.schoolproject2.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource


@Composable
fun Registration(){
    Text(text = stringResource(R.string.Reg_page), style = MaterialTheme.typography.h1)
}