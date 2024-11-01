package com.example.practicanavegacionapi.core.navigation.login

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun LoginScreen( navigateToHome: ()->Unit ) {

    Column(

        modifier = Modifier.fillMaxSize(), // Asegúrate de que la columna llene el espacio disponible
        horizontalAlignment = Alignment.CenterHorizontally // Alinea horizontalmente al centro
    ) {
        Spacer(modifier = Modifier.weight(1f)) // Espacio inferior
        Text(text = "Login screen", fontSize = 25.sp)
        Spacer(modifier = Modifier.weight(1f)) // Espacio inferior
        Button(onClick = { navigateToHome()}) {
            Text(text = "Ir a home")
        }
        Spacer(modifier = Modifier.weight(1f)) // Espacio inferior al botón
    }
}
