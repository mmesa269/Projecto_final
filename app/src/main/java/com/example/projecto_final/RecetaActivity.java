package com.example.projecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecetaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta);
    }
    public void clickABusqueda3(View view) {

        Intent miIntent7 = new Intent(this, BusquedaActivity.class);
        startActivity(miIntent7);
        finish();
    }
}