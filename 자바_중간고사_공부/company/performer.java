package com.company;

import java.util.List;

public class performer extends Human implements Musician,Actor {
    public void addFilm(String filmName){        this.addFilm(filmName);    }
    public List<String> getFilms(){
        return Films;
    }
    public void setFilms(List<String>films){
        this.Films = Films;
    }
    public String getActingSchool(){
        return actingSchool;
    }
    public void setActingSchool(String actingSchool){
        this.actingSchool = actingSchool;
    }
    public String getMusicSchool() {
        return musicSchool;
    }
    public void setMusicSchool(String musicSchool) {
        this.musicSchool = musicSchool;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public List<String> getSongs() {
        return songs;
    }
    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
    public void setSchool(String School){
        this.School = School;
    }
    public String getSchool(){
        return School;
    }
    private String musicSchool;
    private String actingSchool;
    private String genre;
    private List<String> songs;
    private List<String> Films;
    private String addFilm;
    private String School;
    public int getTimeToLive(){
        return (LIFESPAN-getAge())/2;
    }
    public String toString() {
        return "ab";
    }
    public performer(String name, int age, float height, String musicSchool, String genre,Gender gender){
        super(name,age,height,gender);
        this.musicSchool = musicSchool;
        this.genre = genre;
    }
}
