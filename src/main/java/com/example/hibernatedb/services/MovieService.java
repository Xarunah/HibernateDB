package com.example.hibernatedb.services;

import com.example.hibernatedb.model.Character;
import com.example.hibernatedb.model.Movie;
import com.example.hibernatedb.repositories.CharacterRepository;
import com.example.hibernatedb.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public interface MovieService extends CrudService<Movie, Integer> {
//    void setProject(int studentId, int projectId);

}

