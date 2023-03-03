package com.example.hibernatedb.services;

import com.example.hibernatedb.dto.MovieDTO;
import com.example.hibernatedb.mapper.MovieMapper;
import com.example.hibernatedb.model.Movie;
import com.example.hibernatedb.repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import java.util.Optional;

//Implementation for movie service.

@Slf4j
@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;
    private final MovieMapper MAPPER = MovieMapper.INSTANCE;
    @Override
    public MovieDTO createMovie(MovieDTO movieDTO) {
        Movie movie = MAPPER.convert(movieDTO);
        return MAPPER.convert(movieRepository.save(movie));
    }

    @Override
    public MovieDTO getMovie(String movieId) {
        Optional<Movie> movie = movieRepository.
                findById(Long.parseLong(movieId));
        return MAPPER.
                convert(movie.orElseThrow(() ->
                        new HttpServerErrorException(HttpStatus.NOT_FOUND, "Movie not found.")));

    }

    @Override
    public void deleteMovie(String movieId) {
        movieRepository.deleteById(Long.parseLong(movieId));
    }

    @Override
    public MovieDTO updateMovie(String movieId, MovieDTO movieDTO) {
        Optional<Movie> movie = movieRepository.
                findById(Long.parseLong(movieId));
        if (movie.isEmpty()) {
            throw new HttpServerErrorException(HttpStatus.NOT_FOUND, "Movie not found.");
        }
        Movie movie1 = MAPPER.update(movieDTO, movie.get());
        movie1.setId(Long.parseLong(movieId));
        Movie updatedMovie = movieRepository.save(movie1);
        return MAPPER.convert(updatedMovie);
    }
}
