package com.example.hibernatedb.model;

import jakarta.persistence.*;

import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "Movie")
@Table(name = "movie")
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

    private String Director;

    @Column(name = "movie_picture",
            nullable = false,
            columnDefinition = "TEXT")

    private String picture;

    @Column(name = "trailer",
            nullable = false,
            columnDefinition = "TEXT")
    private String trailer;

    @ManyToMany
    @JoinColumn(name = "character_id")
    private List<Character> characters;

    public Movie(Long id, String title, String genre, Integer realise, String director, String picture, String trailer) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.realise = realise;
        Director = director;
        this.picture = picture;
        this.trailer = trailer;
    }
// defhjerigtrlohrplh
    public Movie() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getRealise() {
        return realise;
    }

    public void setRealise(Integer realise) {
        this.realise = realise;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", realise=" + realise +
                ", Director='" + Director + '\'' +
                ", picture='" + picture + '\'' +
                ", trailer='" + trailer + '\'' +
                '}';
    }
}


