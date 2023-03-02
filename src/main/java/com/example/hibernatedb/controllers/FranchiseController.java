package com.example.hibernatedb.controllers;

import com.example.hibernatedb.dto.FranchiseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/franchise")
@CrossOrigin("*")
public interface FranchiseController {
    @PostMapping
    ResponseEntity<FranchiseDTO> creatFranchise(@RequestBody FranchiseDTO franchiseDTO);

    @GetMapping("/{franchiseId}")
    ResponseEntity<FranchiseDTO> getFranchise(@PathVariable("franchiseId") String franchiseId);

    @DeleteMapping("/{characterId}")
    ResponseEntity<Void> deleteFranchise(@PathVariable("characterId") String franchiseId);

    @PatchMapping("/{franchiseId}")
    ResponseEntity<FranchiseDTO> updateFranchise(@PathVariable("franchiseId") String franchiseId, @RequestBody FranchiseDTO franchiseDTO);
}
