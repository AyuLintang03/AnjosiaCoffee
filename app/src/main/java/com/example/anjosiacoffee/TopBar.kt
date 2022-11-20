package com.example.anjosiacoffee

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopBar(){
    val materialcolor = Color(0xFF594545)

    Scaffold(
        topBar = {
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End)
            {
                TopAppBar(title ={
                    Image(painter = painterResource(id = R.drawable.logo),
                        contentDescription ="logo",
                        modifier = Modifier
                            .size(45.dp)
                            .width(80.dp))
                    Text(text = "Anjosia Coffe",fontSize = 20.sp,
                        style = MaterialTheme.typography.h6,
                        modifier = Modifier.padding(start = 10.dp),
                        color = Color.White)
                }, backgroundColor = materialcolor
                )
            }
        }
    ){
        Image(painter = painterResource(id = R.drawable.kopiback), contentDescription = "Kopi" )
    }
}