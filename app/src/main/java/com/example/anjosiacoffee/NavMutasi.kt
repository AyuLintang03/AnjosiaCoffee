package com.example.anjosiacoffee

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun NavMutasi(){
    Column(
        Modifier
            .padding(top = 50.dp)
            .verticalScroll(rememberScrollState())
    ) {


        Card(
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .height(200.dp)
                    .padding(16.dp)
            ) {
                Text("Cari Mutasi")
                var title3 by remember { mutableStateOf(TextFieldValue("")) }
                Column(
                    Modifier.padding(top = 40.dp)
                ) {
                    OutlinedTextField(
                        value = title3,
                        label = { Text(text = "Tanggal") },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_outline_date_range_24),
                                contentDescription = "tanggal"
                            )
                        },
                        onValueChange = {
                            title3 = it
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
                            Text(text = "Cari ", color = Color.White)
                        }
                    }
                }


            }
        }
    }

    Box(modifier = Modifier.padding(top = 270.dp) ) {
        Card(
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .height(200.dp)
                    .padding(16.dp)
            ) {
                Text("bulan")

            }
        }
    }
}