package com.example.schoolproject2.ui.elements

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction

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



private operator fun Boolean.inc() = !this

@Composable
fun TextInput(
    modifier: Modifier = Modifier,
    placeholder: String,
    FieldIcon: Int,
    value: String,
    funny: (String) -> Unit,
    type: KeyboardType = KeyboardType.Text
) {
    if (type != KeyboardType.Password){
    TextField(
        value = value,

        onValueChange = funny,

        maxLines = 1,

        label = { Text(
            text = placeholder,
            style = MaterialTheme.typography.caption,
            color = colorResource(id = R.color.login_black)
        )},

        placeholder = { Text(
            text = placeholder,
            style = MaterialTheme.typography.caption,
        )},

        leadingIcon = {
            Icon(
                painter = painterResource(id = FieldIcon),
                contentDescription = placeholder
            )
        },

        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = colorResource(id = R.color.white),
            focusedIndicatorColor = colorResource(id = R.color.login_),
            unfocusedIndicatorColor = colorResource(id = R.color.login_black)),

        textStyle = MaterialTheme.typography.caption,

        keyboardOptions = KeyboardOptions(
            keyboardType = type,
            imeAction = ImeAction.Go
        ),

        keyboardActions = KeyboardActions(
            onDone = {

            }
        ),

        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
            .padding(top = 23.dp),
    )}
    else{
        PasswordInput(placeholder = placeholder, value = value, funny = funny, FieldIcon = FieldIcon, modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
            .padding(top = 23.dp),)
    }
}

@Composable
fun PasswordInput(
    modifier: Modifier = Modifier,
    placeholder: String,
    FieldIcon: Int,
    value: String,
    funny: (String) -> Unit
){

    var hidePass  by remember { mutableStateOf(true) }

    val icon = if(hidePass)
        painterResource(id = R.drawable.eye_close)
    else
        painterResource(id = R.drawable.eye)

    val desc = if(hidePass)
        "Show password"
    else
        "Hide password"

    TextField(
        modifier = modifier,

        value = value,
        onValueChange = funny,

        placeholder = { Text(
            text = placeholder,
            style = MaterialTheme.typography.caption,
        )},

        label = { Text(
            text = placeholder,
            style = MaterialTheme.typography.caption,
            color = colorResource(id = R.color.login_black)
        )},

        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = colorResource(id = R.color.white),
            focusedIndicatorColor = colorResource(id = R.color.login_),
            unfocusedIndicatorColor = colorResource(id = R.color.login_black)),

        textStyle = MaterialTheme.typography.caption,

        leadingIcon = {
            Icon(
                painter = painterResource(id = FieldIcon),
                contentDescription = placeholder
            )
        },
        trailingIcon = {
            IconButton(onClick = { hidePass++ }) {
                Icon(
                    painter = icon,
                    contentDescription = desc
                )
            }
        },

        visualTransformation =
        if(!hidePass)
            VisualTransformation.None
        else
            PasswordVisualTransformation(),

        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done
        )
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
        TextInput(
            placeholder = model.name,
            value = userInput.value,
            funny = {userInput.value = it},
            type = model.type,
            FieldIcon = model.image
        )
    }
}