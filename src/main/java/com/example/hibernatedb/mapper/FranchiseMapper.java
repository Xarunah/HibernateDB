package com.example.hibernatedb.mapper;

import com.example.hibernatedb.dto.FranchiseDTO;
import com.example.hibernatedb.model.Franchise;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.Collection;
import java.util.List;

@Mapper
public  interface FranchiseMapper {

    FranchiseMapper INSTANCE = Mappers.getMapper(FranchiseMapper.class);

    FranchiseDTO convert(Franchise franchise);

    Collection<FranchiseDTO> convert(List<Franchise> all);

    Franchise convert(FranchiseDTO franchiseDTO);

    Franchise updatedFranchise(FranchiseDTO franchiseDTO, @MappingTarget Franchise character);

}
