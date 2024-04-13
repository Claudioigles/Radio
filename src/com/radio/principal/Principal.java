package com.radio.principal;

import com.radio.Cancion;
import com.radio.MisFavoritos;
import com.radio.Podcast;

public class Principal {
    //Metodo MAin
    public static void main(String[] args) {
        //Creo nueva intancia
        Cancion miCancion= new Cancion();

        //Invoco a los atrivutos
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");


        Podcast miPodcast= new Podcast();
        miPodcast.setPresentador("Gabriela");
        miPodcast.setTitulo("cafe.tech");

        //Creo metodos me gusta y reproduce para Cancion

        for (int i=0; i<100;i++){
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();

        }
        //Podcast
        for (int i=0; i<100;i++){
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();

        }


        System.out.println("Total de reproducciones: " +miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta"+ miCancion.getTotalDeMeGusta());


        //Instacion
        MisFavoritos favoritos=new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);
    }
}
