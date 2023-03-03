package com.example.hibernatedb.controllers.impl;

import com.example.hibernatedb.controllers.MovieController;
import com.example.hibernatedb.dto.MovieDTO;
import com.example.hibernatedb.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation for movie controller. Controller is responsible for accepting the 
 * Http requests from the client and respond them accordingly. 
 * */
@RequiredArgsConstructor
@RestController
public class MovieControllerImpl implements MovieController {
    private final MovieService movieService;
    
    
    @Override
    public ResponseEntity<MovieDTO> create(MovieDTO movieDTO) {
        return ResponseEntity.ok(movieService.createMovie(movieDTO));
    }

    @Override
    public ResponseEntity<MovieDTO> get(String movieId) {
        return ResponseEntity.ok(movieService.getMovie(movieId));
    }

    @Override
    public ResponseEntity<Void> delete(String movieId) {
        movieService.deleteMovie(movieId);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<MovieDTO> update(String movieId, MovieDTO movieDTO) {
        return ResponseEntity.ok(movieService.updateMovie(movieId, movieDTO));
    }
}
