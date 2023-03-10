package com.example.schoolproject2.ui.elements

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

import com.example.schoolproject2.R


// Text elements
@Composable
fun HeaderText(text: String, modifier: Modifier = Modifier){ // It's Headers
    Text(text = text,
        modifier = modifier,
        style = MaterialTheme.typography.h1,
        color =  colorResource(R.color.black),
        textAlign = TextAlign.Center,
    )
}


@Composable
fun ImportantText(text: String, modifier: Modifier = Modifier){ // It's to highlight some important text
    Text(text = text,
        modifier = modifier,
        style = MaterialTheme.typography.subtitle2,
        color =  colorResource(R.color.important_red),
        textAlign = TextAlign.Left,
        )
}

@Composable
fun BoldText(text: String, modifier: Modifier = Modifier){ // It's to highlight some text
    Text(text = text,
        modifier = modifier,
        style = MaterialTheme.typography.subtitle1,
        color = colorResource(R.color.bold_blue),
        textAlign = TextAlign.Left,
        )
}
@Composable
fun NormText(text: String, modifier: Modifier = Modifier){ // It's text
    Text(text = text,
        modifier = modifier,
        style = MaterialTheme.typography.body1,
        color =  colorResource(R.color.black),
        textAlign = TextAlign.Left,
        )
}




@Composable
fun TextInput(placeholder: String, descText: String, value: String, funny: (String) -> Unit,
              type: KeyboardType = KeyboardType.Text,
              @SuppressLint("ModifierParameter") modifier: Modifier = Modifier) {
    TextField(
        value = value,
        onValueChange = funny,
        maxLines = 1,
        label = { Text(
            text = descText,
            style = MaterialTheme.typography.subtitle1,
        )},
        placeholder = { Text(
            text = placeholder,
            style = MaterialTheme.typography.subtitle1,
        )},
        trailingIcon = { if (type == KeyboardType.Password) {Icon(
            painter = painterResource(id = R.drawable.eye_close),
            contentDescription = null,
            modifier = modifier
                .height(18.dp)
                .padding(top = 2.dp)
        )} else { val ti: @Composable (() -> Unit)? = null}},
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = colorResource(id = R.color.white),
            focusedIndicatorColor = colorResource(id = R.color.login_),
            unfocusedIndicatorColor = colorResource(id = R.color.login_black)),
        textStyle = MaterialTheme.typography.caption,
        keyboardOptions = KeyboardOptions(keyboardType = type),
        visualTransformation = if (type == KeyboardType.Password) { PasswordVisualTransformation() }
        else { VisualTransformation.None },
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
            .padding(top = 23.dp)
    )
}


data class FormModel(val name:String, val type: KeyboardType, val image : Int)

@Composable
fun FormElement(model: FormModel){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement =  Arrangement.Start,
        modifier = Modifier
            .wrapContentHeight()
    ) {
        val userInput = remember { mutableStateOf("") }

        Spacer(modifier = Modifier.width(10.dp))
        Image(
            painter = painterResource(id = model.image),
            contentDescription = "",
            modifier = Modifier
                .width(50.dp)
                .height(50.dp),
            alignment = Alignment.Center

        )
        TextInput(placeholder = model.name, descText = model.name,
            value = userInput.value,
            funny = {userInput.value = it},
            type = model.type)
    }
}