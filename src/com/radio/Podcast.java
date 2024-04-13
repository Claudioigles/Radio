package com.radio;

public class Podcast extends Audio{//Podcast es hijo de Audio
    private String presentador;
    private String descripcion;



    //Como para clasificacion quieroi un criterio un poco diferente de clasificar, voy a crear un metodo de sobreescritura ya que en la Clase padre (Audio) ya estaba creado el metodo clasificacion

    @Override
    public int getClasificacion() {
        if(getTotalDeReproducciones()>=2000){
            return 9;
        }else{
            return 2;
        }
    }


    //Creo getters y setters

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
