package com.example.projecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FavoritosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
    }
    public void clickABusqueda(View view) {

        Intent miIntent5 = new Intent(this, BusquedaActivity.class);
        startActivity(miIntent5);
        finish();
    }
}