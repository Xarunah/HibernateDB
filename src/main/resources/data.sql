INSERT INTO franchise (franchise_id, description, name)
values (1,'dummydescription', 'Marvel');
INSERT INTO franchise (franchise_id, description, name)
values (2,'dummy2description', 'Disney');
INSERT INTO franchise (franchise_id, description, name)
values (3,'dummy3description', 'Avengers');

INSERT INTO movie(movie_id, director, genre, movie_picture, realise, title, trailer, franchise_id)
VALUES (1 , 'JohnWho', 'Fantasy', 'www.picture.com', 1999, 'Predator','www.trailer.com', 1 );

INSERT INTO movie(movie_id, director, genre, movie_picture, realise, title, trailer, franchise_id)
VALUES (2 , 'JamesCameron', 'Action', 'www.picture2.com', 2022, 'Avatar','www.trailer2.com', 2 );

INSERT INTO movie(movie_id, director, genre, movie_picture, realise, title, trailer, franchise_id)
VALUES (3 , 'RyanCoogler', 'Action', 'www.picture3.com', 2022, 'BlackPanther2','www.trailer3.com', 3 );

INSERT INTO character(character_id, character_name, alias, gender, character_picture)
VALUES (1, 'Peter Parker', 'Spider-Man', 'male', 'https://upload.wikimedia.org/wikipedia/en/thumb/0/0f/Tom_Holland_as_Spider-Man.jpg/220px-Tom_Holland_as_Spider-Man.jpg');

INSERT INTO character(character_id, character_name, alias, gender, character_picture)
VALUES (2, 'Bob', 'fgrgreg', 'male', 'https://upload.wikimedia.org/wikipedia/en/thumb/0/0f/Tom_Holland_as_Spider-Man.jpg/220px-Tom_Holland_as_Spider-Man.jpg');

