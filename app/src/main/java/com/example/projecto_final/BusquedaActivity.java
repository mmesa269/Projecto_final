package com.example.projecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class BusquedaActivity extends AppCompatActivity {

    private String Codigo_coccion, Nombre_coccion, Nombre_ingrediente, Codigo_Pasos, Descripcion_receta, Codigo_receta, Nombre_receta, favorito, fuente_receta, url_imagen_receta;
    private Integer Codigo_ingrediente_principal;
    public void MainActivity_Coccion(){}
    public void MainActivity_Coccion(String Codigo_coccion, String contrasena_usuario) {
        this.Codigo_coccion = Codigo_coccion;
        this.Nombre_coccion = Nombre_coccion;
    }
    public void MainActivity_Ingrediente(){}
    public void MainActivity_Ingrediente(String Nombre_ingrediente, Integer Codigo_ingrediente_principal) {
        this.Nombre_ingrediente = Nombre_ingrediente;
        this.Codigo_ingrediente_principal = Codigo_ingrediente_principal;
    }
    public void MainActivity_Pasos(){}
    public void MainActivity_Pasos(String Codigo_Pasos, String Descripcion_receta) {
        this.Codigo_Pasos = Codigo_Pasos;
        this.Descripcion_receta = Descripcion_receta;
    }
    public void MainActivity_Receta(){}
    public void MainActivity_Receta(String Codigo_Pasos, String Codigo_coccion, Integer Codigo_ingrediente_principal, String Codigo_receta, String Nombre_receta, String favorito, String fuente_receta, String url_imagen_receta) {
        this.Codigo_Pasos = Codigo_Pasos;
        this.Codigo_coccion = Codigo_coccion;
        this.Codigo_ingrediente_principal = Codigo_ingrediente_principal;
        this.Codigo_receta = Codigo_receta;
        this.Nombre_receta = Nombre_receta;
        this.favorito = favorito;
        this.fuente_receta = fuente_receta;
        this.url_imagen_receta = url_imagen_receta;
    }

    public String getCodigo_coccion() {return Codigo_coccion;}
    public void setCodigo_coccion(String Codigo_coccion) {this.Codigo_coccion = "PR" + Nombre_coccion.substring(1, 3);}
    public String getNombre_coccion() {return Nombre_coccion;}
    public void setNombre_coccion(String Nombre_coccion) {this.Nombre_coccion = Nombre_coccion;}
    public String getNombre_ingrediente() {return Nombre_ingrediente;}
    public void setNombre_ingrediente(String Nombre_coccion) {this.Nombre_ingrediente = Nombre_ingrediente;}
    public Integer getCodigo_ingrediente_principal() {return Codigo_ingrediente_principal;}
    public void setCodigo_ingrediente_principal(Integer Codigo_ingrediente_principal) {this.Codigo_ingrediente_principal = Codigo_ingrediente_principal;}
    public String getCodigo_Pasos() {return Codigo_Pasos;}
    public void setCodigo_Pasos(String Codigo_Pasos) {this.Codigo_Pasos = "P" + Codigo_receta;}
    public String getDescripcion_receta() {return Descripcion_receta;}
    public void setDescripcion_receta(String Descripcion_receta) {this.Descripcion_receta = Descripcion_receta;}
    public String getNombre_receta() {return Nombre_receta;}
    public void setNombre_receta(String Nombre_receta) {this.Nombre_receta = Nombre_receta;}
    public String getCodigo_receta() {return Codigo_receta;}
    public void setCodigo_receta(String Codigo_receta) {this.Codigo_receta = Nombre_receta.substring(1, 2) + "01";}
    public String getfavorito() {return favorito;}
    public void setfavorito(String favorito) {this.favorito = favorito;}
    public String getfuente_receta() {return fuente_receta;}
    public void setfuente_receta(String fuente_receta) {this.favorito = fuente_receta;}
    public String geturl_imagen_receta() {return url_imagen_receta;}
    public void seturl_imagen_receta(String url_imagen_receta) {this.url_imagen_receta = url_imagen_receta;}

    private ArrayList<BusquedaActivity> ListaCoccion = new ArrayList<>();
    private ArrayList<BusquedaActivity> ListaIngrediente = new ArrayList<>();
    private ArrayList<BusquedaActivity> ListaPasos = new ArrayList<>();
    private ArrayList<BusquedaActivity> ListaReceta = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);
    }
    public void clickAFav(View view) {

        Intent miIntent3 = new Intent(this, FavoritosActivity.class);
        startActivity(miIntent3);
        finish();
    }
    public void clickNewRec(View view) {

        Intent miIntent4 = new Intent(this, AnadirRecetaActivity.class);
        startActivity(miIntent4);
        finish();
    }

    //public void cargarDatos_Coccion() {
    //FirebaseFirestore firestore = FirebaseFirestore.getInstance();
    //firestore.collection("Coccion").(new OnCompleteListener<QuerySnapshot>();
    //MainActivity_Coccion Cocciones = new MainActivity_Coccion();
    //Cocciones.setCodigo_coccion(firestore.Coccion.Codigo_coccion);
    //Cocciones.setNombre_coccion(firestore.Coccion.Nombre_coccion);
    //}
    //public void cargarDatos_Pasos() {
    //FirebaseFirestore firestore = FirebaseFirestore.getInstance();
    //firestore.collection("Pasos").(new OnCompleteListener<QuerySnapshot>();
    //MainActivity_Pasos Pasos = new MainActivity_Coccion();
    // Pasos.setCodigo_Pasos(firestore.Pasos.Codigo_Pasos);
    // Pasos.setDescripcion_receta(firestore.Pasos.Descripcion_receta);
    //}
    //public void cargarDatos_Ingrediente() {
        //  FirebaseFirestore firestore = FirebaseFirestore.getInstance();
        //  firestore.collection("Ingrediente").(new OnCompleteListener<QuerySnapshot>();
        //  MainActivity_Pasos Ingredientes = new MainActivity_Coccion();
        //  Ingredientes.setNombre_ingrediente(firestore.Ingredientes.Nombre_ingrediente);
        //  Ingredientes.setCodigo_ingrediente_principal(firestore.Ingredientes.Codigo_ingrediente_principal);
        // }
    //public void cargarDatos_Ingrediente() {
        //    FirebaseFirestore firestore = FirebaseFirestore.getInstance();
        //    firestore.collection("Receta").(new OnCompleteListener<QuerySnapshot>();
        //    MainActivity_Pasos Recetas = new MainActivity_Coccion();
        //    Recetas.setCodigo_Pasos(firestore.Receta.Codigo_Pasos);
        //    Recetas.setCodigo_coccion(firestore.Receta.Codigo_coccion);
        //    Recetas.setCodigo_ingrediente_principal(firestore.Receta.Codigo_ingrediente_principal);
        //    Recetas.setCodigo_receta (firestore.Receta.Codigo_receta);
        //    Recetas.setCodigo_receta(firestore.Receta.Codigo_receta);
        //   Recetas.setNombre_receta(firestore.Receta.Nombre_receta);
        //    Recetas.setfavorito(firestore.Receta.favorito);
        //    Recetas.setfuente_receta(firestore.Receta.fuente_receta);
        //    Recetas.seturl_imagen_receta(firestore.Receta.url_imagen_receta);
        //}
    //ListaCoccion = new ArrayList<>();
    //ListaCoccion.add(Cocciones);
    //ListaPasos = new ArrayList<>();
    //ListaPasos.add(Pasos);
    ////ListaIngrediente = new ArrayList<>();
    //ListaIngrediente.add(Ingredientes);
    //ListaReceta = new ArrayList<>();
    //ListaReceta.add(Recetas);
    }