package com.radio;

public class MisFavoritos {
    //Metodo que me permite adicionar favoritos
    public void adicione(Audio audio){
        if(audio.getClasificacion()>=8){
            System.out.println(audio.getTitulo()+"Es uno de los favoritos");
        }else {
            System.out.println(audio.getTitulo()+"Tambien es uno de los favoritos");
        }
    }
}
