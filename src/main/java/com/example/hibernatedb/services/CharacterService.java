package com.example.hibernatedb.services;

import com.example.hibernatedb.model.Character;

public interface CharacterService extends CrudService<Character, Integer> {
    // Extra business logic
    void setMovie(int character_id, int movie_id);
//    void setProject(int studentId, int projectId);
}