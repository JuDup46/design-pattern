package fr.hugotiem.designpattern

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun GamePage(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            backgroundColor = colorResource(id = R.color.purple_200),
            elevation = 0.dp,
            title = {
                Text(
                    text = "Game",
                    color = colorResource(id = R.color.white),
                    fontSize = 20.sp
                )
            },
            navigationIcon = {

            }
        )
    }) {

        Column() {
            Row(modifier = Modifier.padding(8.dp)) {
                Text(text = "équipe 1")
                SwitchDemo()
                Text(text = "équipe 2")

            }
            Row() {
                Text(text = "Score équipe 1 :")
                Text(text = " 0")
                Text(text = " Score équipe 2 :")
                Text(text = " 0")
            }

            Row {
                Button2Pts()
                Button3Pts()
            }
        }
    }
}





@Composable
fun SwitchDemo() {
    val checkedState = remember { mutableStateOf(true) }
    Switch(
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it }
    )
}

@Composable
fun Button2Pts() {
    Button(onClick = { /* Do something! */ }, colors = ButtonDefaults.textButtonColors(
        backgroundColor = Color.Red
    ), modifier = Modifier.padding(8.dp),
        shape = CircleShape
    ) {
        Text("+2",
            color = Color.White)
    }
}

@Composable
fun Button3Pts() {
    Button(onClick = { /* Do something! */ }, colors = ButtonDefaults.textButtonColors(
        backgroundColor = Color.Green
    ), modifier = Modifier.padding(8.dp),
        shape = CircleShape
    ) {
        Text("+3",
            color = Color.White)
    }
}
