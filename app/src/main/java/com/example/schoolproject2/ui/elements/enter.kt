package com.example.schoolproject2.ui.elements


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import com.example.schoolproject2.R
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.schoolproject2.ui.theme.SchoolProject2Theme

@Composable
fun Enter(){
    val enterFormList: List<FormModel> = listOf(
        FormModel("login", KeyboardType.Text, R.drawable.person),
        FormModel("password", KeyboardType.Password, R.drawable.password),
    )

    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderText(text = stringResource(id = R.string.Enter_page))
        Row(horizontalArrangement = Arrangement.SpaceBetween) {
            LazyColumn(
                modifier = Modifier.width(500.dp),

            ) {
                items(enterFormList.size) { itr ->
                    FormElement(model = enterFormList[itr])
                }
            }

            Image(
                painter = painterResource(id = R.drawable.okey),
                contentDescription = "д",
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp),
                alignment = Alignment.CenterEnd

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EnterPreview__() {
    SchoolProject2Theme {
        Enter()
    }
}


