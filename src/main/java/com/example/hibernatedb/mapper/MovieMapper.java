package com.example.hibernatedb.mapper;

import com.example.hibernatedb.dto.MovieDTO;
import com.example.hibernatedb.model.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.Collection;
import java.util.List;

//this is done, make franchise and character mapper like this class

@Mapper
public interface MovieMapper {
//     * Object to initialise the MovieMapper when need to access mapper.
    MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);

    MovieDTO convert(Movie movie);

    Collection<MovieDTO> convert(List<Movie> all);

    Movie convert(MovieDTO movieRequest);

    Movie update(MovieDTO movieDTO, @MappingTarget Movie movie);
}
