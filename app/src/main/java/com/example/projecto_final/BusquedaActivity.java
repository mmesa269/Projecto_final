package com.example.projecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BusquedaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);
    }
    public void clickAFav(View view) {

        Intent miIntent3 = new Intent(this, FavoritosActivity.class);
        startActivity(miIntent3);
        finish();
    }
    public void clickNewRec(View view) {

        Intent miIntent4 = new Intent(this, AnadirRecetaActivity.class);
        startActivity(miIntent4);
        finish();
    }
}