package com.company;

public class Artist {

    protected String name;
    private Integer age;
    private String nationality;

    public Artist(){
    }

    public Artist(String name, int age, String nationality){
        this.name=name;
        this.age=age;
        this.nationality=nationality;
    }

    @Override
    public String toString(){
        return (name);
    }
}
