package com.example.hibernatedb.services;

import com.example.hibernatedb.model.Movie;
import com.example.hibernatedb.repositories.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Slf4j
@Service
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;
    private final Logger logger = LoggerFactory.getLogger(MovieServiceImpl.class);

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie findById(Integer integer) {
        return null;
    }

    @Override
    public Collection<Movie> findAll() {
        return null;
    }

    @Override
    public Movie add(Movie entity) {
        return null;
    }

    @Override
    public Movie update(Movie entity) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Movie entity) {

    }
}
