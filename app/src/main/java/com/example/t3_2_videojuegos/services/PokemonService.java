package com.example.t3_2_videojuegos.services;

import com.example.t3_2_videojuegos.entities.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PokemonService {

    @GET("pokemons/N00081952")
    Call<List<Pokemon>> getPokemons();

    @POST("pokemons/N00081952/crear")
    Call<Pokemon> postPokemon(@Body Pokemon pokemon);

}
