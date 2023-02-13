create database Azterketa_Errepaso;

use azterketa_errepaso;


CREATE TABLE ikastola (
    ikaskodea NUMERIC(3) PRIMARY KEY,
    mota CHAR(1),
    izena VARCHAR(30),
    helbidea VARCHAR(40),
    telefonoa NUMERIC(9),
    plazakopurua NUMERIC(4),
    constraint cd_mota CHECK (mota = 'H' OR 'L' OR 'B'),
    constraint ck_plazakopurua CHECK (250 <= plazakopurua <= 2600)
);

create table egitura(
ikaskodea numeric(3),
langikodea numeric(4) not null,
nan varchar(9) not null,
abizena varchar(30) not null,
funtzioa varchar(15),
soldata numeric(5),
primary key(ikaskodea, langikodea),

