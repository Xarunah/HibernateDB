package com.example.hibernatedb.dto;

import lombok.Data;

@Data
public class MovieDTO {
    public MovieDTO(int id, String name, String alias, String gender, String picture) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.gender = gender;
        this.picture = picture;
    }

    private int id;
    private String name;
    private String alias;
    private String gender;
    private String picture;
}
