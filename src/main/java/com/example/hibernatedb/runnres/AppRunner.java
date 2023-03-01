package com.example.hibernatedb.runnres;
import com.example.hibernatedb.services.CharacterService;
import com.example.hibernatedb.services.MovieService;
import jakarta.transaction.Transactional;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.*;

@Component
public class AppRunner implements ApplicationRunner{

    private final MovieService movieService;
    private final CharacterService characterService;

    public AppRunner(MovieService movieService, CharacterService characterService){
        this.movieService = movieService;
        this.characterService = characterService;
    }

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception{

    }


}
