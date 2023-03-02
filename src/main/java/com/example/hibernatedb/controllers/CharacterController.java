package com.example.hibernatedb.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.example.hibernatedb.dto.*;

@RequestMapping("/api/character")
@CrossOrigin("*")
public interface CharacterController {
    @PostMapping
    ResponseEntity<CharacterDTO> createCharacter(@RequestBody CharacterDTO characterDTO);

    @GetMapping("/{characterId}")
    ResponseEntity<CharacterDTO> getCharacter(@PathVariable("characterId") String characterId);

    @DeleteMapping("/{characterId}")
    ResponseEntity<Void> deleteCharacter(@PathVariable("characterId") String characterId);

    @PatchMapping("/{characterId}")
    ResponseEntity<CharacterDTO> updateCharacter(@PathVariable("characterId") String characterId, @RequestBody CharacterDTO characterDTO);

}
