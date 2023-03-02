package com.example.hibernatedb.services;

import com.example.hibernatedb.dto.CharacterDTO;
import com.example.hibernatedb.dto.*;
import com.example.hibernatedb.mapper.CharacterMapper;
import com.example.hibernatedb.mapper.MovieMapper;
import com.example.hibernatedb.model.Character;
import com.example.hibernatedb.model.Movie;
import com.example.hibernatedb.repositories.CharacterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
@Slf4j
@Service
@RequiredArgsConstructor
public class CharacterService  {

    private final CharacterRepository characterRepository;
    private final Logger logger = LoggerFactory.getLogger(CharacterService.class);

    public CharacterDTO findByID(long id){

        Optional<Character> characterOptional = characterRepository.findCharacterById(id);
        if(characterOptional.isPresent()){
            Character character = characterOptional.get();
            return CharacterMapper.INSTANCE.convert(character);
        }
        return null;
    }

    public Collection<CharacterDTO> findAll(){
        return CharacterMapper.INSTANCE.convert(characterRepository.findAll());
    }

    public Long save(CharacterRequest characterRequest) {

        Character character = CharacterMapper.INSTANCE.convert(characterRequest);
        Character saved = characterRepository.save(character);

        return saved.getId();
    }
}