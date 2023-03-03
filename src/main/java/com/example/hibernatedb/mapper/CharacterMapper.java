package com.example.hibernatedb.mapper;

import com.example.hibernatedb.dto.CharacterDTO;
import com.example.hibernatedb.model.Character;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

//Mapper for characters
@Mapper
public interface CharacterMapper {
//     Object to initialise the CharacterMapper when need to access mapper.
    CharacterMapper INSTANCE = Mappers.getMapper(CharacterMapper.class);

//    Converts Character to CharacterDTO Object.
    CharacterDTO toCharacterDTO(Character character);

//    Converts CharacterDTO to Character Object.
    Character toCharacter(CharacterDTO characterRequest);

//    Copy details from CharacterDTO to Character Object.
    Character updatedCharacter(CharacterDTO characterDTO, @MappingTarget Character character);
}
