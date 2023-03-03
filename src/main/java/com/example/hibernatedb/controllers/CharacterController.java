package com.example.hibernatedb.controllers;

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
     *
     * @param characterId the character id
     * @return CharacterDTO character details against the provided id
     * */
    @GetMapping("/{characterId}")
    ResponseEntity<CharacterDTO> getCharacter(@PathVariable("characterId") String characterId);

    /**
     * Delete Character by character id.
     *
     * @param characterId the character id
     * */
    @DeleteMapping("/{characterId}")
    ResponseEntity<Void> deleteCharacter(@PathVariable("characterId") String characterId);

    /**
     * Update Character by character id and by passing updating DTO.
     *
     * @param characterId the character id
     * @param characterDTO the character DTO
     * @return CharacterDTO character details against the provided id
     * */
    @PatchMapping("/{characterId}")
    ResponseEntity<CharacterDTO> updateCharacter(@PathVariable("characterId") String characterId, @RequestBody CharacterDTO characterDTO);

}
