package com.company;

import java.util.List;

public interface Reproduce {

    public void reproducir();   //muestra la cancion (artista y album) que se reproduce
    public void addSong(Song cancion);   //agrega una cancion a la Lista de Reproduccion
    public void removeSong(Song cancion);    //elimina una cancion de la Lista de Reproduccion
    public void showList();   //muestra la Lista de Reproduccion
}
