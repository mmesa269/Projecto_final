package com.example.projecto_final;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class AnadirRecetaActivity extends AppCompatActivity {

    private String new_rece_ingredientes;
    private String new_rece_pasos;

    private String crear_rece_ingredientes;
    private String crear_rece_pasos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_receta);
    }

    private void retrieveData() {
        FirebaseFirestore firestore = FirebaseFirestore.getInstance();

        firestore.collection("Coccion").get().addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        MainActivity ListaCoccion<String> ListaCoccion = new ArrayList<>();
                        for (QueryDocumentSnapshot document : task.getResult()) {
                            String value = document.getString("Nombre_Coccion");
                            ListaCoccion.add(value);
                        }
                        populateSpinner(values);
                    } else {
                        Log.d(TAG, "Error getting documents: ", task.getException());
                    }
                });
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