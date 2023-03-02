package com.example.hibernatedb.services;

import com.example.hibernatedb.model.Character;
import com.example.hibernatedb.model.Franchise;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

// this is done, remember to make two new classes for character and franchise like this class. it maded.finish
public class MovieRequest {

    private String title;

    private String genre;

    private Integer realise;

    private String director;

    private String picture;

    private String trailer;

    private Set<Character> characters;

    private Franchise franchise;
}
