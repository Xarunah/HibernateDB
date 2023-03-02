package com.example.hibernatedb.controllers;


import com.example.hibernatedb.dto.MovieDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public interface MovieController {

    @PostMapping
    ResponseEntity<MovieDTO> create(@RequestBody MovieDTO movieDTO);

    @GetMapping("/{movieId}")
    ResponseEntity<MovieDTO> get(@PathVariable("movieId") String movieId);

    @DeleteMapping("/{movieId}")
    ResponseEntity<Void> delete(@PathVariable("movieId") String movieId);

    @PatchMapping("/{movieId}")
    ResponseEntity<MovieDTO> update(@PathVariable("movieId") String characterId, @RequestBody MovieDTO movieDTO);

}
