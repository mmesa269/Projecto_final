package com.example.projecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
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

        txt_usuario = findViewById(R.id.txt_usuario);
        txt_contraseña = findViewById(R.id.txt_contraseña);
    }

/*    public void clickIniciarSesion(View view) {
        String PASS = "1234";
        String User = "def";

        String passUser = txt_usuario.getText().toString();
        String useruser = txt_contraseña.getText().toString();

        if (PASS.equals(passUser) && User.equals(useruser)) {
            Intent miIntent = new Intent(this, busqueda_act.class);
            startActivity(busqueda_act.class);
            finish();
        } else {
            Toast.makeText(this, "No estas en el registro", Toast.LENGTH_SHORT).show();
        }
    }*/
}

