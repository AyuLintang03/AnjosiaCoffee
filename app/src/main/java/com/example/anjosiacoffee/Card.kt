package com.example.anjosiacoffee

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp

@Composable
fun CardList(){
    val scrollState = rememberScrollState()
    Box(modifier = Modifier.padding( top=30.dp)){
    Row(
        Modifier
            .horizontalScroll(scrollState)
            .padding(top = 50.dp)) {
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
                Text(text = "Kopi Gold")
                Image(painter = painterResource(id = R.drawable.kopigold), contentDescription = "Kopi Gold",
                    Modifier.padding(top=25.dp))

            }
        }
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
                Text(text = "Kopi Platinum")
                Image(painter = painterResource(id = R.drawable.kopiplatinum), contentDescription = "Kopi Platinum",
                    Modifier.padding(top=25.dp))

            }
        }
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
                Text(text = "Kopi Cap Gajah")
                Image(painter = painterResource(id = R.drawable.kopicapgajah), contentDescription = "Kopi Cap Gajah",
                    Modifier.padding(top=25.dp))

            }
        }
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
                Text(text = "Kopi Lanang Kahaga")
                Image(painter = painterResource(id = R.drawable.kopilanangkahaga), contentDescription = "Kopi Lanang Kahaga",
                    Modifier.padding(top=25.dp))

            }
        }


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
                Text(text = "Parfum Kopi")
                Image(painter = painterResource(id = R.drawable.parfumkopi), contentDescription = "Parfum Kopi",
                    Modifier.padding(top=25.dp))

            }
        }
    }
    }
    Column(
        modifier = Modifier.padding(top = 330.dp, start = 100.dp)
    )
    {
        Text(text = "Tentang Palikasi", style = MaterialTheme.typography.h5)

    }
    Box(modifier = Modifier.padding(top = 380.dp)) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            elevation = 10.dp
        ) {
            Column(
                Modifier.padding(15.dp)
            ) {
                Text(
                    buildAnnotatedString {
                        append(
                            "Aplikasi Anjosia Coffe adalah sebuah aplikasi yang" +
                                    " dibunakan untuk mengadministrasi transaksi " +
                                    "penjulanan yang hanya dilakukan oleh staf atau karyawan dari " +
                                    "Anjoshia Coffe. Pada aplikasi ini terdapat fitur yaitu pengeluaran, " +
                                    "pemasukan, dan transaksi"
                        )
                    }
                )

            }
        }
    }

}