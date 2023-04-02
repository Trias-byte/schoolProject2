package com.example.schoolproject2.ui.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.schoolproject2.R
import com.example.schoolproject2.Screen
import com.example.schoolproject2.ui.elements.FormModel
import com.example.schoolproject2.ui.elements.*
import com.example.schoolproject2.ui.theme.SchoolProject2Theme

@Composable
fun RegistrationPart1(navController: NavController) {

    val login = remember{ mutableStateOf( "" ) }
    val mail = remember{ mutableStateOf( "" ) }
    val password = rememberSaveable{ mutableStateOf( "" ) }
    val repeatPassword = rememberSaveable{ mutableStateOf( "" ) }

    var teacherImg by remember {
        mutableStateOf( R.drawable.teachers_gray)
    }

    var studentImg by remember {
        mutableStateOf( R.drawable.student)
    }

    val margin = 20.dp
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(margin))
        HeaderText(text = stringResource(id = R.string.Reg_page))

        TextInput(placeholder = "Login", FieldIcon = R.drawable.person,
            value = login.value,
            funny = {login.value = it}
        )

        TextInput(placeholder = "Mail", FieldIcon = R.drawable.mail,
            value = mail.value,
            funny = {mail.value = it}
        )

        TextInput(placeholder = "Password", FieldIcon = R.drawable.password,
            value = password.value,
            funny = {password.value = it},
            type = KeyboardType.Password
        )

        TextInput(placeholder = "Repeat password", FieldIcon = R.drawable.password,
            value = repeatPassword.value,
            funny = {repeatPassword.value = it},
            type = KeyboardType.Password
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = studentImg),
                contentDescription = "studentRole",
                modifier = Modifier
                    .height(50.dp)
                    .clickable {
                        studentImg = R.drawable.student_blue
                        teacherImg = R.drawable.teachers_gray
                    }
            )
            Spacer(modifier = Modifier.width(30.dp))
            NormText(text = "or")
            Spacer(modifier = Modifier.width(30.dp))
            Image(
                painter = painterResource(id = teacherImg),
                contentDescription = "studentRole",
                modifier = Modifier
                    .height(50.dp)
                    .clickable {
                        studentImg = R.drawable.student
                        teacherImg = R.drawable.teachers_red
                    }
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ImportantText(
                text = stringResource(id = R.string.Enter_page),
                modifier = Modifier.clickable {
                    navController.navigate(route = Screen.Enter.route)
                }
            )
            Image(
                painter = painterResource(id = R.drawable.next),
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



// It's old, bad code, but if i know how save mutableState in list i'd want to use it

//@Composable
//fun NRegistrationPart1(navController: NavController){
//    val regFormList: List<FormModel> = listOf(
//        FormModel("login", KeyboardType.Text, R.drawable.person),
//        FormModel("mail", KeyboardType.Email, R.drawable.mail),
//        FormModel("password", KeyboardType.Password, R.drawable.password),
//        FormModel("repeat password", KeyboardType.Password, R.drawable.password),
//    )
//    var teacherImg by remember {
//        mutableStateOf( R.drawable.teachers_gray)
//    }
//
//    var studentImg by remember {
//        mutableStateOf( R.drawable.student)
//    }
//
//    val margin = 20.dp
//    Column(
//        verticalArrangement = Arrangement.SpaceAround,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Spacer(modifier = Modifier.height(margin))
//        HeaderText(text = stringResource(id = R.string.Reg_page))
//        LazyColumn(
//            modifier = Modifier.width(500.dp),
//        ) {
//            items(regFormList.size) { itr ->
//                FormElement(model = regFormList[itr])
//            }
//        }
//        Spacer(modifier = Modifier.height(20.dp))
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.Center,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Image(
//                painter = painterResource(id = studentImg),
//                contentDescription = "studentRole",
//                modifier = Modifier
//                    .height(50.dp)
//                    .clickable {
//                        studentImg = R.drawable.student_blue
//                        teacherImg = R.drawable.teachers_gray
//                    }
//            )
//            Spacer(modifier = Modifier.width(30.dp))
//            NormText(text = "or")
//            Spacer(modifier = Modifier.width(30.dp))
//            Image(
//                painter = painterResource(id = teacherImg),
//                contentDescription = "studentRole",
//                modifier = Modifier
//                    .height(50.dp)
//                    .clickable {
//                        studentImg = R.drawable.student
//                        teacherImg = R.drawable.teachers_red
//                    }
//            )
//        }
//        Spacer(modifier = Modifier.height(20.dp))
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceAround,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            ImportantText(
//                text = stringResource(id = R.string.Enter_page),
//                modifier = Modifier.clickable {
//                    navController.navigate(route = Screen.Enter.route)
//                }
//            )
//            Image(
//                painter = painterResource(id = R.drawable.next),
//                contentDescription = "д",
//                modifier = Modifier
//                    .height(40.dp)
//                    .width(40.dp),
//                alignment = Alignment.CenterEnd
//
//            )
//        }
//        Spacer(modifier = Modifier.height(margin))
//
//    }
//}


@Composable
fun RegistrationPart2Teacher(){
    val regFormList: List<FormModel> = listOf(
        FormModel("full name", KeyboardType.Text, R.drawable.person),
        FormModel("subject", KeyboardType.Text, R.drawable.subject),
    )
    val margin = 100.dp
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(margin))
        HeaderText(text = stringResource(id = R.string.Reg_page))
        LazyColumn(
            modifier = Modifier.width(500.dp),
        ) {
            items(regFormList.size) { itr ->
                FormElement(model = regFormList[itr])
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ImportantText(
                text = stringResource(id = R.string.Enter_page),
                modifier = Modifier.clickable {
                }
            )
            Image(
                painter = painterResource(id = R.drawable.okey),
                contentDescription = "ok",
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
fun RegistrationPart2Student(){
    val regFormList: List<FormModel> = listOf(
        FormModel("full name", KeyboardType.Text, R.drawable.person),
        FormModel("form level", KeyboardType.Number, R.drawable.form),
    )
    val margin = 100.dp
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(margin))
        HeaderText(text = stringResource(id = R.string.Reg_page))
        LazyColumn(
            modifier = Modifier.width(500.dp),
        ) {
            items(regFormList.size) { itr ->
                FormElement(model = regFormList[itr])
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ImportantText(
                text = stringResource(id = R.string.Enter_page),
                modifier = Modifier.clickable {
                }
            )
            Image(
                painter = painterResource(id = R.drawable.okey),
                contentDescription = "ok",
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp),
                alignment = Alignment.CenterEnd

            )
        }
        Spacer(modifier = Modifier.height(margin))

    }
}

@Preview(showBackground = true)
@Composable
fun RegPreview_() {
    SchoolProject2Theme {
        RegistrationPart2Student()
    }
}