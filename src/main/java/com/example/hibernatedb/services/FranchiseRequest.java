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
public class FranchiseRequest {
    private Integer id;
    private String name;
    private String description;
    private Set<Movie> movies;
}
