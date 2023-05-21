package com.example.projecto_final;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MainActivity> ListaUsuarios = new ArrayList<>();
    private String nombre_usuario, contrasena_usuario, codigo_usuario;
    private EditText txt_usuario, txt_contrasena;

    public MainActivity(){}
    public MainActivity(String nombre_usuario, String contrasena_usuario, String codigo_usuario) {
        this.nombre_usuario = nombre_usuario;
        this.contrasena_usuario = contrasena_usuario;
        this.codigo_usuario = nombre_usuario.substring(1, 5);
    }
    public String getnombre_usuario() {return nombre_usuario;}
    public void setnombre_usuario(String nombre_usuario) {this.nombre_usuario = nombre_usuario;}
    public String getcontrasena_usuario() {return contrasena_usuario;}
    public void setcontrasena_usuario(String precio) {this.contrasena_usuario = contrasena_usuario;}
    public String getcodigo_usuario() {return codigo_usuario;}
    public void setcodigo_usuario(String codigo_usuario) {this.codigo_usuario = nombre_usuario.substring(1, 5);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();
        referenciar();
    }

    private void referenciar() {

        txt_usuario = findViewById(R.id.txt_usuario2);
        txt_contrasena = findViewById(R.id.txt_contraseña2);
    }

    public void cargarDatos(){
        FirebaseFirestore firestore = FirebaseFirestore.getInstance();
        firestore.collection("Usuario").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful()){

                    for (DocumentSnapshot document : task.getResult()){

                        MainActivity UserLog = document.toObject(MainActivity.class);
                        ListaUsuarios.add(UserLog);
                    }
                }else{
                }
            }
        });
    }
    public void clickIniciarSesion(View view) {

        String PASS = "1234";
        String User = "def";

        String useruser = txt_usuario.getText().toString();
        String passUser = txt_contrasena.getText().toString();

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



