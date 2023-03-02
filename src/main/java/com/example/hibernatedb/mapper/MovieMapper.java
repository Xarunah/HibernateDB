package com.example.hibernatedb.mapper;

import com.example.hibernatedb.dto.MovieDTO;
import com.example.hibernatedb.model.Movie;
import com.example.hibernatedb.services.MovieRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Collection;
import java.util.List;

//this is done, make franchise and character mapper like this class

@Mapper
public interface MovieMapper {

    MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);

    MovieDTO convert(Movie movie);

    Collection<MovieDTO> convert(List<Movie> all);

    Movie convert(MovieRequest movieRequest);

}
