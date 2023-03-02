package com.example.hibernatedb.mapper;

import com.example.hibernatedb.dto.CharacterDTO;
import com.example.hibernatedb.model.Character;
import com.example.hibernatedb.services.CharacterRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.BeanUtils;

import java.util.Collection;
import java.util.List;

@Mapper
public interface CharacterMapper {

    CharacterMapper INSTANCE = Mappers.getMapper(CharacterMapper.class);

    CharacterDTO toCharacterDTO(Character character);

    Collection<CharacterDTO> convert(List<Character> all);

    Character toCharacter(CharacterDTO characterRequest);

    Character updatedCharacter(CharacterDTO characterDTO, @MappingTarget Character character);
}
