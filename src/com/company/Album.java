package com.company;

public class Album {

    protected String title;
    protected Integer year;
    protected Artist artist;

    public Album(){
    }

    public Album(String title, int year, Artist artist){
        this.title=title;
        this.year=year;
        this.artist=artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return (this.artist.toString() + " - Title: " + title + " - Year: " + year);
    }

}
