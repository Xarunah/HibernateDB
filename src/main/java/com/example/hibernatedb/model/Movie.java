package com.example.hibernatedb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

//Entity for movie
@Data
@NoArgsConstructor
@Entity(name = "Movie")
@Table(name = "movie")
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "movie_id",
            updatable = false
    )
    private Long id;
    @Column(name = "title",
    nullable = false,
    columnDefinition = "TEXT")

    private String title;

    @Column(name = "genre",
            nullable = false,
            columnDefinition = "TEXT")
    private String genre;

    @Column(name = "realise",
    nullable = false)
    private Integer realise;

    @Column(name = "director" ,
            nullable = false,
            columnDefinition = "TEXT")

    private String director;

    @Column(name = "movie_picture",
            nullable = false,
            columnDefinition = "TEXT")

    private String picture;

    @Column(name = "trailer",
            nullable = false,
            columnDefinition = "TEXT")
    private String trailer;

    //this means that multiple movie can have many characters
    @ManyToMany(mappedBy = "movies")
    @JsonIgnore
    Set<Character> characters;
    //private Set<Character> characters;

    //this map many movie to one franchise
    @ManyToOne
    @JoinColumn(name = "franchise_id")
    private Franchise franchise;

    }



