package com.example.anjosiacoffee

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NavPenjualan() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(top = 100.dp)
            .background(Color.White), contentAlignment = Alignment.TopCenter
    ) {

        Text(text = "Penjualan",fontSize = 25.sp,
            style = MaterialTheme.typography.h4, textAlign = TextAlign.Center)

        Column(
            Modifier.padding(top = 70.dp)
        ) {
            var title by remember { mutableStateOf(TextFieldValue("")) }
            var text by remember { mutableStateOf(TextFieldValue("")) }
            var text2 by remember { mutableStateOf(TextFieldValue("")) }
            var title3 by remember { mutableStateOf(TextFieldValue("")) }
            var text4 by remember { mutableStateOf(TextFieldValue("")) }
            var text5 by remember { mutableStateOf(TextFieldValue("")) }

            OutlinedTextField(
                value = title,
                label = { Text(text =  "Nominal Penjualan") },
                onValueChange = {
                    title = it
                }
            )

            OutlinedTextField(
                value = text,
                label = { Text(text =  "Nominal Pengeluaran") },
                onValueChange = {
                    text = it
                }
            )

            OutlinedTextField(
                value = text2,
                label = { Text(text = "Catatan") },
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.ic_outline_catatan), contentDescription = "catatan")
                },
                onValueChange = {
                    text2 = it
                }

            )

            OutlinedTextField(
                value = title3,
                label = { Text(text = "Tanggal") },
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.ic_outline_date_range_24), contentDescription = "tanggal")
                },
                onValueChange = {
                    title3 = it
                }

            )


            OutlinedTextField(
                value = text4,
                label = { Text(text = "Nama Barang") },
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.ic_outline_all_inbox_24), contentDescription = "Barang")
                },
                onValueChange = {
                    text4 = it
                }

            )

            OutlinedTextField(
                value = text5,
                label = { Text(text = "Nama Pelanggan") },
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.ic_outline_people_24), contentDescription = "pelanggan")
                },
                onValueChange = {
                    text5 = it
                }

            )
            Box(
                Modifier.padding(start = 100.dp, top = 20.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Button(
                    onClick = {
                    })
                {
                    Text(text = "SIMPAN ", color = Color.White)
                }
            }

        }
    }
}