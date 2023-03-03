package com.example.hibernatedb.controllers;

import com.example.hibernatedb.dto.MovieDTO;
import com.example.hibernatedb.model.Movie;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Controller for creating, updating, retrieving and delete the Franchise.

@RestController
@RequestMapping("/api/movie")
public interface MovieController {

    @PostMapping
    ResponseEntity<MovieDTO> create(@RequestBody MovieDTO movieDTO);

    @Operation(summary = "Get movie by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Success",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Movie.class)) }),
            @ApiResponse(responseCode = "404",
                    description = "Movie does not exist with supplied ID",
                    content = @Content)
    })
    @GetMapping("/{movieId}")
    ResponseEntity<MovieDTO> get(@PathVariable("movieId") String movieId);

    @Operation(summary = "Delete movie by ID")
    @ApiResponse(responseCode = "200", description = "Movie deleted")
    @ApiResponse(responseCode = "400", description = "Invalid input")
    @ApiResponse(responseCode = "404", description = "Movie not found")
    @DeleteMapping("/{movieId}")
    ResponseEntity<Void> delete(@PathVariable("movieId") String movieId);

    /**
     * Update movie by movie id and by passing updating DTO.
     * @param movieId the franchise id
     * @param franchiseDTO the franchise DTO
     * @return MovieDTO franchise details against the provided id
     * */
    @Operation(summary = "Updates movie")
    @ApiResponses( value = {
            @ApiResponse(responseCode = "204",
                    description = "Movie successfully updated",
                    content = @Content),
            @ApiResponse(responseCode = "400",
                    description = "Malformed request",
                    content = @Content),
            @ApiResponse(responseCode = "404",
                    description = "Movie not found with supplied ID",
                    content = @Content)
    })
    @PatchMapping("/{movieId}")
    ResponseEntity<MovieDTO> update(@PathVariable("movieId") String movieId, @RequestBody MovieDTO movieDTO);

}
