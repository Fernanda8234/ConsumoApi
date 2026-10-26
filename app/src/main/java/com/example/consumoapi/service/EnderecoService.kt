package com.example.consumoapi.service

import com.example.consumoapi.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

// comunicação da api
interface EnderecoService { // ponto de contato de coisa diferentes
    @GET("{cep}/json/")
    fun getEnderecoByCep( @Path("cep") cep: String ): Call<Endereco>

    @GET("{uf}/{cidade}/{rua}/json/")
    fun getEnderecoByUfCidadeRua(
        @Path("uf") uf: String,
        @Path("cidade") cidade: String,
        @Path("rua") rua: String
    ): Call<List<Endereco>>

    fun getEnderecosByUfCidadeRua(uf: String, cidade: String, rua: String)
}