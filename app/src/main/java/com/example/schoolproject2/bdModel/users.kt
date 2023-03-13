package com.example.schoolproject2.bdModel

data class Subject(
    val name: String
)
data class Users(
    val id: Int,
    val password: Int,
    val login: String,
    val name: String,
    val mail: String,
    val role: String,
)

data class Teachers(
    val id: Int,
    val subjects: Subject,

)

data class Student(
    val id: Int,
    val formLevel: Int,
)