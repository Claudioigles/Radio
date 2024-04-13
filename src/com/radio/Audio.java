package com.radio;
/*
* Crear Super calase Audio
* crear getters y setters
* crear metodo reproducir
* clasificar canciones favoritas
* */

public class Audio {
    private String titulo;
    private int totalDeReproducciones;
    private int totalDeMeGusta;
    private int clasificacion;

    //Creo los metodos

    public void meGusta(){
        this.totalDeMeGusta++;
    }
    public void reproduce(){
        this.totalDeReproducciones++;
    }



    //Creo los getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
