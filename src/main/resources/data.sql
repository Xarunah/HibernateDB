INSERT INTO franchise (franchise_id, description, name)
values (default,'The Marvel Cinematic Universe (MCU) movie franchise is a series of interconnected superhero films produced by Marvel Studios.
The franchise began with "Iron Man" in 2008 and has since grown into a massive cinematic universe with over 20 films and counting.
The movies are based on popular Marvel Comics characters such as Iron Man, Captain America, Thor, and the Avengers, and feature a shared continuity with crossover storylines and characters appearing across multiple films.
The franchise is known for its epic storytelling, action-packed scenes, and humor.', 'Marvel');

INSERT INTO franchise (franchise_id, description, name)
values (default,'The X-Men movie franchise is a series of superhero films based on the popular Marvel Comics characters, the X-Men.
The franchise began with the release of "X-Men" in 2000 and has since produced 13 films, including spin-offs and prequels.
The movies follow the story of a group of mutants, humans with extraordinary abilities, who fight for acceptance and equality in a world that fears and hates them.
The franchise has explored themes of discrimination, identity, and social justice while featuring exciting action sequences and complex characters.
The X-Men franchise has been highly successful and has become a staple of the superhero movie genre.', 'X-Men');

INSERT INTO franchise (franchise_id, description, name)
values (default,'The Jurassic Park movie franchise is a series of science-fiction adventure films that began with the release of the first film in 1993,
directed by Steven Spielberg. The franchise is based on the concept of a theme park with cloned dinosaurs, created through genetic engineering.
The films explore the dangers and consequences of playing God with science and feature thrilling action sequences as the dinosaurs escape their captivity and wreak havoc on humans.
The franchise includes five films to date..', 'Jurassic Park');


INSERT INTO movie(movie_id, title, genre, realise,  director, movie_picture, trailer, franchise_id)
VALUES (default , 'Spider-Man: No Way Home', 'Action', '2021', 'Jon Watts',
        'https://www.nordborgbio.dk/wp-content/uploads/2022/01/Spiderman-No-Way-Home.jpg','https://www.youtube.com/watch?v=JfVOs4VSpmA', 1);

INSERT INTO movie(movie_id, title, genre, realise,  director, movie_picture, trailer, franchise_id)
VALUES (default , 'X-Men: Apocalypse', 'Action', '2016', 'Bryan Singer',
        'https://m.media-amazon.com/images/M/MV5BMjU1ODM1MzYxN15BMl5BanBnXkFtZTgwOTA4NDE2ODE@._V1_.jpg','https://www.youtube.com/watch?v=Jer8XjMrUB4', 2);

INSERT INTO movie(movie_id, title, genre, realise,  director, movie_picture, trailer, franchise_id)
VALUES (default , 'Jurassic World: Fallen Kingdom', 'Science Fiction', '2018', 'J. A. Bayona',
        'https://m.media-amazon.com/images/M/MV5BNzIxMjYwNDEwN15BMl5BanBnXkFtZTgwMzk5MDI3NTM@._V1_.jpg','https://www.youtube.com/watch?v=1FJD7jZqZEk', 3);

INSERT INTO movie(movie_id, title, genre, realise,  director, movie_picture, trailer, franchise_id)
VALUES (default , 'Avengers: Infinity War', 'Science Fiction', '2018', 'Anthony Russo',
        'https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_.jpg','https://www.youtube.com/watch?v=6ZfuNTqbHE8', 1);

INSERT INTO movie(movie_id, title, genre, realise,  director, movie_picture, trailer, franchise_id)
VALUES (default , 'Jurassic World: Dominion', 'Science Fiction', '2022', 'Colin Trevorrow',
        'https://m.media-amazon.com/images/M/MV5BOTBjMjA4NmYtN2RjMi00YWZlLTliYTktOTIwMmNkYjYxYmE1XkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_FMjpg_UX1000_.jpg','https://www.youtube.com/watch?v=UtxAPXT4174', 3);


INSERT INTO character(character_id, character_name, alias, gender, character_picture)
VALUES (default, 'Peter Parker', 'Spider-Man', 'male', 'https://upload.wikimedia.org/wikipedia/en/thumb/0/0f/Tom_Holland_as_Spider-Man.jpg/220px-Tom_Holland_as_Spider-Man.jpg');

INSERT INTO character(character_id, character_name, alias, gender, character_picture)
VALUES (default, 'Psylocke', null, 'female', 'https://i.pinimg.com/originals/35/e6/1f/35e61fc90f094998a916035c3824bd69.jpg');

INSERT INTO character(character_id, character_name, alias, gender, character_picture)
VALUES (default, 'Owen Grady', Owen, 'male', 'https://upload.wikimedia.org/wikipedia/en/4/40/Owen_Grady_%28Chris_Pratt%29.jpg');


INSERT INTO character_movies(movie_id, character_id)
VALUES (1,1)

INSERT INTO character_movies(movie_id, character_id)
VALUES (2,2)

INSERT INTO character_movies(movie_id, character_id)
VALUES (3,3)

INSERT INTO character_movies(movie_id, character_id)
VALUES (4,1)

INSERT INTO character_movies(movie_id, character_id)
VALUES (5,3)


