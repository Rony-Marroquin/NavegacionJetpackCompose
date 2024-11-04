package com.example.practicanavegacionapi.API

import kotlinx.serialization.Serializable

@Serializable
data class DBZ_Characters(

    val name: String,
    val image: String,
    val status: String

)
@Serializable
data class ApiResponse(
    val results: List<DBZ_Characters> // Aquí encapsulamos la lista de personajes
)