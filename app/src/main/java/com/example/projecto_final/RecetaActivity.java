package com.example.projecto_final;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class RecetaActivity extends AppCompatActivity {

    Switch fav;
    private ArrayList<MainActivity> ListaRecetas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta);
    }

    public void cargarDatos() {
        FirebaseFirestore firestore = FirebaseFirestore.getInstance();
        firestore.collection("Receta").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful()) {

                    for (DocumentSnapshot document : task.getResult()) {

                        MainActivity UserLog = document.toObject(MainActivity.class);
                        ListaRecetas.add(UserLog);
                    }
                } else {
                }
            }
        });
    }

    public void onSwitchClick(View view) {
        if (fav.isChecked()) {
            FirebaseFirestore firestore = FirebaseFirestore.getInstance();
            //update("Receta" :"Favorito" | "Receta", "Si") :Promise<void>
        }


        public void clickABusqueda3 (View view){

            Intent miIntent7 = new Intent(this, BusquedaActivity.class);
            startActivity(miIntent7);
            finish();
        }
    }
}