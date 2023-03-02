package com.example.hibernatedb.services;
import com.example.hibernatedb.dto.*;
import org.springframework.stereotype.Service;

@Service
public interface FranchiseService {
    FranchiseDTO createFranchise(FranchiseDTO franchiseDTO);

    FranchiseDTO getFranchise(String franchiseId);

    void deleteFranchise(String franchiseId);

    FranchiseDTO updateFranchise(String franchiseId, FranchiseDTO franchiseDTO);
}
