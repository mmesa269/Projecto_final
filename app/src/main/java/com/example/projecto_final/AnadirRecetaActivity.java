package com.example.projecto_final;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.firestore.QueryDocumentSnapshot;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class AnadirRecetaActivity extends AppCompatActivity {

    private TextView new_rece_ingredientes;
    private TextView new_rece_pasos;
    private TextView new_rece_nombre;

    private String crear_rece_ingredientes;
    private String crear_rece_pasos;
    private String crear_rece_Codigo_Pasos;
    private String crear_rece_nombre;
    private String crear_rece_favorito;
    private String crear_rece_fuente_receta;
    private String crear_rece_url_imagen_receta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_receta);
    }

    //private void retrieveData() {
        //FirebaseFirestore firestore = FirebaseFirestore.getInstance();
        //firestore.collection("Coccion").get().addOnCompleteListener(task -> {
                    //if (task.isSuccessful()) {
                        //MainActivity ListaCoccion<String> ListaCoccion = new ArrayList<>();
                        //for (QueryDocumentSnapshot document : task.getResult()) {
                            //String value = document.getString("Nombre_Coccion");
                            //ListaCoccion.add(value);
                        //}
                        //populateSpinner(values);
                    //} else {
                        //Log.d(TAG, "Error getting documents: ", task.getException());
                    //}
               // });
    //}

    public void clickABusqueda2(View view) {
        Intent miIntent6 = new Intent(this, BusquedaActivity.class);
        startActivity(miIntent6);
        finish();
    }
    public void crearreceta(View view) {
        crear_rece_ingredientes = new_rece_ingredientes.getText().toString();
        crear_rece_pasos = new_rece_pasos.getText().toString();
        crear_rece_nombre = new_rece_nombre.getText().toString();
        BusquedaActivity nueva_receta = new BusquedaActivity();
        nueva_receta.setCodigo_ingrediente_principal(13);
        nueva_receta.setCodigo_Pasos(crear_rece_pasos);
        nueva_receta.setCodigo_coccion("PSA01");
        nueva_receta.setNombre_receta(crear_rece_nombre);
        nueva_receta.setCodigo_receta(crear_rece_nombre.substring(1, 4));
        nueva_receta.setCodigo_receta("Original");
        nueva_receta.setfavorito("No");
        nueva_receta.seturl_imagen_receta("N/A");
        FirebaseFirestore firestore = FirebaseFirestore.getInstance();
        firestore.collection("Receta").add(nueva_receta);


        Intent miIntent7 = new Intent(this, BusquedaActivity.class);
        startActivity(miIntent7);
        finish();
    }
}