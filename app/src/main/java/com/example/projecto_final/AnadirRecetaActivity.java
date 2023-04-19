package com.example.projecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnadirRecetaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_receta);
    }
    public void clickABusqueda2(View view) {

        Intent miIntent6 = new Intent(this, BusquedaActivity.class);
        startActivity(miIntent6);
        finish();
    }
}