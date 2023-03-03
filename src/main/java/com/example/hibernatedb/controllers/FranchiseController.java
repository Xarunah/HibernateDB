package com.example.hibernatedb.controllers;

import com.example.hibernatedb.dto.FranchiseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for creating, updating, retrieving and delete the Franchise.
 * */
@RequestMapping("/api/franchise")
@CrossOrigin("*")
public interface FranchiseController {
    /**
     * Create Franchise.
     *
     * @param franchiseDTO the franchise data transfer object
     * @return FranchiseDTO franchise details
     * */
    @PostMapping
    ResponseEntity<FranchiseDTO> creatFranchise(@RequestBody FranchiseDTO franchiseDTO);

    /**
     * Get franchise by franchise id.
     *
     * @param franchiseId the franchise id
     * @return FranchiseDTO franchise details against the provided id
     * */
    @GetMapping("/{franchiseId}")
    ResponseEntity<FranchiseDTO> getFranchise(@PathVariable("franchiseId") String franchiseId);


    /**
     * Delete franchise by franchise id.
     *
     * @param franchiseId the franchise id
     * */
    @DeleteMapping("/{franchiseId}")
    ResponseEntity<Void> deleteFranchise(@PathVariable("franchiseId") String franchiseId);

    /**
     * Update franchise by franchise id and by passing updating DTO.
     *
     * @param franchiseId the franchise id
     * @param franchiseDTO the franchise DTO
     * @return FranchiseDTO franchise details against the provided id
     * */
    @PatchMapping("/{franchiseId}")
    ResponseEntity<FranchiseDTO> updateFranchise(@PathVariable("franchiseId") String franchiseId, @RequestBody FranchiseDTO franchiseDTO);
}
