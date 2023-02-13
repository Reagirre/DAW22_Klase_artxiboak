create database Azterketa_Errepaso;

use azterketa_errepaso;


CREATE TABLE ikastola (
    ikaskodea NUMERIC(3) PRIMARY KEY,
    mota CHAR(1),
    izena VARCHAR(30),
    helbidea VARCHAR(40),
    telefonoa NUMERIC(9),
    plazakopurua NUMERIC(4),
    CONSTRAINT cd_mota CHECK (mota = 'H' OR 'L' OR 'B'),
    CONSTRAINT ck_plazakopurua CHECK (250 <= plazakopurua <= 2600)
);

CREATE TABLE egitura (
    ikaskodea NUMERIC(3),
    langikodea NUMERIC(4) NOT NULL,
    nan VARCHAR(9) NOT NULL,
    abizena VARCHAR(30) NOT NULL,
    funtzioa VARCHAR(15),
    soldata NUMERIC(5),
    PRIMARY KEY (ikaskodea , langikodea),
    CONSTRAINT ck_nan UNIQUE (nan),
    CONSTRAINT ck_soldata CHECK (soldata > 1200),
    CONSTRAINT ck_funtzioa CHECK (Funtzioa = 'Bedel' OR 'garbiketa'
        OR 'zuzendaritza'
        OR 'idazkaritza'),
    FOREIGN KEY (Ikaskodea)
        REFERENCES ikastola(ikaskodea)
        ON DELETE CASCADE
);

CREATE TABLE irakasle (
    ikaskodea NUMERIC(3),
    langikodea NUMERIC(4) NOT NULL,
    nan VARCHAR(9) NOT NULL,
    hasi DATE,
    abizena VARCHAR(30) NOT NULL,
    mailaira NUMERIC(1),
    bitxikeriak VARCHAR(50),
    PRIMARY KEY (ikaskodea , langikodea),
    CONSTRAINT ck_nan2 UNIQUE (nan),
    FOREIGN KEY (Ikaskodea)
        REFERENCES ikastola (ikaskodea)
        ON DELETE CASCADE
);

alter table ikastola modify column izena varchar(40);

alter table ikastola drop column telefonoa;

alter table egitura drop constraint ck_soldata;

alter table irakasle rename column mailaira to maila;

alter table irakasle add column soldata numeric(5) NOT NULL;

alter table irakasle add column gehigarri numeric(4)  default(0);

alter table ikastola drop constraint cd_mota;

alter table ikastola add constraint cd_mota CHECK (mota = 'H' OR mota = 'L' OR mota = 'B');

alter table egitura drop constraint ck_funtzioa;

alter table egitura add constraint cd_funtzioa CHECK (Funtzioa = 'Bedel' OR Funtzioa = 'garbiketa' OR Funtzioa = 'zuzendaritza' OR Funtzioa = 'idazkaritza');

insert into ikastola values('101','H', 'Goiko ikastola', 'Erreka plaza, 123', '1200');
insert into ikastola values('119','B', 'Txikun ikastola', 'Isasi, 112', '260');
insert into ikastola values('123','L', 'Arizmen ikastola', 'Ardatz etorbidea, 45', '750');
insert into ikastola values('159','B', 'Toribio ikastola', 'Isasi, 40', '1520');

insert into egitura values('123', '5', '12121212R', 'Zubillaga', 'Garbiketa', '660');
insert into egitura values('101', '9', '89898989Z', 'Diaz de Zarate', 'Zuzendaritza', '2600');
insert into egitura values('101', '4', '45454545S', 'Trueba', 'Bedel', '850');
insert into egitura values('123', '10', '12312312W', 'Lopez de Ipiña', 'Bedel', '700');
insert into egitura values('159', '11', '88888888X', 'Zelaia', 'Zuzendaritza', '2800');

insert into irakasle values('159','14','77777777K','2000-12-12','Larrauri','2','Titularra', null,'1500');
insert into irakasle values('123','32','11111111A','1999-06-01','Bengoa','3','Sortzailea', '250','1700');
insert into irakasle values('101','35','22222222B','2002-02-13','Isasi','3','Erantsia', null,'1200');
insert into irakasle values('159','44','44444444C','2002-09-02','Zelaia','1','Sortzailea', null,'2250');
insert into irakasle values('101','45','11444444K','2009-01-09','Arruti','4','Titularra', null,'1700');
insert into irakasle values('101','47','55555555K','2009-05-19','Loizate','4','Titularra', '150','1200');
insert into irakasle values('123','55','25252525K','2015-08-13','Arana','4','Erantsia', '200','1100');


