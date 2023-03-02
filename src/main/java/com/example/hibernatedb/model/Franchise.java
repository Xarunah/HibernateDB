package com.example.hibernatedb.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity(name = "franchise")
@Table(name = "franchise")
public class Franchise {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
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
   @OneToMany(mappedBy = "franchise")
   private Set<Movie> movies;
}
