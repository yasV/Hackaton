package com.example.latitude.ubicarlos;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class Categorita_Actividad extends ActionBarActivity {
    public ArrayList<Categoria> lista_categoria=new ArrayList<Categoria>();
    Adaptador_Categorias adapter;
    ListView lvcategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        lista_categoria.add(new Categoria("banco",R.drawable.banco));
        lista_categoria.add(new Categoria("cruz roja",R.drawable.cruzroja));
        lista_categoria.add(new Categoria("escuela",R.drawable.escuela));
        lista_categoria.add(new Categoria("estadio",R.drawable.estadio));
        lista_categoria.add(new Categoria("farmacia",R.drawable.farmacia));
        lista_categoria.add(new Categoria("ferreteria",R.drawable.ferreteria));
        lista_categoria.add(new Categoria("gimnasio",R.drawable.gim));
        lista_categoria.add(new Categoria("hospital",R.drawable.hospital));
        lista_categoria.add(new Categoria("hotel",R.drawable.hotel));
        lista_categoria.add(new Categoria("ina",R.drawable.ina));
        lista_categoria.add(new Categoria("internet",R.drawable.internet));
        lista_categoria.add(new Categoria("psicinas",R.drawable.piscinas));
        lista_categoria.add(new Categoria("restaurante",R.drawable.restaurante));
        lista_categoria.add(new Categoria("supermercado",R.drawable.supermercado));
        lista_categoria.add(new Categoria("terminal",R.drawable.terminal));
        lista_categoria.add(new Categoria("universidad",R.drawable.universidad));
        lista_categoria.add(new Categoria("banco",R.drawable.veterinario));
        lista_categoria.add(new Categoria("banco",R.drawable.zapateria));
        lista_categoria.add(new Categoria("banco",R.drawable.zoologico));
        // Inicializamos el adapter.

        lvcategoria = (ListView) findViewById(R.id.lv);
        adapter = new Adaptador_Categorias(this, lista_categoria);
        lvcategoria.setAdapter(adapter);
// Asignamos el Adapter al ListView, en este punto hacemos que el
// ListView muestre los datos que queremos.


        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

