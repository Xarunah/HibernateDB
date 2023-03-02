package com.example.hibernatedb.controllers;

import com.example.hibernatedb.dto.FranchiseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/franchises")
public interface FranchiseController {

    @PostMapping
    ResponseEntity<FranchiseDTO> create(@RequestBody FranchiseDTO franchiseDTO);

    @GetMapping("/{franchiseId}")
    ResponseEntity<FranchiseDTO> get(@PathVariable("franchiseId") String franchiseId);

    @DeleteMapping("/{franchiseId}")
    ResponseEntity<FranchiseDTO> delete(@PathVariable("franchiseId") String franchiseId);

    @PatchMapping("/{franchiseId}")
    ResponseEntity<FranchiseDTO> update(@PathVariable("franchiseId") String franchiseId, @RequestBody FranchiseDTO franchiseDTO);
}
