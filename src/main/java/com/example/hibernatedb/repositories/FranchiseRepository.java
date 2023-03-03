package com.example.hibernatedb.repositories;

import com.example.hibernatedb.model.Franchise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository to apply CRUD operations on Franchise.
 * */
@Repository
public interface FranchiseRepository extends JpaRepository<Franchise, Integer> {
}
