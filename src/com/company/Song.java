package com.company;

public class Song{

    private String name;
    private Integer duration;
    private String genero;
    private Artist artistaInvitado;
    private Album album;

    public Song(){
    }

    public Song(String songName, Integer songDuration, String genero, Artist artistaInvitado, Album album){
        this.name=songName;
        this.duration=songDuration;
        this.genero=genero;
        this.artistaInvitado = artistaInvitado;
        this.album=album;
    }

    public Song(String songName, Integer songDuration, String genero, Album album){
        this.name=songName;
        this.duration=songDuration;
        this.genero=genero;
        this.album=album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Artist getArtistaInvitado() {
        return artistaInvitado;
    }

    public void setArtistaInvitado(Artist artistaInvitado) {
        this.artistaInvitado = artistaInvitado;
    }

    @Override
    public String toString(){
        String cancion;
        String invitado= "";

        if (artistaInvitado != null) {
            invitado = (" -ft " + artistaInvitado.name);
        }

        cancion= (" " + this.name + invitado + " - Duration: " + this.duration + " - Genre: " + this.genero + " - " + album.toString());

        return cancion;
    }


}
