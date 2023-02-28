package com.example.hibernatedb.runnres;
import com.example.hibernatedb.model.Character;
import com.example.hibernatedb.model.Gender;
import com.example.hibernatedb.model.Movie;
import com.example.hibernatedb.repositories.CharacterRepository;
import com.example.hibernatedb.repositories.MovieRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.*;

@Component
public class AppRunner implements ApplicationRunner{

    private final MovieRepository movieRepository;
    private final CharacterRepository characterRepository;

    public AppRunner(MovieRepository movieRepository, CharacterRepository characterRepository){
        this.movieRepository = movieRepository;
        this.characterRepository = characterRepository;
    }

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception{
        add();
//        update();
    }
    public void add() {
        Movie newMovie = new Movie("Spider-Man: No Way Home", "Action", 2021, "Jon Watts", "https://www.nordborgbio.dk/wp-content/uploads/2022/01/Spiderman-No-Way-Home.jpg",
                "https://www.youtube.com/watch?v=JfVOs4VSpmA");
        movieRepository.save(newMovie);



    }
//    public void update() {
//        Character character = characterRepository.findById(5).get();
//        Movie movie = movieRepository.findById(3).get();
//        character.setMovie(movie);
//        characterRepository.save(character);
//    }

}
