package com.example.hibernatedb.runnres;
import com.example.hibernatedb.model.Character;
import com.example.hibernatedb.model.Movie;
import com.example.hibernatedb.services.CharacterService;
import com.example.hibernatedb.services.MovieService;
import jakarta.transaction.Transactional;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.*;

import java.util.HashSet;
import java.util.Set;

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

        add();



    }



    public void add() {
        Set<Movie> movieSet = new HashSet<>();

        Movie starWarsANewHope = new Movie("Star Wars: A New Hope", "Action, Adventure, Fantasy", 1977, "George Lucas", "https://www.imdb.com/title/tt0076759/mediaviewer/rm509352704", "https://www.youtube.com/watch?v=1g3_CFmnU7k");
        Movie starWarsTheEmpireStrikesBack = new Movie("Star Wars: The Empire Strikes Back", "Action, Adventure, Fantasy", 1980, "Irvin Kershner", "https://www.imdb.com/title/tt0080684/mediaviewer/rm4058422272", "https://www.youtube.com/watch?v=JNwNXF9Y6kY");
        Movie ironMan = new Movie("Iron Man", "Action, Adventure, Sci-Fi", 2008, "Jon Favreau", "https://www.imdb.com/title/tt0371746/mediaviewer/rm288027520", "https://www.youtube.com/watch?v=8hYlB38asDY");
        Movie theAvengers = new Movie("The Avengers", "Action, Adventure, Sci-Fi", 2012, "Joss Whedon", "https://www.imdb.com/title/tt0848228/mediaviewer/rm2621708800", "https://www.youtube.com/watch?v=eOrNdBpGMv8");

        movieSet.add(starWarsANewHope);
        movieSet.add(starWarsTheEmpireStrikesBack);
        movieSet.add(ironMan);
        movieSet.add(theAvengers);

        movieService.add(starWarsANewHope);
        movieService.add(starWarsTheEmpireStrikesBack);
        movieService.add(ironMan);
        movieService.add(theAvengers);

        // Create characters
        Character lukeSkywalker = new Character("LukeSkywalker","Luke", "Farmboy-turned-Jedi", "Male",movieSet);
        Character darthVader = new Character("DarthVader", "Sith Lord", "Male", "https://www.imdb.com/name/nm0000402/mediaviewer/rm2395835648",movieSet);
        Character ironManTonyStark = new Character("Tony Stark / Iron Man", "Genius, billionaire, playboy, philanthropist", "Male", "https://www.imdb.com/name/nm0000375/mediaviewer/rm2612524032",movieSet);
        Character captainAmericaSteveRogers = new Character("Steve Rogers / Captain America", "Super soldier", "Male", "https://www.imdb.com/name/nm0262635/mediaviewer/rm3948916480",movieSet);

        characterService.add(lukeSkywalker);
        characterService.add(darthVader);
        characterService.add(ironManTonyStark);
        characterService.add(captainAmericaSteveRogers);

        //Character darthVader = new Character("Darth Vader", "Sith Lord", "Male", "https://www.imdb.com/name/nm0000402/mediaviewer/rm2395835648");



    }

    public void update() {
    }

}
