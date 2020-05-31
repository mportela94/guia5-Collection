package com.company;

import com.company.listas.ListaBasica;
import com.company.listas.ListaPremium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 1 - Crear un ArrayList de Canciones

        List <Song> canciones = new ArrayList<>();

        Artist artista = new Artist("Drake", 28, "Canada");
        Artist artistaCollab = new Artist("Jay-Z", 55, "USA");
        Artist artistaVacio = new Artist();

        Album albumDrake=new Album("Scorpion", 2018, artista);


        Song nonStop = new Song("NonStop", 239, "Hip Hop", albumDrake);
        Song elevate = new Song("Elevate", 185, "Hip Hop", albumDrake);
        Song talkUp = new Song("Talk Up", 223, "Hip Hop", artistaCollab, albumDrake);
        Song mobTies = new Song("Mob Ties", 205, "Hip Hop", albumDrake);
        Song blueTint = new Song("Blue Tint", 163, "Hip Hop", albumDrake);


        canciones.add(nonStop);
        canciones.add(elevate);
        canciones.add(talkUp);
        canciones.add(mobTies);
        canciones.add(blueTint);

        //System.out.println(nonStop.toString());

        //EJERCICIO 3
        Stack <Song> listaReproduccion=new Stack<Song>();
        listaReproduccion.push(nonStop);
        listaReproduccion.push(elevate);
        listaReproduccion.push(mobTies);
        listaReproduccion.push(talkUp);

        ListaBasica listaBasica = new ListaBasica("Canciones de Hip Hop", listaReproduccion);

        System.out.println("\nLista BASICA");
        listaBasica.reproducir();
        listaBasica.removeSong(talkUp);
        listaBasica.showList();

        //EJERCICIO 4

        LinkedList<Song> listaReproduccion2=new LinkedList<Song>();
        listaReproduccion2.add(nonStop);
        listaReproduccion2.add(elevate);
        listaReproduccion2.add(mobTies);

        ListaPremium listaPremium = new ListaPremium("Canciones de Hip Hop", listaReproduccion2);

        System.out.println("\nLista PREMIUM");
        listaPremium.reproducir();
        listaPremium.removeSong(elevate);
        listaPremium.showList();

        //FALTA HACER MENU (EJERCICIO 5)
    }
}
