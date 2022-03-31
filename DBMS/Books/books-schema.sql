drop database if exists books;

create database books;

use books;

drop table if exists author;
create table author (
	authorId int not null,
    firstName varchar(25) not null,
    middleName varchar(25),
    lastName varchar(50) not null,
    gender varchar(1),
    dateOfBirth datetime not null,
    dateOfDeath datetime,
    constraint pk_author
		primary key(authorId)
    );

drop table if exists book;
create table book (
    bookId int not null,
    Title varchar(100),
    publicationDate datetime,
     constraint pk_book
    		primary key (bookId)
);

drop table if exists authorBook;
create table authorBook(
	authorId int not null,
    bookId int not null,
    constraint pk_authorBook
		primary key(authorId, bookId),
    constraint fk_authorBook_authorId
		foreign key (authorId)
        references author(authorId),
	constraint fk_authorBook_bookId
		foreign key (bookId)
        references book(bookId)
);

drop table if exists `format`;
create table `format` (
	formatId int not null,
    formatName varchar(12) not null,
    constraint pk_format
		primary key (formatId)
);

drop table if exists genre;
create table genre (
	genreId int not null,
    genreName varchar(25) not null,
    constraint pk_genre
		primary key (genreId)
);

drop table if exists bookFormat;
create table bookFormat(
	bookId int not null,
    formatId int not null,
    price double,
    quantityOnHand int,
    constraint pk_bookFormat
		primary key (bookId, formatId),
	constraint fk_bookFormat_book
		foreign key (bookId)
        references book(bookId),
    constraint fk_bookFormat_format
		foreign key (formatId)
        references `format`(formatId)
);

drop table if exists bookGenre;
create table bookgenre (
	bookId int not null,
    genreId int not null,
    constraint pk_bookGenre
		primary key (bookId, genreId),
	constraint fk_bookGenre_book
		foreign key (bookId)
        references book(bookId),
	constraint fk_bookGenre_genre
		foreign key (genreId)
        references genre(genreId)
);
