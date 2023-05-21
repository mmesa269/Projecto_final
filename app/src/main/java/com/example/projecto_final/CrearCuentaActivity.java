package com.example.projecto_final;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class CrearCuentaActivity extends AppCompatActivity {

    private TextView txt_usuario;
    private TextView txt_contrasena;
    private TextView txt_confirmar_contrasena;

    private String nuevo_usuario;
    private String nuevo_contrasena;
    private String nuevo_confirmar_contrasena;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
    }
    public void clickCrearCuenta(View view) {

        nuevo_usuario = txt_usuario.getText().toString();
        nuevo_contrasena = txt_contrasena.getText().toString();
        nuevo_confirmar_contrasena = txt_confirmar_contrasena.getText().toString();

        if (nuevo_confirmar_contrasena == nuevo_contrasena) {

            MainActivity nueva_cuenta = new MainActivity();
            nueva_cuenta.setnombre_usuario(nuevo_usuario);
            nueva_cuenta.setcontrasena_usuario(nuevo_contrasena);
            nueva_cuenta.setcodigo_usuario(nuevo_usuario.substring(1, 5));

            FirebaseFirestore firestore = FirebaseFirestore.getInstance();
            firestore.collection("Usuario").add(nueva_cuenta);

            Toast.makeText(this, "Cuenta creada exitosamente", Toast.LENGTH_SHORT).show();

            Intent miIntent3 = new Intent(this, BusquedaActivity.class);
            startActivity(miIntent3);
            finish();
        } else
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }
}