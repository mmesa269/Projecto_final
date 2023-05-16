package com.example.projecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CrearCuentaActivity extends AppCompatActivity {

    private TextView txt_contrasena;

    private TextView txt_confirmar_contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
    }
    public void clickCrearCuenta(View view) {

        if (txt_confirmar_contrasena.getText().toString() == txt_contrasena.getText().toString()) {
            Toast.makeText(this, "Cuenta creada exitosamente", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();

        Intent miIntent3 = new Intent(this, MainActivity.class);
        startActivity(miIntent3);
        finish();
    }
}