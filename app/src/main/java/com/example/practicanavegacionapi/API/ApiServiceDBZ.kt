package com.example.practicanavegacionapi.API

import retrofit2.http.GET

interface ApiServiceDBZ {
    @GET("character") // Asegúrate de que esta ruta sea correcta y no tenga la barra inicial
    suspend fun getCharacters(): ApiResponse // Retorna ApiResponse que contiene la lista de personajes
}
