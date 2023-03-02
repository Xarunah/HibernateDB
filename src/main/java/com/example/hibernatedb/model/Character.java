package com.example.hibernatedb.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity (name = "Character")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "character_id")
    private int id;

    @Column(name = "character_name", length = 30, nullable = false)
    private String name;

    @Column(length = 30)
    private String alias;


    private String gender;

    @Column(name = "character_picture")
    private String picture;

    //this means a character can also appear in multiple movies
//    @ManyToMany
//    @JoinColumn(name = "movie_id")
    @ManyToMany
    @JoinTable(
            name = "character_movies",
            joinColumns = {@JoinColumn(name = "character_id")},
            inverseJoinColumns = {@JoinColumn(name = "movie_id")}
    )
    private Set<Movie> movies;

    public Character(String name, String alias, String gender, String picture, Set<Movie> movies) {
        this.name = name;
        this.alias = alias;
        this.gender = gender;
        this.picture = picture;
        this.movies = movies;
    }

    public Character() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    public void setMovie(Movie movie) {
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", gender='" + gender + '\'' +
                ", picture='" + picture + '\'' +
                ", movies=" + movies +
                '}';
    }

    public java.lang.Character get() {
        return null;
    }
}



