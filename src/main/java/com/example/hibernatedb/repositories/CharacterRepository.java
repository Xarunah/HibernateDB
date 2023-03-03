package com.example.hibernatedb.repositories;

import com.example.hibernatedb.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


//Repository to apply CRUD operations on Characters.
@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {

//    Find Character by id.
    Optional<Character> findCharacterById(long id);

    Optional<Character> findAllCharacterByid(long id);
}
