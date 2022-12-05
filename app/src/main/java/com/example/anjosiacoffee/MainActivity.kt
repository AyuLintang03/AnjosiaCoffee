package com.example.anjosiacoffee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.anjosiacoffee.ui.theme.AnjosiaCoffeeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnjosiaCoffeeTheme {
                val navController = rememberNavController()
                Scaffold(
                    bottomBar = {
                        BottomNavigationBar(
                            items = listOf(
                                BottomNavItem(
                                    name = "Home",
                                    "home",
                                    icon = Icons.Default.Home
                                ),
                                BottomNavItem(
                                    name = "Transaction",
                                    "transaction",
                                    icon = Icons.Default.Star,

                                ),
                                BottomNavItem(
                                    name = "Contact",
                                    "contact",
                                    icon = Icons.Default.Email

                                ),
                            ),
                            navController = navController,
                            onItemClick = {
                                navController.navigate(it.route)
                            }
                        )
                    }

                ) {
                    Navigation(navController = navController)
                }
            }
        }
    }
}

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination= "home") {
        composable("home") {
            HomeScreen()
        }
        composable("transaction") {
            TransactionScreen(navController = navController)
        }
        composable("contact") {
            ContactScreen()
        }
        composable("Pemasukan"){
            Pemasukan()
        }
        composable("penjualan"){
            Penjualan()
        }
        composable("mutasi"){
            Mutasi()
        }
    }
}



@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavHostController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    BottomNavigation (
        modifier = modifier,
        backgroundColor = Color.White,
        elevation = 5.dp) {
        items.forEach { item ->
            val selected = item.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(
                selected = selected,
                onClick = { onItemClick(item) },
                selectedContentColor = MaterialTheme.colors.primary,
                unselectedContentColor = Color.Gray,
                icon =  {
                    Column(horizontalAlignment = CenterHorizontally) {
                        if(item.badgeCount>0) {
                            BadgedBox(
                                badge = { Text(text = "a")}
                            )  {
                                Icon(imageVector = item.icon,
                                    contentDescription = item.name
                                )
                            }
                        } else {
                            Icon(imageVector = item.icon,
                                contentDescription = item.name
                            )
                        }
                        if(selected) {
                            Text(
                                text = item.name,
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp
                            )
                        }
                    }
                }
            )
        }
    }
}

@Preview
@Composable
fun HomeScreen() {
    TopBar()
    CardList()


}
@Composable
fun TransactionScreen(navController: NavController) {
    TopBar()
    Column(
        Modifier
            .padding(
                start = 50.dp,
                top = 250.dp,
                end = 50.dp
            ),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    )
    {

        Button(onClick ={
                        navController.navigate("Pemasukan")

        },
            Modifier.size(width = 250.dp, height = 60.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF815B5B)))
        {
            Text(text = "Pemasukan", color = MaterialTheme.colors.primaryVariant)
        }

        Button(onClick = {
            navController.navigate("Penjualan")
        },
            Modifier.size(width = 250.dp, height = 60.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF815B5B)))
        {
            Text(text = "Penjualan", color = MaterialTheme.colors.primaryVariant)
        }

        Button(onClick = {
            navController.navigate("Mutasi")
        },
            Modifier.size(width = 250.dp, height = 60.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF815B5B)))
        {
            Text(text = "Mutasi", color = MaterialTheme.colors.primaryVariant)
        }
    }
}

@Composable
fun Penjualan() {
    TopBar()
    NavPenjualan()
}

@Composable
fun Pemasukan() {
    NavPengeluaran()
}

@Composable
fun Mutasi() {
    TopBar()
    NavMutasi()

}
@Preview
@Composable
fun ContactScreen() {
    TopBar()
    NavContact()
}
