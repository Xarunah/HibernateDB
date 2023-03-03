package com.example.hibernatedb.controllers.impl;

import com.example.hibernatedb.controllers.FranchiseController;
import com.example.hibernatedb.dto.FranchiseDTO;
import com.example.hibernatedb.services.FranchiseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


/**
 * Implementation for franchise controller. Controller is responsible for accepting the
 * Http requests from the client and respond them accordingly.
 * */
@RequiredArgsConstructor
@RestController
public class FranchiseControllerImpl implements FranchiseController {
    private final FranchiseService franchiseService;
    @Override
    public ResponseEntity<FranchiseDTO> creatFranchise(FranchiseDTO franchiseDTO) {
        return ResponseEntity.ok(franchiseService.createFranchise(franchiseDTO));
    }

    @Override
    public ResponseEntity<FranchiseDTO> getFranchise(String franchiseId) {
        return ResponseEntity.ok(franchiseService.getFranchise(franchiseId));
    }

    @Override
    public ResponseEntity<Void> deleteFranchise(String franchiseId) {
        franchiseService.deleteFranchise(franchiseId);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<FranchiseDTO> updateFranchise(String franchiseId, FranchiseDTO franchiseDTO) {
        return ResponseEntity.ok(franchiseService.updateFranchise(franchiseId, franchiseDTO));
    }
}
