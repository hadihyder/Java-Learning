use vinylrecordshop;

INSERT INTO album
VALUES (1, 'Imagine', 'Apple', '1971-9-9', 9.99);

INSERT INTO album (albumTitle, releaseDate, price, label)
VALUES ('2525 (Exordium & Terminus)', '1969-7-1', 25.99, 'RCA');

INSERT INTO album (albumTitle, releaseDate, price, label)
VALUES 
	ROW ("No One's Gonna Change Our World", '1969-12-12', 39.95, 'Regal Starline'),
    ROW ('Moondance Studio Album', '1969-8-1', 14.99, 'Warner Bros');

INSERT INTO album (albumTitle, releaseDate, price, label)
VALUES 
	ROW ("Clouds", '1969-5-1', 9.99, 'Reprise'),
    ROW ("Sounds of Silence Studio Album", '1966-1-17', 9.99, 'Columbia'),
    ROW ("Abbey Road", '1969-1-10', 12.99, 'Apple'),
    ROW ("Smiley Smiley", '1967-9-18', 5.99, 'Capitol');    

delete from album 
where albumId = 5;    

INSERT INTO album (albumTitle, releaseDate, price, label)
VALUES ("Clouds", '1969-5-1', 9.99,'Reprise'); 

set SQL_SAFE_UPDATES = 0;
update album
	set albumId = 5
where albumTitle = 'Clouds'; 
set SQL_SAFE_UPDATES = 1;

set SQL_SAFE_UPDATES = 0;
update album
	set albumId = 9
where albumTitle = 'Smiley Smiley'; 
set SQL_SAFE_UPDATES = 1;