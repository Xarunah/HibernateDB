package com.example.hibernatedb.services;

import com.example.hibernatedb.model.Character;
import com.example.hibernatedb.repositories.CharacterRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Slf4j
@Service
    public class CharacterServiceImpl implements CharacterService {
    private final CharacterRepository characterRepository;
    private final Logger logger = LoggerFactory.getLogger(CharacterServiceImpl.class);

    public CharacterServiceImpl(CharacterRepository characterRepository) {
            this.characterRepository = characterRepository;
        }

    @Override
    public Character findById(Integer id) {
    return characterRepository.findById(id).get();
    }

    @Override
    public Collection<Character> findAll() {
        return null;
    }

    @Override
    public Character add(Character entity) {
        return null;
    }

    @Override
    public Character update(Character entity) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Character entity) {

    }

    @Override
    public void setMovie(int character_id, int movie_id) {

    }

    @Override
    public void setCharacter(int character_id, int movie_id) {

    }
}

