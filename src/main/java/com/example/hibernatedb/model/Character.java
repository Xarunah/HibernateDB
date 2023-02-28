package com.example.hibernatedb.model;

import jakarta.persistence.*;

import java.util.List;

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

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "character_picture")
    private String picture;



    //this means a character can also apear in multiple movies
    @ManyToMany
    @JoinColumn(name = "movie_id")
    private List<Movie> movies;

    public Character(int id, String name, String alias, Gender gender, String picture) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.gender = gender;
        this.picture = picture;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}



