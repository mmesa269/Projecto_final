package com.example.projecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txt_usuario, txt_contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referenciar();
    }

    private void referenciar() {

        txt_usuario = findViewById(R.id.txt_usuario2);
        txt_contraseña = findViewById(R.id.txt_contraseña2);
    }

public void clickIniciarSesion(View view) {
        String PASS = "1234";
        String User = "def";

        String useruser = txt_usuario.getText().toString();
        String passUser = txt_contraseña.getText().toString();

    Toast.makeText(this, passUser, Toast.LENGTH_SHORT).show();
    Toast.makeText(this, useruser, Toast.LENGTH_SHORT).show();

        if (PASS.equals(passUser) && User.equals(useruser)) {
            Intent miIntent = new Intent(this, BusquedaActivity.class);
            startActivity(miIntent);
            finish();
        } else {
            Toast.makeText(this, "No estas en el registro", Toast.LENGTH_SHORT).show();
        }
    }
public void clickCrearSesion(View view) {

            Intent miIntent2 = new Intent(this, CrearCuentaActivity.class);
            startActivity(miIntent2);
            finish();
    }
}

