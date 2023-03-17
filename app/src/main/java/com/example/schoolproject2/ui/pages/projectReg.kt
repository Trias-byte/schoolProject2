package com.example.schoolproject2.ui.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.schoolproject2.R
import com.example.schoolproject2.ui.elements.FormModel

@Composable
fun ProjectReg(){
    val enterFormList: List<FormModel> = listOf(
        FormModel("Авторы", KeyboardType.Text, R.drawable.person),
        FormModel("Название проекта", KeyboardType.Password, R.drawable.password),
        FormModel("ФИО руководителя", KeyboardType.Text, R.drawable.person),
        FormModel("Предметная область", KeyboardType.Password, R.drawable.password),
        FormModel("Тема проекта", KeyboardType.Text, R.drawable.person),
        FormModel("Проблемы", KeyboardType.Password, R.drawable.password),
        FormModel("Гипотезы решения проблем", KeyboardType.Text, R.drawable.person),
        FormModel("Краткое содержание проекта", KeyboardType.Password, R.drawable.password),
        FormModel("Актуальность.", KeyboardType.Password, R.drawable.password),
    )
    val margin = 100.dp


}
