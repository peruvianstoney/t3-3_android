package com.example.t3_2_videojuegos.services;

import com.example.t3_2_videojuegos.entities.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PokemonService {

    @GET("pokemons/31931")
    Call<List<Pokemon>> getPokemons();

    @POST("pokemons/31931/crear")
    Call<Pokemon> postPokemon(@Body Pokemon pokemon);

}
