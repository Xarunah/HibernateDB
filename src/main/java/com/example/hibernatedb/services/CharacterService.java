package com.example.hibernatedb.services;

import com.example.hibernatedb.dto.CharacterDTO;
import com.example.hibernatedb.mapper.CharacterMapper;
import com.example.hibernatedb.model.Character;
import com.example.hibernatedb.repositories.CharacterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public interface CharacterService  {


    CharacterDTO createCharacter(CharacterDTO characterDTO);

    CharacterDTO getCharacter(String characterId);

    void deleteCharacter(String characterId);

    CharacterDTO updateCharacter(String characterId, CharacterDTO characterDTO);
}