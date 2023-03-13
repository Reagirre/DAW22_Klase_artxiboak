create database ariketa10;
use ariketa10;

create table ikasle_notak(
ikasle_izena varchar(20) primary key,
nota1 numeric(2),
nota2 numeric(2),
nota3 numeric(2)
);

alter table ikasle_notak modify column ikasle_izena varchar(30);

insert into ikasle_notak values('Alcalde Zugaza, Josu','5','4','4');
insert into ikasle_notak values('Elu Agirre, Koldo','7','6','8');
insert into ikasle_notak values('Bengoa Garro, Amaia','4','3','5');
insert into ikasle_notak values('Txurruka Arregi, Miren','8','7','9');
insert into ikasle_notak values('Gandiaga Laka, Ander','3','4','3');
insert into ikasle_notak values('Perez Bilbao, Begoña','6','5','7');
insert into ikasle_notak values('Garcia Burgoa, Luis','5','5','5');
insert into ikasle_notak values('Olate Mendia, Ander','3','4','5');
insert into ikasle_notak values('Mendizabal Arrate, Luis','7','6','7');
insert into ikasle_notak values('Zabala Osa, Jon','4','3','3');
insert into ikasle_notak values('Agirre Albizu, Ana','8','3','6');
insert into ikasle_notak values('Zuazua Agirre, Luken','3','4','2');
insert into ikasle_notak values('Aperribai Bengoa, Xabier','9','8','9');


CREATE TABLE notak LIKE ikasle_notak;

insert into notak select upper(ikasle_notak.ikasle_izena), nota1, nota2, nota3 
from ikasle_notak;

insert into notak values ('Zugaza Alcalde, Koldo ','9','9','5');
insert into notak values ('Agirre Elu, Josu ','6','6','6');
insert into notak values ('Arregi Bengoa, Amaia','8','9','7');
insert into notak values ('Garro Txurruka, Miren ','7','8','7');

update notak 
set notak.nota3 = 6
where notak.ikasle_izena like '%, Luis';


update notak 
set notak.nota1 = 5, notak.nota2 = 6, notak.nota3 = 6
where notak.ikasle_izena like 'Alcalde %';

update notak 
set nota2 = nota2 - 2
where notak.ikasle_izena like '% Txurruka, %';

UPDATE notak 
SET 
    nota1 = nota1 + 1,
    nota2 = nota2 + 1
WHERE
    notak.ikasle_izena LIKE 'Agirre %'
        OR notak.ikasle_izena LIKE '% Agirre, %';



UPDATE notak 
SET 
    nota1 = nota1 + 1
WHERE
    notak.nota1 < (SELECT 
            AVG(nota1)
        FROM
            notak);

UPDATE notak 
SET 
    nota3 = nota3 + 1
WHERE
    nota1 >= nota3 AND nota2 >= nota3;


UPDATE notak 
SET 
    nota2 = nota2 - 1
WHERE
    binary(ikasle_izena) = binary(upper(ikasle_izena));


commit;

delete from notak where nota3 = 4;

select (nota1 + nota2 + nota3)/3 batazbestekoa, notak.ikasle_izena
from notak



where (nota1 + nota2 + nota3)/3 > 8;

delete from notak where (nota1 + nota2 + nota3)/3 > 8;


SELECT 
    LENGTH(notak.ikasle_izena) luzeera
FROM
    notak
ORDER BY luzeera DESC
LIMIT 1;


rollback;

insert into notak select * from ikasle_notak 
where ikasle_notak.ikasle_izena like '% %, Luken' or ikasle_notak.ikasle_izena like '% %, Luis';


insert into notak select * from ikasle_notak 
where ikasle_notak.ikasle_izena like '% Bengoa, %' 
or ikasle_notak.ikasle_izena like '% Agirre, %'
or ikasle_notak.ikasle_izena like '% Bilbao, %';


update notak
set notak.ikasle_izena = replace(notak.ikasle_izena, 'Ana', 'Ane')
where notak.ikasle_izena like '% %, Ana';

alter table notak add column Izena varchar(15);
alter table notak add column Abizena1 varchar(15);
alter table notak add column Abizena2 varchar(15);


select locate(' ', ikasle_izena),
left(ikasle_izena, locate(' ', ikasle_izena)),
mid(ikasle_izena, locate(' ', ikasle_izena),locate(',', ikasle_izena) - locate(' ', ikasle_izena)),
right(ikasle_izena, length(ikasle_izena)- locate(',', ikasle_izena))
from notak;


UPDATE notak 
SET abizena1 = LEFT(ikasle_izena, LOCATE(' ', ikasle_izena)),
abizena2 = mid(ikasle_izena, LOCATE(' ', ikasle_izena),  LOCATE(',', ikasle_izena) -  LOCATE(' ', ikasle_izena)),
Izena = right(ikasle_izena,  length(ikasle_izena) -  LOCATE(',', ikasle_izena));
