package com.example.hibernatedb.services;

import com.example.hibernatedb.dto.CharacterDTO;
import com.example.hibernatedb.mapper.CharacterMapper;
import com.example.hibernatedb.model.Character;
import com.example.hibernatedb.repositories.CharacterRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.HttpStatusCodeException;

import java.util.Collection;
import java.util.Optional;

@Slf4j
@Service
    public class CharacterServiceImpl implements CharacterService {
    private final CharacterRepository characterRepository;

    public CharacterServiceImpl(CharacterRepository characterRepository) {
            this.characterRepository = characterRepository;
    }

    @Override
    public CharacterDTO createCharacter(CharacterDTO characterDTO) {
        Character newCharacter = characterRepository.save(CharacterMapper.toCharacter(characterDTO));
        return CharacterMapper.toCharacterDTO(newCharacter);
    }

    @Override
    public CharacterDTO getCharacter(String characterId) {
        Optional<Character> character = characterRepository.
        findCharacterById(Integer.parseInt(characterId));
        return CharacterMapper.
        toCharacterDTO(character.orElseThrow(() ->
        new HttpServerErrorException(HttpStatus.NOT_FOUND, "Character not found.")));
    }

    @Override
    public void deleteCharacter(String characterId) {
        characterRepository.deleteCharacterById(Integer.parseInt(characterId));
    }

    @Override
    public CharacterDTO updateCharacter(String characterId, CharacterDTO characterDTO) {
        Optional<Character> character = characterRepository.
                findCharacterById(Integer.parseInt(characterId));
        if (character.isEmpty()) {
            throw new HttpServerErrorException(HttpStatus.NOT_FOUND, "Character not found.");
        }
        Character character1 = update(characterDTO, character.get());
        Character udpatedCharacter = characterRepository.save(character1);
        return CharacterMapper.toCharacterDTO(udpatedCharacter);
    }


    private Character update(CharacterDTO characterDTO, Character character) {
        if (characterDTO.getAlias() != null) {
            character.setAlias(characterDTO.getAlias());
        }

        if (characterDTO.getName() != null) {
            character.setName(characterDTO.getName());
        }

        if (characterDTO.getPicture() != null) {
            character.setPicture(characterDTO.getPicture());
        }

        if (characterDTO.getMovies() != null) {
            character.setMovies(characterDTO.getMovies());
        }
        return character;
    }
}

