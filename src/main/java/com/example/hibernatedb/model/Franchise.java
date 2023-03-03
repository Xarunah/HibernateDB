package com.example.hibernatedb.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

/**
 * Entity for franchise
 * */
@Data
@NoArgsConstructor
@Entity(name = "franchise")
@Table(name = "franchise")
public class Franchise {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    @Column(
            name = "franchise_id",
            updatable = false
    )
    private Integer id;

    @Column(name = "name",
            nullable = false,
            columnDefinition = "TEXT")
    private String name;

    @Column(name = "description",
            nullable = false,
            columnDefinition = "TEXT")
    private String description;

    //this map one franchise to many movie
   @OneToMany(targetEntity = Movie.class)
   private Set<Movie> movies;
}
