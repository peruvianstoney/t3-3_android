package com.example.t3_2_videojuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnListarPokemons = findViewById(R.id.btnListarPokemons);
        Button btnCapturarPokemon = findViewById(R.id.btnCapturarPokemon);

        btnListarPokemons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PokemonListActivity.class);
                startActivity(intent);
            }
        });

        btnCapturarPokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PokemonFormActivity.class);
                startActivity(intent);
            }
        });

    }

}