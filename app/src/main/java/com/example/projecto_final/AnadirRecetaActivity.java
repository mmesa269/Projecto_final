package com.example.projecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnadirRecetaActivity extends AppCompatActivity {

    private String new_rece_ingredientes;
    private String new_rece_keyword;
    private String new_rece_pasos;

    private String crear_rece_ingredientes;
    private String crear_rece_keyword;
    private String crear_rece_pasos;

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
    public void crearreceta(View view) {

        //crear_rece_ingredientes = new_rece_ingredientes.getText().toString();
        //crear_rece_keyword = new_rece_keyword.getText().toString();
        //crear_rece_pasos = new_rece_pasos.getText().toString();

        Intent miIntent7 = new Intent(this, BusquedaActivity.class);
        startActivity(miIntent7);
        finish();
    }
}