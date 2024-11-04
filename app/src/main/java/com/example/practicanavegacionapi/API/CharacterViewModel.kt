package com.example.practicanavegacionapi.API
import androidx.compose.runtime.mutableStateOf
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class CharacterViewModel : ViewModel() {

    // Corrige la inicialización de `characters` con `mutableStateOf`
    var characters = mutableStateOf<List<DBZ_Characters>>(emptyList())
        private set

    fun getCharacters() {
        viewModelScope.launch {
            try {
                // Log para indicar que la petición está iniciando
                Log.d("API_CALL", "Iniciando petición para obtener personajes")

                // Obtener la respuesta de la API
                val response = RetrofitCliente.api2.getCharacters()

                // Actualiza el estado de characters y loguea los datos recibidos
                characters.value = response.results
                Log.d("API_CALL", "Personajes obtenidos: ${characters.value}")

            } catch (e: Exception) {
                // Manejo de errores con un log
                Log.e("API_CALL", "Error al obtener personajes: ${e.message}")
                e.printStackTrace()
            }
        }
    }
}
