package com.example.hibernatedb.services;

import com.example.hibernatedb.dto.MovieDTO;
import com.example.hibernatedb.mapper.MovieMapper;
import com.example.hibernatedb.model.Movie;
import com.example.hibernatedb.repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.Optional;

///lobam
@Slf4j
@Service
@RequiredArgsConstructor

//this is done
public class MovieService {
    private final MovieRepository movieRepository;
    private final Logger logger = LoggerFactory.getLogger(MovieService.class);

    public MovieDTO findById(Long id) {

        Optional<Movie> movieOptional = movieRepository.findById(id);
        if (movieOptional.isPresent()){
            Movie movie = movieOptional.get();
            return MovieMapper.INSTANCE.convert(movie);
        }

        return null;
    }
    public Collection<MovieDTO> findAll() {
        return MovieMapper.INSTANCE.convert(movieRepository.findAll());
    }

    public Long save(MovieRequest movieRequest) {

        Movie movie = MovieMapper.INSTANCE.convert(movieRequest);
        Movie saved = movieRepository.save(movie);

        return saved.getId();
    }
}
