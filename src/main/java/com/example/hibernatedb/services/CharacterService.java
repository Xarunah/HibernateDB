package com.example.hibernatedb.services;
import com.example.hibernatedb.dto.CharacterDTO;
import org.springframework.stereotype.Service;

/**
 * Service to Get character data from database and return to the controller.
 * Communicates with controller and database to perform CRUD operations.
 * */
@Service
public interface CharacterService  {


    CharacterDTO createCharacter(CharacterDTO characterDTO);

    CharacterDTO getCharacter(String characterId);

    void deleteCharacter(String characterId);

    CharacterDTO updateCharacter(String characterId, CharacterDTO characterDTO);

    


}