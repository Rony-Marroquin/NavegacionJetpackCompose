package com.example.practicanavegacionapi.core.navigation.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.sp



@Composable
fun DetailScreen ( navigateback:() -> Unit){


    Column(

        modifier = Modifier.fillMaxSize(), // Asegúrate de que la columna llene el espacio disponible
        horizontalAlignment = Alignment.CenterHorizontally // Alinea horizontalmente al centro
    ) {
        Spacer(modifier = Modifier.weight(1f)) // Espacio inferior
        Text(text = "Esta en home ", fontSize = 25.sp)
        Spacer(modifier = Modifier.weight(1f)) // Espacio inferior

        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateback ()}) {
            Text(text = "ir a HOME")
        }
        Spacer(modifier = Modifier.weight(1f)) // Espacio inferior al botón
    }
}