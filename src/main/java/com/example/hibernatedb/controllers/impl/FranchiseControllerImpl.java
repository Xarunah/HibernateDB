package com.example.hibernatedb.controllers.impl;

import com.example.hibernatedb.controllers.FranchiseController;
import com.example.hibernatedb.dto.FranchiseDTO;
import org.springframework.http.ResponseEntity;

public class FranchiseControllerImpl implements FranchiseController {

    @Override
    public ResponseEntity<FranchiseDTO> create(FranchiseDTO franchiseDTO) { return null; }

    @Override
    public ResponseEntity<FranchiseDTO> get(String franchiseId) { return null; }

    @Override
    public ResponseEntity<FranchiseDTO> delete(String franchiseId) { return null; }

    @Override
    public ResponseEntity<FranchiseDTO> update(String franchiseId, FranchiseDTO franchiseDTO) { return null; }

}
