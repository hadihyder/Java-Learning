DROP DATABASE IF EXISTS vinylrecordshop;

CREATE DATABASE vinylrecordshop;

USE vinylrecordshop;

--
-- Table structure for table `album`
--

DROP TABLE IF EXISTS `album`;

CREATE TABLE `album` (
  `albumId` int NOT NULL AUTO_INCREMENT,
  `albumTitle` varchar(100) NOT NULL,
  `label` varchar(50),
  `releaseDate` date,
  `price` decimal(5,2),
  PRIMARY KEY (`albumId`)
);
--
-- Table structure for table `artist`
--

DROP TABLE IF EXISTS `artist`;

CREATE TABLE `artist` (
  `artistId` int NOT NULL AUTO_INCREMENT,
  `artistFirstName` varchar(100),
  `artistLastName` varchar(100) NOT NULL,
  PRIMARY KEY (`artistId`)
);

--
-- Table structure for table `band`
--

DROP TABLE IF EXISTS `band`;

CREATE TABLE `band` (
  `bandId` int NOT NULL AUTO_INCREMENT,
  `bandName` varchar(100) NOT NULL,
  PRIMARY KEY (`bandId`)
);

--
-- Table structure for table `bandartist`
--

DROP TABLE IF EXISTS `bandartist`;

CREATE TABLE `bandartist` (
  `bandId` int NOT NULL,
  `artistId` int NOT NULL,
  PRIMARY KEY (`bandId`,`artistId`),
  KEY `fk_bandArtist_artist` (`artistId`),
  CONSTRAINT `fk_bandArtist_artist` FOREIGN KEY (`artistId`) REFERENCES `artist` (`artistId`),
  CONSTRAINT `fk_bandArtist_band` FOREIGN KEY (`bandId`) REFERENCES `band` (`bandId`)
);

--
-- Table structure for table `song`
--

DROP TABLE IF EXISTS `song`;

CREATE TABLE `song` (
  `songId` int NOT NULL AUTO_INCREMENT,
  `songTitle` varchar(100) NOT NULL,
  `videoURL` varchar(100),
  `bandId` int NOT NULL,
  PRIMARY KEY (`songId`),
  KEY `fk_song_band` (`bandId`),
  CONSTRAINT `fk_song_band` FOREIGN KEY (`bandId`) REFERENCES `band` (`bandId`)
);

--
-- Table structure for table `songalbum`
--

DROP TABLE IF EXISTS `songalbum`;

CREATE TABLE `songalbum` (
  `songId` int NOT NULL,
  `albumId` int NOT NULL,
  PRIMARY KEY (`songId`,`albumId`),
  KEY `fk_songAlbum_album` (`albumId`),
  CONSTRAINT `fk_songAlbum_album` FOREIGN KEY (`albumId`) REFERENCES `album` (`albumId`),
  CONSTRAINT `fk_songAlbum_song` FOREIGN KEY (`songId`) REFERENCES `song` (`songId`)
);


