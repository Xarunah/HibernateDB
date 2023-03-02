package com.example.hibernatedb.mapper;

import com.example.hibernatedb.dto.FrachiseDTO;
import com.example.hibernatedb.model.Franchise;
import com.example.hibernatedb.services.FranchiseRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Collection;
import java.util.List;

@Mapper
public  interface FranchiseMapper {

    FranchiseMapper INSTANCE = Mappers.getMapper(FranchiseMapper.class);

    FrachiseDTO convert(Franchise franchise);

    Collection<FrachiseDTO> convert(List<Franchise> all);

    Franchise convert(FranchiseRequest franchiseRequest);

}
