package com.example.hibernatedb.services;

import com.example.hibernatedb.model.Franchise;
import com.example.hibernatedb.repositories.FranchiseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public class FranchiseServiceImpl implements FranchiseService {
    private final FranchiseRepository franchiseRepository;
    private final Logger logger = LoggerFactory.getLogger(FranchiseServiceImpl.class);

    public FranchiseServiceImpl(FranchiseRepository franchiseRepository) {
        this.franchiseRepository = franchiseRepository;
    }


    @Override
    public Franchise findById(Integer integer) {
        return null;
    }

    @Override
    public Collection<Franchise> findAll() {
        return null;
    }

    @Override
    public Franchise add(Franchise entity) {
        return null;
    }

    @Override
    public Franchise update(Franchise entity) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Franchise entity) {

    }
}
