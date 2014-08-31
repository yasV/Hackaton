package com.example.latitude.ubicarlos;

/**
 * Created by HACKATON on 30/08/2014.
 */
public class Categoria
{
    private String nombre;
    private int imagen;

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

    Categoria(String nombre,int imagen)
    {
        this.nombre=nombre;
        this.imagen=imagen;
    }
}

