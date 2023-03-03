package com.example.hibernatedb.dto;

import lombok.Data;

import java.util.List;

@Data
public class MovieDTO {
    private Long id;

    private String title;

    private String genre;

    private Integer realise;

    private String director;


    private String picture;
    private String trailer;

    List<CharacterDTO> characters;


    //this map many movie to one franchise
    private FranchiseDTO franchise;
}
