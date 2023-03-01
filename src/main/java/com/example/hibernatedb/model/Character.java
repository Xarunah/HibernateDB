package com.example.hibernatedb.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity (name = "Character")
@Table(name = "Character")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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


    public Character() {

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
}



