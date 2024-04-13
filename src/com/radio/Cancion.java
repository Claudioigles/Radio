package com.radio;

//Que atrivutos tienen en comun todas las canciones. Podria ser el album, cantante, genero
public class Cancion extends Audio {//Utilizo el extend para indicar que es hijo de Audio
    private String album;
    private String cantante;
    private String genero;



    //Como para clasificacion quieroi un criterio un poco diferente de clasificar, voy a crear un metodo de sobreescritura ya que en la Clase padre (Audio) ya estaba creado el metodo clasificacion
    @Override
    public int getClasificacion() {
        if(getTotalDeMeGusta()>5000){
            return 8;
        }else{
        return 4;
     }  }
    //Creo los getters y setters


    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
