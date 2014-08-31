package com.example.latitude.ubicarlos;

/**
 * Created by LATITUDE on 8/30/2014.
 */
public class c_promociones{

    private String nombre;
    private int imagen;
    public String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    c_promociones(String nombre,int imagen,String des)
    {
        this.nombre=nombre;
        this.imagen=imagen;
        this.descripcion=des;
    }
}
