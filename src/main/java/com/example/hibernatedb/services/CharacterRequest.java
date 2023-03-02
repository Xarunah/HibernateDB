package com.example.hibernatedb.services;

import com.example.hibernatedb.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CharacterRequest {

    private int id;
    private String name;

    private String alias;
    private String gender;
    private String picture;

    private Set<Movie> movies;
}
