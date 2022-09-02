package com.example;

public class Song {
    private String nume;
    private String artist;
    private int durata;

    public Song(String nume,String artist,int durata){
        this.nume = nume;
        this.artist = artist;
        this.durata = durata;
    }

    public String getNume() {
        return nume;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurata() {
        return durata;
    }
}
