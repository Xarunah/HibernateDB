INSERT INTO franchise (franchise_id, description, name)
values (default,'dummydescription', 'Marvel');
INSERT INTO franchise (franchise_id, description, name)
values (default,'dummy2description', 'Disney');
INSERT INTO franchise (franchise_id, description, name)
values (default,'dummy3description', 'Avengers');

INSERT INTO movie(movie_id, director, genre, movie_picture, realise, title, trailer, franchise_id)
VALUES (default , 'JohnWho', 'Fantasy', 'www.picture.com', 1999, 'Predator','www.trailer.com', 1 );

INSERT INTO movie(movie_id, director, genre, movie_picture, realise, title, trailer, franchise_id)
VALUES (default , 'JamesCameron', 'Action', 'www.picture2.com', 2022, 'Avatar','www.trailer2.com', 2 );

INSERT INTO movie(movie_id, director, genre, movie_picture, realise, title, trailer, franchise_id)
VALUES (default , 'RyanCoogler', 'Action', 'www.picture3.com', 2022, 'BlackPanther2','www.trailer3.com', 3 );
