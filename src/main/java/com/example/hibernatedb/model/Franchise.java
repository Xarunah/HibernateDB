package com.example.hibernatedb.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "franchise")
@Table(name = "franchise")
public class Franchise {


    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
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
   private List<Movie> movies;





    public Franchise(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Franchise() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
