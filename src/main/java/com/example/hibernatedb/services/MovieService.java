package com.example.hibernatedb.services;

import com.example.hibernatedb.dto.MovieDTO;
import org.springframework.stereotype.Service;

@Service
public interface MovieService {

    MovieDTO createMovie(MovieDTO movieDTO);

    MovieDTO getMovie( String movieId);

    void deleteMovie(String movieId);

    MovieDTO updateMovie( String movieId, MovieDTO movieDTO);

}
