package com.example.hibernatedb.dto;

import com.example.hibernatedb.model.Movie;
import lombok.Data;
import java.util.*; 

@Data
public class FranchiseDTO {
    private Integer id;
    private String name;
    private String description;
    private Set<Movie> movies;
}
