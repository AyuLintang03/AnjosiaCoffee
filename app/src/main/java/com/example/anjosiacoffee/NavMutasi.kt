package com.example.anjosiacoffee

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize

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
                    .height(250.dp)
                    .padding(16.dp)
            ) {
                Text("Cari Mutasi")
                var title3 by remember { mutableStateOf(TextFieldValue("")) }
                var mExpanded by remember { mutableStateOf(false) }

                val stransaksi = listOf("Pengeluaran", "Penjualan")

                var mSelectedText by remember { mutableStateOf("") }

                var mTextFieldSize by remember { mutableStateOf(Size.Zero)}
                Column(
                    Modifier.padding(top = 20.dp)
                ) {
                    val icon = if (mExpanded){
                        Icons.Filled.KeyboardArrowUp}
                    else{
                        Icons.Filled.KeyboardArrowDown}


                        OutlinedTextField(
                            value = mSelectedText,
                            onValueChange = { mSelectedText = it },
                            modifier = Modifier
                                .fillMaxWidth()
                                .onGloballyPositioned { coordinates ->
                                    // This value is used to assign to
                                    // the DropDown the same width
                                    mTextFieldSize = coordinates.size.toSize()
                                },
                            label = {Text("Pilih Transaksi")},
                            trailingIcon = {
                                Icon(icon,"contentDescription",
                                    Modifier.clickable { mExpanded = !mExpanded })
                            }
                        )
                        DropdownMenu(
                            expanded = mExpanded,
                            onDismissRequest = { mExpanded = false },
                            modifier = Modifier
                                .width(with(LocalDensity.current){mTextFieldSize.width.toDp()})
                        ) {
                            stransaksi.forEach { label ->
                                DropdownMenuItem(onClick = {
                                    mSelectedText = label
                                    mExpanded = false
                                }) {
                                    Text(text = label)
                                }
                            }
                        }



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

    Box(modifier = Modifier.padding(top = 350.dp) ) {
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