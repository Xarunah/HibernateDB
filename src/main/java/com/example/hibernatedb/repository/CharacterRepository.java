package com.example.hibernatedb.repository;

import com.example.hibernatedb.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Integer> {
}
