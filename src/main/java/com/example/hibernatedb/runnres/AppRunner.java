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
//    public void add() {
//        Movie newMovie = new Movie("Spider-Man: No Way Home", "Action", 2021, "Jon Watts", "https://www.nordborgbio.dk/wp-content/uploads/2022/01/Spiderman-No-Way-Home.jpg",
//                "https://www.youtube.com/watch?v=JfVOs4VSpmA");
//        movieRepository.save(newMovie);
//    }
//
//    public void update() {
//        Character character = characterRepository.findById(1).get();
//        Movie movie = movieRepository.findById(1).get();
//        character.setMovie(movie);
//        characterRepository.save(character);
//    }

}
