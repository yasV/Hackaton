package com.example.latitude.ubicarlos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class promociones extends ActionBarActivity {

    public ArrayList<c_promociones> promocion=new ArrayList<c_promociones>();
    Adaptador_Promociones adapter;
    ListView lvpromo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        promocion.add(new c_promociones("Gimanasio tal", R.drawable.gim, "Descuento en pesas"));
        promocion.add(new c_promociones("Escuela", R.drawable.escuela, "Descuento en clases de ciencias"));
        promocion.add(new c_promociones("Estadio", R.drawable.estadio, "2x1 en estradas para la final"));

        // Inicializamos el adapter.

        lvpromo = (ListView) findViewById(R.id.lv);
        adapter = new Adaptador_Promociones(this,promocion);
        lvpromo.setAdapter(adapter);
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