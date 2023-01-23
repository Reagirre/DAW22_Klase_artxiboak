create database oracleariketak3;
use oracleariketak3;

create table ikasle_notak(
ikasle_izena varchar(25) not null,
nota1 numeric(2),
nota2 numeric(2),
nota3 numeric(2),
primary key (ikasle_izena)
);

insert into ikasle_notak values('Alcalde Zugaza, Josu',5,4,4);
insert into ikasle_notak values('Elu Agirre, Koldo',7,6,8);
insert into ikasle_notak values('Bengoa Garro, Amaia',4,3,5);
insert into ikasle_notak values('Txurruka Arregi, Miren',8,7,9);
insert into ikasle_notak values('Gandiaga Laka, Ander',3,4,3);
insert into ikasle_notak values('Perez Bilbao, Begoña',6,5,7);
insert into ikasle_notak values('Garcia Burgoa, Luis',5,5,5);
insert into ikasle_notak values('Olate Mendia, Ander',3,4,5);
insert into ikasle_notak values('Mendizabal Arrate, Luis',7,6,7);
insert into ikasle_notak values('Zabala Osa, Jon',4,3,3);
insert into ikasle_notak values('Agirre Albizu, Ana',8,3,6);
insert into ikasle_notak values('Zuazua Agirre, Luken',3,4,2);
insert into ikasle_notak values('Aperribai Bengoa, Xabier',9,8,9);

SELECT 
    ikasle_notak.ikasle_izena,
    ikasle_notak.nota1,
    ikasle_notak.nota2,
    ikasle_notak.nota3,
    (nota1 + nota2 + nota3) / 3 batazbestekoa
FROM
    ikasle_notak
    order by batazbestekoa asc;



SELECT 
    *
FROM
    ikasle_notak
WHERE
    ikasle_notak.nota1 >= 5
        AND ikasle_notak.nota2 >= 5
        AND ikasle_notak.nota3 >= 5;


SELECT 
    *
FROM
    ikasle_notak
WHERE
    ikasle_notak.nota1 < 5
        OR ikasle_notak.nota2 < 5
        OR ikasle_notak.nota3 < 5;
SELECT 
    *
FROM
    ikasle_notak
WHERE
    nota1 IN (6 , 7) OR nota2 IN (6 , 7)
        OR nota3 IN (6 , 7);




SELECT 
    *
FROM
    ikasle_notak
WHERE
    ((nota1 + nota2 + nota3) / 3) > (SELECT 
            AVG((nota1 + nota2 + nota3) / 3) batazbestekoa
        FROM
            ikasle_notak);

SELECT 
    COUNT(ikasle_notak.ikasle_izena)
FROM
    ikasle_notak
WHERE
    ((nota1 + nota2 + nota3) / 3) >= 5;
    
    