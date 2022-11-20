package com.example.anjosiacoffee

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
fun NavPengeluaran(){
    val materialcolor = Color(0xFF594545)

    Scaffold(
        topBar = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            )
            {
                TopAppBar(
                    title = {
                        Image(
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = "logo",
                            modifier = Modifier
                                .size(45.dp)
                                .width(80.dp)
                        )
                        Text(
                            text = "Anjosia Coffe", fontSize = 20.sp,
                            style = MaterialTheme.typography.h6,
                            modifier = Modifier.padding(start = 10.dp),
                            color = Color.White
                        )
                    }, backgroundColor = materialcolor
                )
            }
        }
    )
    {
    }
    Box(
        Modifier
            .fillMaxSize()
            .padding(top = 100.dp)
            .background(Color.White), contentAlignment = Alignment.TopCenter
    ) {

        Text(text = "Pengeluaran",fontSize = 25.sp,
            style = MaterialTheme.typography.h4, textAlign = TextAlign.Center)

        Column(
            Modifier.padding(top = 70.dp)
        ) {
            var text by remember { mutableStateOf(TextFieldValue("")) }
            var text2 by remember { mutableStateOf(TextFieldValue("")) }
            var title3 by remember { mutableStateOf(TextFieldValue("")) }
            var text4 by remember { mutableStateOf(TextFieldValue("")) }
            var text5 by remember { mutableStateOf(TextFieldValue("")) }
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
                label = { Text(text = "Jumlah Barang") },
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.ic_outline_ballot_24), contentDescription = "jumlah")
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