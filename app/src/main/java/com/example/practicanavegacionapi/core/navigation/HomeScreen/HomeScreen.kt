package com.example.practicanavegacionapi.core.navigation.HomeScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.example.practicanavegacionapi.API.CharacterViewModel

@Composable
fun HomeScreen(  navigateToDetail:()-> Unit ,viewModel: CharacterViewModel = viewModel()) {
    LaunchedEffect(Unit) {
        viewModel.getCharacters() // Llamada a la función correcta
    }

// Observa el valor de `characters`
    val characters = viewModel.characters.value

    LazyColumn (horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 10.dp)) {
        items(characters) { personaje ->
            Card (modifier = Modifier.fillMaxWidth()
                .height(200.dp)
                .clickable { navigateToDetail() }
                .padding(vertical = 10.dp),
                elevation = CardDefaults.cardElevation(4.dp),
                colors = CardDefaults.cardColors(Color.White),
                shape = CardDefaults.shape) {
                Column {


                    AsyncImage (modifier = Modifier.fillMaxWidth()
                        .fillParentMaxSize(),
                        model = personaje.image, // URL de la imagen
                        contentDescription = "Imagen de ${personaje.name}")
                    Text(personaje.name, modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun previewHomescreens(){
    HomeScreen(viewModel())
}



/*



    Column(

        modifier = Modifier.fillMaxSize(), // Asegúrate de que la columna llene el espacio disponible
        horizontalAlignment = Alignment.CenterHorizontally // Alinea horizontalmente al centro
    ) {
        Spacer(modifier = Modifier.weight(1f)) // Espacio inferior
        Text(text = "Esta en home", fontSize = 25.sp)
        Spacer(modifier = Modifier.weight(1f)) // Espacio inferior

        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = {navigateToDetail() }) {

        }
        Spacer(modifier = Modifier.weight(1f)) // Espacio inferior al botón
    }

 */