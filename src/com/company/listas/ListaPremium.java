package com.company.listas;

import com.company.Reproduce;
import com.company.Song;

import java.util.LinkedList;
import java.util.List;

public class ListaPremium implements Reproduce {

    private String listName;
    List<Song> miLista;

    public ListaPremium(){
        this.listName=null;
        this.miLista=new LinkedList<Song>();
    }

    public ListaPremium(String listName, LinkedList<Song> miLista){
        this.listName=listName;
        this.miLista=miLista;
    }

    @Override
    public void reproducir(){
        Song cancionActual=new Song();
        if (miLista != null) {
            cancionActual = (Song) miLista.get(0);
        }
        System.out.println("Reproduciendo: " + cancionActual.toString());;
    }

    @Override
    public void addSong(Song cancion){
        miLista.add(cancion);
    }

    @Override
    public void removeSong(Song cancion){
        miLista.remove(cancion);
    }

    @Override
    public void showList(){
        System.out.println("\nList Name: " + listName);
        int count=0;
        for (Song cancion : miLista){
            System.out.println(count + ":" + cancion.toString());
            count++;
        }
    }
}
