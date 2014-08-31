package com.example.latitude.ubicarlos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HACKATON on 30/08/2014.
 */
class Adaptador_Promociones extends ArrayAdapter {
    private Context context;
    private ArrayList<c_promociones> datos;

    public Adaptador_Promociones(Context context, ArrayList datos) {
        super(context, R.layout.categorias_view, datos);
        // Guardamos los parámetros en variables de clase.
        this.context = context;
        this.datos = datos;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // En primer lugar "inflamos" una nueva vista, que será la que se
        // mostrará en la celda del ListView. Para ello primero creamos el
        // inflater, y después inflamos la vista.
        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.promociones_view, null);

        // A partir de la vista, recogeremos los controles que contiene para
        // poder manipularlos.
        // Recogemos el ImageView y le asignamos una foto.
        ImageView imagen = (ImageView) item.findViewById(R.id.imagen);
        imagen.setImageResource(datos.get(position).getImagen());

        // Recogemos el TextView para mostrar el nombre y establecemos el
        // nombre.
        TextView nombre = (TextView) item.findViewById(R.id.nombre);
        nombre.setText(datos.get(position).getNombre());

        TextView des = (TextView) item.findViewById(R.id.des);
        des.setText(datos.get(position).descripcion);




        // Devolvemos la vista para que se muestre en el ListView.
        return item;
    }
}
