package com.example.projecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.firestore.FirebaseFirestore;

public class FavoritosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
    }
    FirebaseFirestore firestore = FirebaseFirestore.getInstance();
    //firestore.collection("Receta").get().addOnCompleteListener{

        //if (Receta.Favorito == "Si")
        //}
    public void clickABusqueda(View view) {

        Intent miIntent5 = new Intent(this, BusquedaActivity.class);
        startActivity(miIntent5);
        finish();
    }
}