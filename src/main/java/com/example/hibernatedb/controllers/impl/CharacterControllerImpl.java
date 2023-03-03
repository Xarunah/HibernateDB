package com.example.hibernatedb.controllers.impl;

import com.example.hibernatedb.controllers.CharacterController;
import com.example.hibernatedb.dto.CharacterDTO;
import com.example.hibernatedb.services.CharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation for character controller. Controller is responsible for accepting the
 * Http requests from the client and respond them accordingly.
 * */
@RequiredArgsConstructor
@RestController
public class CharacterControllerImpl implements CharacterController {
    private final CharacterService characterService;
    @Override
    public ResponseEntity<CharacterDTO> createCharacter(CharacterDTO characterDTO) {
        return ResponseEntity.ok(characterService.createCharacter(characterDTO));
    }

    @Override
    public ResponseEntity<CharacterDTO> getCharacter(String characterId) {
        return ResponseEntity.ok(characterService.getCharacter(characterId));
    }

    @Override
    public ResponseEntity<Void> deleteCharacter(String characterId) {
        characterService.deleteCharacter(characterId);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @Override
    public ResponseEntity<CharacterDTO> updateCharacter(String characterId, CharacterDTO characterDTO) {
        return ResponseEntity.ok(characterService.updateCharacter(characterId, characterDTO));
    }
}
