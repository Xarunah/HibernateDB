package com.example.hibernatedb.controllers.impl;

import com.example.hibernatedb.controllers.MovieController;
import com.example.hibernatedb.dto.CharacterDTO;
import com.example.hibernatedb.dto.MovieDTO;
import org.springframework.http.ResponseEntity;


public class MovieControllerImpl implements MovieController {

    @Override
    public ResponseEntity<MovieDTO> create(MovieDTO movieDTO) {
        return null;
    }

    @Override
    public ResponseEntity<MovieDTO> get(String movieId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(String movieId) {
        return null;
    }

    @Override
    public ResponseEntity<CharacterDTO> update(String characterId, MovieDTO movieDTO) {
        return null;
    }
}
