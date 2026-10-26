package com.example.consumoapi.model

import com.google.gson.annotations.SerializedName

class Endereco {
    data class Endereco (
        val cep: String = "",
        @SerializedName ("logradouro") val rua: String = "", // como vem da api, como eu quero representar
        @SerializedName ("localidade") val cidade: String = "",
        val bairro: String = "",
        val uf: String = "",
    )
}