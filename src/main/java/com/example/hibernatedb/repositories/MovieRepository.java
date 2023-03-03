package com.example.hibernatedb.repositories;

import com.example.hibernatedb.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository to apply CRUD operations on Movie.
 * */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
