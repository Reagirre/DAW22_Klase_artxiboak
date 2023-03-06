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