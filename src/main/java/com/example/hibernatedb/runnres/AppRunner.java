package com.example.hibernatedb.runnres;
import com.example.hibernatedb.repositories.CharacterRepository;
import com.example.hibernatedb.repositories.MovieRepository;
import jakarta.transaction.Transaction;
import jakarta.transaction.Transactional;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.*;

@Component
public class AppRunner implements ApplicationRunner{

    private final MovieRepository movieRepository;

    public AppRunner(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception{

        System.out.println(movieRepository.findById(1).get().getDirector());

    }
}
