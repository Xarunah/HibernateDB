package com.example.hibernatedb.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.example.hibernatedb.dto.*;

/**
 * Controller for creating, updating, retrieving and delete the Character.
 * */
@RequestMapping("/api/character")
@CrossOrigin("*")
public interface CharacterController {

    /**
     * Create Character.
     *
     * @param characterDTO the character data transfer object
     * @return CharacterDTO character details
     * */

    @PostMapping
    ResponseEntity<CharacterDTO> createCharacter(@RequestBody CharacterDTO characterDTO);


    /**
     * Get Character by character id.
     * @param characterId the character id
     * @return CharacterDTO character details against the provided id
     * */
    @Operation(summary = "Get a character by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Success",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Character.class)) }),
            @ApiResponse(responseCode = "404",
                    description = "Character does not exist with supplied ID",
                    content = @Content)
    })
    @GetMapping("/{characterId}")
    ResponseEntity<CharacterDTO> getCharacter(@PathVariable("characterId") String characterId);

    /**
     * Delete Character by character id.
     * @param characterId the character id
     * */
    @Operation(summary = "Delete character by ID")
    @ApiResponse(responseCode = "200", description = "Character deleted")
    @ApiResponse(responseCode = "400", description = "Invalid input")
    @ApiResponse(responseCode = "404", description = "Character not found")
    @DeleteMapping("/{characterId}")
    ResponseEntity<Void> deleteCharacter(@PathVariable("characterId") String characterId);

    /**
     * Update Character by character id and by passing updating DTO.
     * @param characterId the character id
     * @param characterDTO the character DTO
     * @return CharacterDTO character details against the provided id
     * */
    @Operation(summary = "Updates a character")
    @ApiResponses( value = {
            @ApiResponse(responseCode = "204",
                    description = "Character successfully updated",
                    content = @Content),
            @ApiResponse(responseCode = "400",
                    description = "Malformed request",
                    content = @Content),
            @ApiResponse(responseCode = "404",
                    description = "Character not found with supplied ID",
                    content = @Content)
    })
    @PatchMapping("/{characterId}")
    ResponseEntity<CharacterDTO> updateCharacter(@PathVariable("characterId") String characterId, @RequestBody CharacterDTO characterDTO);




}
