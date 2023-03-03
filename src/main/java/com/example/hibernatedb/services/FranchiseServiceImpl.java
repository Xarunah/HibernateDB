package com.example.hibernatedb.services;

import com.example.hibernatedb.dto.FranchiseDTO;
import com.example.hibernatedb.mapper.FranchiseMapper;
import com.example.hibernatedb.model.Franchise;
import com.example.hibernatedb.repositories.FranchiseRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class FranchiseServiceImpl implements FranchiseService {

    private final FranchiseRepository franchiseRepository;

    private final FranchiseMapper MAPPER = FranchiseMapper.INSTANCE;

    @Override
    public FranchiseDTO createFranchise(FranchiseDTO franchiseDTO) {
        Franchise franchise = MAPPER.convert(franchiseDTO);
        Franchise newFranchise = franchiseRepository.save(franchise);
        return MAPPER.convert(newFranchise);
    }

    @Override
    public FranchiseDTO getFranchise(String franchiseId) {
        Optional<Franchise> franchise = franchiseRepository.findById(Integer.parseInt(franchiseId));
        return MAPPER.
                convert(franchise.orElseThrow(() ->
                        new HttpServerErrorException(HttpStatus.NOT_FOUND, "Franchise not found.")));
    }

    @Override
    public void deleteFranchise(String franchiseId) {
        franchiseRepository.deleteById(Integer.parseInt(franchiseId));
    }

    @Override
    public FranchiseDTO updateFranchise(String franchiseId, FranchiseDTO franchiseDTO) {
        Optional<Franchise> franchise = franchiseRepository.
                findById(Integer.parseInt(franchiseId));
        if (franchise.isEmpty()) {
            throw new HttpServerErrorException(HttpStatus.NOT_FOUND, "Franchise not found.");
        }
        Franchise franchise1 = MAPPER.updatedFranchise(franchiseDTO, franchise.get());
        franchise1.setId(Integer.parseInt(franchiseId));
        Franchise udpatedFranchise = franchiseRepository.save(franchise1);
        return MAPPER.convert(udpatedFranchise);
    }
}
