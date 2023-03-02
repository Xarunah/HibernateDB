package com.example.hibernatedb.dto;

import com.example.hibernatedb.model.Movie;
import lombok.Data;
import java.util.*;

@Data
public class CharacterDTO {
    private int id;

    private String name;

    private String alias;

    private String gender;

    private String picture;

    private Set<Movie> movies;
}
