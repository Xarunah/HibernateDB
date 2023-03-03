package com.example.hibernatedb.controllers;


import com.example.hibernatedb.dto.MovieDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movie")
public interface MovieController {

    @PostMapping
    ResponseEntity<MovieDTO> create(@RequestBody MovieDTO movieDTO);

    @GetMapping("/{movieId}")
    ResponseEntity<MovieDTO> get(@PathVariable("movieId") String movieId);

    @DeleteMapping("/{movieId}")
    ResponseEntity<Void> delete(@PathVariable("movieId") String movieId);

    /**
     * Update movie by movie id and by passing updating DTO.
     *
     * @param movieId the franchise id
     * @param franchiseDTO the franchise DTO
     * @return MovieDTO franchise details against the provided id
     * */
    @PatchMapping("/{movieId}")
    ResponseEntity<MovieDTO> update(@PathVariable("movieId") String movieId, @RequestBody MovieDTO movieDTO);

}
