package com.company.listas;

import com.company.Reproduce;
import com.company.Song;

import java.util.List;
import java.util.Stack;

public class ListaBasica implements Reproduce {

    public String listName;
    Stack <Song> miLista;

    public ListaBasica(){
        this.listName=null;
        this.miLista= new Stack<Song>();
    }

    public ListaBasica(String listName, Stack<Song> miLista){
        this.listName=listName;
        this.miLista=miLista;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public Stack getMiLista() {
        return miLista;
    }

    public void setMiLista(Stack<Song> miLista) {
        this.miLista = miLista;
    }

    @Override
    public void reproducir(){
        Song cancion = miLista.pop();

        Stack<Song> listaAux = new Stack();

        listaAux.push(cancion);
        for (Song cancionAux : miLista){
            listaAux.push(cancionAux);
        }

        miLista = listaAux;

        System.out.println("Reproduciendo: " + cancion.toString());
    }

    @Override
    public void addSong(Song cancion){
        this.miLista.push(cancion);
    }

    @Override
    public void removeSong(Song cancion){
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
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
