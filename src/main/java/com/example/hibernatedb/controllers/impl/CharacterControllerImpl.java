package com.example.hibernatedb.controllers.impl;

import com.example.hibernatedb.controllers.CharacterController;
import com.example.hibernatedb.dto.CharacterDTO;
import com.example.hibernatedb.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CharacterControllerImpl implements CharacterController {
    @Autowired
    private CharacterService characterService;
    @Override
    public ResponseEntity<CharacterDTO> createCharacter(CharacterDTO characterDTO) {
        return ResponseEntity.ok(characterService.createCharacter(characterDTO));
    }

    @GetMapping
    public ResponseEntity<CharacterDTO> getCharacter(@RequestParam String characterId) {
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
