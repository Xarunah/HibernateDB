package com.example.hibernatedb.repositories;

import com.example.hibernatedb.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {
    Optional<Character> findCharacterById(long id);

    void deleteCharacterById(int id);
}
