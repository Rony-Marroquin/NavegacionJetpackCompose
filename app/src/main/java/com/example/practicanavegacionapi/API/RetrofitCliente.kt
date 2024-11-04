package com.example.practicanavegacionapi.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitCliente {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/") // Asegúrate de que esta URL sea correcta
            .addConverterFactory(GsonConverterFactory.create()) // Usa Gson para la conversión
            .build()
    }

    val api2: ApiServiceDBZ by lazy {
        retrofit.create(ApiServiceDBZ::class.java) // Crea la instancia del servicio API
    }
}
