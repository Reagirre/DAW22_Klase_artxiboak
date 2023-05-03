create database kantak;

use kantak;

create table kantak(
	id int primary key auto_increment,
    izenburua varchar(50),
    egilea varchar(50),
    urtea int,
    minutuak int,
    segunduak int,
    fitxategia varchar(50)
);
