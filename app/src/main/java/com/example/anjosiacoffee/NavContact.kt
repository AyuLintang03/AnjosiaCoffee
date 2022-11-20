package com.example.anjosiacoffee

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun NavContact(){
    val context = LocalContext.current
    Text(text = "Hubungi Kami",
        Modifier.padding(start = 110.dp, top = 70.dp), style = MaterialTheme.typography.h5)
    Column(
        Modifier.padding(top = 120.dp)
    ) {

        Card(

            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .border(
                    width = 3.dp,
                    color = MaterialTheme.colors.primary,
                    shape = RoundedCornerShape(10.dp)
                )
        ) {
            Box(contentAlignment = Alignment.CenterStart ) {
                Column(Modifier.padding(start = 10.dp, top = 30.dp)) {

                    Text(text = "Panca Fadilah")
                    Text(text = "Project Manager")
                    Button(onClick = {
                        context.gmail(to = "Fadilahpanca@gmail.com", subject = "Some subject")
                    }) {
                        Text(text = "Hubungi")
                    }
                }
            }
            Box(contentAlignment = Alignment.TopEnd) {
                Image(
                    painter = painterResource(id = R.drawable.panca), contentDescription = "panca",
                    contentScale = ContentScale.Crop, modifier = Modifier
                        .padding(top = 20.dp, bottom = 20.dp, end = 20.dp)
                        .size(100.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                )
            }
        }
        Card(

            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .border(
                    width = 3.dp,
                    color = MaterialTheme.colors.primary,
                    shape = RoundedCornerShape(10.dp)
                )
        ) {
            Box(contentAlignment = Alignment.CenterEnd ) {
                Column(Modifier.padding(end = 10.dp, top = 30.dp)) {

                    Text(text = "Alfiana Feristia Khasturi")
                    Text(text = "Front-End")
                    Button(onClick = {
                        context.gmail(to = "Alfiana_Feristia_khasturi@teknokrat.ac.id", subject = "Some subject")
                    }) {
                        Text(text = "Hubungi")
                    }
                }
            }
            Box(contentAlignment = Alignment.TopStart) {
                Image(
                    painter = painterResource(id = R.drawable.alfiana), contentDescription = "panca",
                    contentScale = ContentScale.Crop, modifier = Modifier
                        .padding(top = 20.dp, bottom = 20.dp, start = 20.dp)
                        .size(100.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                )
            }
        }


        Card(

            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .border(
                    width = 3.dp,
                    color = MaterialTheme.colors.primary,
                    shape = RoundedCornerShape(10.dp)
                )
        ) {
            Box(contentAlignment = Alignment.CenterStart ) {
                Column(Modifier.padding(start = 10.dp, top = 30.dp)) {

                    Text(text = "Ayu Lintang Pangestu")
                    Text(text = "Back-End")
                    Button(onClick = {context.gmail(to = "ayulintang95@gmail.com", subject = "Some subject")
                    }) {
                        Text(text = "Hubungi")
                    }
                }
            }
            Box(contentAlignment = Alignment.TopEnd) {
                Image(
                    painter = painterResource(id = R.drawable.ayu), contentDescription = "panca",
                    contentScale = ContentScale.Crop, modifier = Modifier
                        .padding(top = 20.dp, bottom = 20.dp, end = 20.dp)
                        .size(100.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                )
            }
        }
    }
}


fun Context.gmail(to: String, subject: String) {
    try {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "vnd.android.cursor.item/email" // or "message/rfc822"
        intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(to))
        intent.putExtra(Intent.EXTRA_SUBJECT, subject)
        startActivity(intent)
    } catch (e: ActivityNotFoundException) {
        // TODO: Handle case where no email app is available
    } catch (t: Throwable) {
        // TODO: Handle potential other type of exceptions
    }
}