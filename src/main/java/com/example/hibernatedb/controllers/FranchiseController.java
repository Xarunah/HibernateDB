package com.example.hibernatedb.controllers;

import com.example.hibernatedb.dto.FranchiseDTO;
import com.example.hibernatedb.model.Franchise;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Controller for creating, updating, retrieving and delete the Franchise.
@RequestMapping("/api/franchise")
@CrossOrigin("*")
public interface FranchiseController {

    /**
     * Create Franchise.
     * @param franchiseDTO the franchise data transfer object
     * @return FranchiseDTO franchise details
     * */
    @PostMapping
    ResponseEntity<FranchiseDTO> creatFranchise(@RequestBody FranchiseDTO franchiseDTO);

    /**
     * Get franchise by franchise id.
     * @param franchiseId the franchise id
     * @return FranchiseDTO franchise details against the provided id
     * */
    @Operation(summary = "Get franchise by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Success",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Franchise.class)) }),
            @ApiResponse(responseCode = "404",
                    description = "Franchise does not exist with supplied ID",
                    content = @Content)
    })
    @GetMapping("/{franchiseId}")
    ResponseEntity<FranchiseDTO> getFranchise(@PathVariable("franchiseId") String franchiseId);

    /**
     * Delete franchise by franchise id.
     * @param franchiseId the franchise id
     * */
    @Operation(summary = "Delete franchise by ID")
    @ApiResponse(responseCode = "200", description = "Franchise deleted")
    @ApiResponse(responseCode = "400", description = "Invalid input")
    @ApiResponse(responseCode = "404", description = "Franchise not found")
    @DeleteMapping("/{franchiseId}")
    ResponseEntity<Void> deleteFranchise(@PathVariable("franchiseId") String franchiseId);

    /**
     * Update franchise by franchise id and by passing updating DTO.
     * @param franchiseId the franchise id
     * @param franchiseDTO the franchise DTO
     * @return FranchiseDTO franchise details against the provided id
     * */
    @Operation(summary = "Updates franchise")
    @ApiResponses( value = {
            @ApiResponse(responseCode = "204",
                    description = "Franchise successfully updated",
                    content = @Content),
            @ApiResponse(responseCode = "400",
                    description = "Malformed request",
                    content = @Content),
            @ApiResponse(responseCode = "404",
                    description = "Franchise not found with supplied ID",
                    content = @Content)
    })
    @PatchMapping("/{franchiseId}")
    ResponseEntity<FranchiseDTO> updateFranchise(@PathVariable("franchiseId") String franchiseId, @RequestBody FranchiseDTO franchiseDTO);


}
