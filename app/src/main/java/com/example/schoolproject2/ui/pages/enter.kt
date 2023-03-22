package com.example.schoolproject2.ui.pages


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.schoolproject2.Screen
import com.example.schoolproject2.ui.elements.*



@Composable
fun Enter(
    navController: NavController
){
    val enterFormList: List<FormModel> = listOf(
        FormModel("login", KeyboardType.Text, R.drawable.person),
        FormModel("password", KeyboardType.Password, R.drawable.password),
    )
     val margin = 100.dp
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(margin))
        HeaderText(text = stringResource(id = R.string.Enter_page))
        LazyColumn(
            modifier = Modifier.width(500.dp),
        ) {
            items(enterFormList.size) { itr ->
                FormElement(model = enterFormList[itr])
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ImportantText(
                text = stringResource(id = R.string.Reg_page),
                modifier = Modifier.clickable {
                    navController.navigate(route = Screen.Reg1.route)
                }
            )
            Image(
                painter = painterResource(id = R.drawable.okey),
                contentDescription = "д",
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp),
                alignment = Alignment.CenterEnd

            )
        }
        Spacer(modifier = Modifier.height(margin))

    }
}

@Composable
@Preview
fun EnterScreenPreview(){
    Enter(navController = rememberNavController())
}



