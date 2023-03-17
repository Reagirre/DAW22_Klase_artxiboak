create database ariketa11;

use ariketa11;

CREATE TABLE arduradunak (
    ArduradunKodea NUMERIC(2),
    Izena VARCHAR(10),
    Abizena VARCHAR(10),
    NAN VARCHAR(9),
    Soldata NUMERIC(5),
    PRIMARY KEY (ArduradunKodea)
);


CREATE TABLE gaia (
    ArduradunKodea NUMERIC(2),
    GaiKodea NUMERIC(2),
    Izena VARCHAR(15),
    Armairua NUMERIC(2),
    PRIMARY KEY (GaiKodea),
    FOREIGN KEY (ArduradunKodea)
        REFERENCES arduradunak (ArduradunKodea)
);

CREATE TABLE argitaletxea (
    ArgitalKodea NUMERIC(2),
    Izena VARCHAR(15),
    Sukurtsala VARCHAR(15),
    HarremanPertsona VARCHAR(20),
    Tlfnoa NUMERIC(9),
    PRIMARY KEY (ArgitalKodea)
);

CREATE TABLE liburua (
    LiburuKodea NUMERIC(4),
    ISBN VARCHAR(13),
    Titulua VARCHAR(25),
    Idazlea VARCHAR(20),
    ArgitalKodea NUMERIC(2),
    GaiNagusi NUMERIC(2),
    GaiBi NUMERIC(2),
    PRIMARY KEY (LiburuKodea),
    FOREIGN KEY (ArgitalKodea)
        REFERENCES argitaletxea (ArgitalKodea),
    FOREIGN KEY (GaiNagusi)
        REFERENCES gaia(GaiKodea),
    FOREIGN KEY (GaiBi)
        REFERENCES gaia(GaiKodea)
);
CREATE TABLE alea (
    LiburuKodea NUMERIC(4),
    Signatura VARCHAR(6),
    Urtea NUMERIC(4),
    Prezioa NUMERIC(7 , 2 ),
    PRIMARY KEY (Signatura),
    FOREIGN KEY (LiburuKodea)
        REFERENCES liburua (LiburuKodea)
);

alter table arduradunak add column Titulazioa varchar(20);
alter table arduradunak drop column Soldata;
alter table arduradunak add column Soldata numeric(6);
alter table gaia drop column ArduradunKodea;
alter table gaia drop constraint gaia_ibfk_1;
alter table gaia add column ArduradunKodea numeric(2) ;
alter table gaia add constraint gaia_ibfk_1 FOREIGN KEY (ArduradunKodea)
        REFERENCES arduradunak (ArduradunKodea);

Insert into arduradunak values (1, 'Ana', 'Sola', '11111111A', 'FP 2 Adminis', 782);
Insert into arduradunak values (2, 'Joseba', 'Zabala', '22222222B', 'Liburuzaina', 802);
Insert into arduradunak values (3, 'Mireia', 'Etxeandia', '33333333C', 'Liburuzaina', 1163);
Insert into arduradunak values (5, 'Idoia', 'Arriola', '55555555E', 'FP 2 Informatika', 742);

Insert into gaia values (1, 'Matematika', 2,3);
Insert into gaia values (2, 'Zientziak', 4,1);
Insert into gaia values (3, 'Mekanika', 5,3);
Insert into gaia values (4, 'Informatika', 7,3);
Insert into gaia values (5, 'Elektronika', 8,3);
Insert into gaia values (6, 'Gizarte', 1,5);
Insert into gaia values (7, 'Ingelesa', 10,2);
Insert into gaia values (8, 'Euskara', 2,2);
Insert into gaia values (9, 'Gaztelera', 12,2);
Insert into gaia values (10, 'Frantsesa', 13,5);

Insert into argitaletxea values (1, 'Anaya', 'Bilbo', 'Ana Osa', 941232321);
Insert into argitaletxea values (2, 'Elkar', 'Donosti', 'Mikel Eguren', 943343434);
Insert into argitaletxea values (3, 'Erein', 'Bilbo', 'Josu Zaldua', 941418281);
Insert into argitaletxea values (4, 'Ra-ma', 'Madrid', 'Antonio Perez', 912323232);
Insert into argitaletxea values (5, 'Mac-Graw-Hill', 'Madrid', 'Rosa Guillen', 912345667);
Insert into argitaletxea values (6, 'Oxford', 'Madrid', 'Jose Martin', 914551212);
Insert into argitaletxea values (7, 'Cepe, S.A.', 'Tolosa', 'Maite Etxaniz', 943894070);

Insert into liburua values (1,'84-0023-454-6','Arrantzarako tresnak','Josepe Burgoa',2,8,2);
Insert into liburua values (2,'84-0025-325-9','Ulermen Ariketak','B.E.M.',2,8,6);
Insert into liburua values (3,'84-0025-328-5','Jo ta Ke 2','Txabarri',2,8,null);
Insert into liburua values (4,'84-123-1022-8','Torno convencional','Martin Perez',4,3,2);
Insert into liburua values (5,'84-1236-858-6','Jo ta Ke 1','Txabarri',2,8,null);
Insert into liburua values (6,'84-2525-891-3','Calculo infinitesimal','J.Ortiz',5,1,5);
Insert into liburua values (7,'84-2818-283-7','Algebra de Boole','J. Miller',4,1,4);
Insert into liburua values (8,'84-300-3368-8','Hiztegia 2000','Xabier Kintana',2,8,null);
Insert into liburua values (9,'84-415-0104-1','Access 97','Pablo Garcia',1,4,null);
Insert into liburua values (10,'84-5721-477-3','Euskara lantzen','Xabier Egia',2,8,null);
Insert into liburua values (11,'84-7131-421-5','Micro-80','Nichols',5,4,5);
Insert into liburua values (12,'84-7529-195-3','Matematika 1','Xabier Mendizabal',2,1,3);
Insert into liburua values (13,'84-7614-787-2','Windows 95','Julian Martinez',1,4,5);
Insert into liburua values (14,'84-765-4545-2','Office 97','M.Aguilar',5,4,6);
Insert into liburua values (15,'84-7894-144-2','Electronica basica','Jose Carballar',4,5,2);
Insert into liburua values (16,'84-9187-654-5','Aparato digestivo','Beltran',6,2,6);

Insert into alea values (1,'H-1010',2009,20.48);
Insert into alea values (1,'E-9110',2010,21);
Insert into alea values (2,'A-0909',2008,14.46);
Insert into alea values (3,'E-1235',2008,24.10);
Insert into alea values (4,'J-0923',2007,48.19);
Insert into alea values (5,'E-1234',2008,22.89);
Insert into alea values (6,'A-4545',2006,42.17);
Insert into alea values (6,'A-8998',2006,42.99);
Insert into alea values (7,'M-0676',2006,35.54);
Insert into alea values (8,'I-0012',2006,27.11);
Insert into alea values (9,'G-9181',2011,6.02);
Insert into alea values (10,'H-0019',2006,6.02);
Insert into alea values (11,'A-0034',2006,20.48);
Insert into alea values (12,'H-1231',2007,10.24);
Insert into alea values (12,'M-9123',2007,10.99);
Insert into alea values (13,'G-0345',2010,6.02);
Insert into alea values (14,'I-0191',2010,27.71);
Insert into alea values (14,'I-0192',2012,29.22);
Insert into alea values (15,'U-0939',2009,22.89);
Insert into alea values (16,'D-3543',2010,53.61);


UPDATE gaia 
SET 
    armairua = 6
WHERE
    gaikodea = 8;


UPDATE arduradunak 
SET 
    soldata = soldata - 3
WHERE
    titulazioa = 'Liburuzaina';


UPDATE arduradunak 
SET 
    soldata = soldata + 15
WHERE
    soldata < (SELECT 
            taula.batazbestekoa
        FROM
            (SELECT 
                AVG(soldata) batazbestekoa
            FROM
                arduradunak) AS taula);

DELETE FROM alea 
WHERE
    alea.urtea = 2000 AND alea.prezioa < 10;

DELETE FROM arduradunak 
WHERE
    ArduradunKodea NOT IN (SELECT 
        ArduradunKodea
    FROM
        gaia);



DELETE FROM argitaletxea 
WHERE
    ArgitalKodea > 10;

SELECT 
    liburua.Titulua,
    liburua.Idazlea,
    REPLACE(liburua.Isbn, '-', '*')
FROM
    liburua;


SELECT 
    *
FROM
    liburua
WHERE
    RIGHT(liburua.titulua, 1) RLIKE '[0-9]';


SELECT 
    *, LENGTH(liburua.titulua)
FROM
    liburua
ORDER BY LENGTH(liburua.titulua) ASC
LIMIT 1;


SELECT 
    argitaletxea.ArgitalKodea,
    argitaletxea.Izena,
    COUNT(alea.Signatura)
FROM
    argitaletxea,
    liburuak,
    alea
WHERE
    argitaletxea.ArgitalKodea = liburua.ArgitalKodea
        AND liburua.LiburuKodea = alea.LiburuKodea
        AND MOD(alea.urtea, 2) = 1
GROUP BY argitaletxea.ArgitalKodea;


SELECT 
    izena,
    arduradunak.Abizena,
    arduradunak.Soldata,
    SUBSTRING(arduradunak.soldata, - 2, 1)
FROM
    arduradunak;



SELECT 
    gaia.GaiKodea,
    gaia.izena,
    COUNT(CASE
        WHEN gaia.GaiKodea = liburua.GaiNagusi THEN 1
    END) GaiNagusi,
    COUNT(CASE
        WHEN gaia.GaiKodea = liburua.GaiBi THEN 1
    END) GaiBi
FROM
    gaia
        INNER JOIN
    liburua ON gaia.GaiKodea = liburua.GaiBi
        OR gaia.GaiKodea = liburua.GaiNagusi
GROUP BY gaia.GaiKodea;

SELECT 
    COUNT(alea.Signatura) Alekopurua,
    alea.Urtea,
    SUM(alea.Prezioa)
FROM
    alea
GROUP BY alea.Urtea
ORDER BY COUNT(alea.Signatura) ASC
LIMIT 1;


SELECT 
    COUNT(alea.Signatura),
    SUM(alea.Prezioa),
    MIN(alea.Prezioa),
    MAX(alea.Prezioa),
    AVG(alea.Prezioa)
FROM
    alea
        INNER JOIN
    liburua ON alea.LiburuKodea = liburua.LiburuKodea
GROUP BY RIGHT(liburua.isbn, 1);



SELECT 
    alea.Signatura, liburua.Titulua, liburua.ISBN
FROM
    alea
        INNER JOIN
    liburua ON alea.LiburuKodea = liburua.LiburuKodea
WHERE
    MID(alea.signatura, 3, 1) IN (0 , 9);


/***********17******************/
SELECT 
    liburua.titulua,
    LENGTH(liburua.titulua) - LENGTH(REPLACE(liburua.titulua, ' ', '')) + 1 hitz_kopurua
FROM
    liburua;


-- /*********18******************/
SELECT 
    liburua.Titulua,
    (LENGTH(liburua.titulua) - LENGTH(REPLACE(LCASE(liburua.titulua), 'a', ''))) + 
    (LENGTH(liburua.titulua) - LENGTH(REPLACE(LCASE(liburua.titulua), 'e', ''))) + 
    (LENGTH(liburua.titulua) - LENGTH(REPLACE(LCASE(liburua.titulua), 'i', ''))) + 
    (LENGTH(liburua.titulua) - LENGTH(REPLACE(LCASE(liburua.titulua), 'o', ''))) + 
    (LENGTH(liburua.titulua) - LENGTH(REPLACE(LCASE(liburua.titulua), 'u', ''))) bokal_kantitatea
FROM
    liburua;


/*************20******************/
SELECT 
    REPLACE(liburua.titulua, ' ', '*'),
    REPLACE(LCASE(REPLACE(LCASE(REPLACE(LCASE(REPLACE(LCASE(REPLACE(LCASE(liburua.titulua),
                                                        'a',
                                                        '1')),
                                            'o',
                                            '4')),
                                'i',
                                '3')),
                    'e',
                    '2')),
        'a',
        '1')
FROM
    liburua;


/*************21******************/
SELECT 
    alea.Signatura,
    liburua.ISBN,
    liburua.Titulua,
    alea.Prezioa,
    argitaletxea.ArgitalKodea,
    argitaletxea.Izena,
    gaia.GaiKodea,
    gaia.Izena
FROM
    alea
        INNER JOIN
    liburua ON alea.LiburuKodea = liburua.LiburuKodea
        INNER JOIN
    argitaletxea ON liburua.ArgitalKodea = argitaletxea.ArgitalKodea
        INNER JOIN
    gaia ON liburua.GaiNagusi = gaia.GaiKodea;


/*************22******************/
SELECT 
    alea.Signatura,
    liburua.ISBN,
    liburua.Titulua,
    alea.Prezioa,
    argitaletxea.ArgitalKodea,
    argitaletxea.Izena,
    gaia1.GaiKodea,
    gaia1.Izena,
    gaia2.GaiKodea,
    gaia2.Izena
FROM
    alea
        INNER JOIN
    liburua ON alea.LiburuKodea = liburua.LiburuKodea
        INNER JOIN
    argitaletxea ON liburua.ArgitalKodea = argitaletxea.ArgitalKodea
        INNER JOIN
    gaia gaia1 ON liburua.GaiNagusi = gaia1.GaiKodea
        INNER JOIN
    gaia gaia2 ON liburua.GaiBi = gaia2.GaiKodea;


/*************25******************/
SELECT 
    liburua.Titulua, liburua.Idazlea, liburua.ISBN, gaia.Izena
FROM
    liburua
        INNER JOIN
    gaia ON liburua.GaiNagusi = gaia.GaiKodea
WHERE
    gaia.Izena LIKE 'e%'
        AND LENGTH(liburua.titulua) = 7;


/*************26******************/
SELECT 
    liburua.Titulua,
    liburua.Idazlea,
    liburua.ISBN,
    alea.Signatura,
    alea.Urtea,
    argitaletxea.Izena
FROM
    liburua
        INNER JOIN
    alea ON liburua.LiburuKodea = alea.LiburuKodea
        INNER JOIN
    argitaletxea ON liburua.ArgitalKodea = argitaletxea.ArgitalKodea;


/*************27******************/
SELECT 
    SUM(alea.Prezioa)
FROM
    alea;

SELECT 
    COUNT(liburua.LiburuKodea)
FROM
    liburua;

SELECT 
    COUNT(alea.Signatura)
FROM
    alea;


/*************28******************/
SELECT 
    alea.Signatura,
    liburua.ISBN,
    liburua.Titulua,
    liburua.Idazlea,
    alea.Prezioa
FROM
    alea
        INNER JOIN
    liburua ON liburua.LiburuKodea = alea.LiburuKodea
WHERE
    alea.Prezioa > 24
ORDER BY liburua.Titulua ASC;


/*************29******************/
 SELECT 
    alea.*, liburua.Idazlea, liburua.Titulua
FROM
    alea
        INNER JOIN
    liburua ON alea.LiburuKodea = liburua.LiburuKodea
where (select avg(alea.Prezioa) from alea) < alea.Prezioa;


/************* 30******************/
SELECT 
    gaia.Izena,
    arduradunak.Izena,
    arduradunak.Abizena,
    COUNT(alea.Signatura),
    SUM(alea.Prezioa)
FROM
    gaia
        INNER JOIN
    arduradunak ON gaia.ArduradunKodea = arduradunak.ArduradunKodea
        INNER JOIN
    liburua ON gaia.GaiKodea = liburua.GaiNagusi
        INNER JOIN
    alea ON alea.LiburuKodea = liburua.LiburuKodea
GROUP BY gaia.izena;


/************* 32******************/
SELECT 
    gaia.izena, gaia.Armairua
FROM
    gaia
        INNER JOIN
    liburua ON gaia.GaiKodea = liburua.GaiNagusi
        INNER JOIN
    alea ON liburua.LiburuKodea = alea.LiburuKodea
GROUP BY gaia.Izena
HAVING COUNT(alea.Signatura) > 4
    OR SUM(alea.Prezioa) > 120;


/************* 33******************/
SELECT 
    gaia.Izena,
    gaia.Armairua,
    COUNT(alea.Signatura),
    COUNT(liburua.LiburuKodea),
    SUM(alea.Prezioa)
FROM
    gaia
        INNER JOIN
    liburua ON gaia.GaiKodea = liburua.GaiNagusi
        INNER JOIN
    alea ON alea.LiburuKodea = liburua.LiburuKodea
GROUP BY gaia.Izena;


/************* 34******************/
SELECT 
    arduradunak.Abizena,
    arduradunak.Izena,
    arduradunak.Titulazioa,
    gaia.Izena,
    COUNT(DISTINCT liburua.LiburuKodea)
FROM
    arduradunak
        INNER JOIN
    gaia ON arduradunak.ArduradunKodea = gaia.ArduradunKodea
        INNER JOIN
    liburua ON liburua.GaiNagusi = gaia.GaiKodea
GROUP BY arduradunak.ArduradunKodea;


/************* 35 ******************/
SELECT 
    arduradunak.Izena,
    arduradunak.Abizena,
    arduradunak.Titulazioa,
    COUNT(DISTINCT gaia.GaiKodea),
    COUNT(DISTINCT liburua.LiburuKodea)
FROM
    arduradunak
        INNER JOIN
    gaia ON arduradunak.ArduradunKodea = gaia.ArduradunKodea
        INNER JOIN
    liburua ON gaia.GaiKodea = liburua.GaiNagusi
GROUP BY arduradunak.ArduradunKodea;


/************* 36 ******************/
/*SELECT 
    argitaletxea.Izena, argitaletxea.Sukurtsala
FROM
    argitaletxea
WHERE
    ArgitalKodea NOT IN (SELECT 
            liburua.ArgitalKodea
        FROM
            liburua);*/


/************* 36 ******************/
SELECT 
    alea.Signatura,
    liburua.ISBN,
    liburua.Titulua,
    gaia.Izena,
    arduradunak.Izena,
    arduradunak.Abizena
FROM
    alea
        INNER JOIN
    liburua ON alea.LiburuKodea = liburua.LiburuKodea
        INNER JOIN
    gaia ON liburua.GaiNagusi = gaia.GaiKodea
        INNER JOIN
    arduradunak ON arduradunak.ArduradunKodea = gaia.ArduradunKodea
WHERE
    arduradunak.ArduradunKodea = (SELECT 
            arduradunak.ArduradunKodea
        FROM
            arduradunak
        ORDER BY Soldata DESC
        LIMIT 1);


/************* 37 ******************/
SELECT 
    argitaletxea.Izena, liburua.Titulua, liburua.ISBN
FROM
    liburua
        INNER JOIN
    argitaletxea ON liburua.ArgitalKodea = argitaletxea.ArgitalKodea
        INNER JOIN
    alea ON alea.LiburuKodea = liburua.LiburuKodea
WHERE
    alea.Prezioa = (SELECT 
            MAX(alea.Prezioa)
        FROM
            alea);


/************* 38 ******************/
SELECT 
    COUNT(liburua.LiburuKodea), argitaletxea.Izena
FROM
    liburua
        INNER JOIN
    argitaletxea ON liburua.ArgitalKodea = argitaletxea.ArgitalKodea
GROUP BY liburua.ArgitalKodea
ORDER BY COUNT(liburua.LiburuKodea) DESC
LIMIT 1;


/************* 40 ******************/
SELECT 
    liburua.Titulua, liburua.Idazlea, alea.Signatura
FROM
    liburua
        INNER JOIN
    alea ON liburua.LiburuKodea = alea.LiburuKodea
        INNER JOIN
    gaia ON liburua.GaiNagusi = gaia.GaiKodea
        OR liburua.GaiBi = gaia.GaiKodea
WHERE
    gaia.Izena = 'Elektronika';


/************* 41 ******************/
SELECT 
    argitaletxea.Izena,
    gaia.Izena,
    COUNT(DISTINCT liburua.LiburuKodea),
    COUNT(alea.Signatura),
    SUM(alea.Prezioa)
FROM
    argitaletxea
        INNER JOIN
    liburua ON argitaletxea.ArgitalKodea = liburua.ArgitalKodea
        INNER JOIN
    gaia ON gaia.GaiKodea = liburua.GaiNagusi
        INNER JOIN
    alea ON alea.LiburuKodea = liburua.LiburuKodea
GROUP BY gaia.GaiKodea , argitaletxea.ArgitalKodea;


/************* 42 ******************/
SELECT 
    argitaletxea.Izena,
    COUNT(DISTINCT liburua.LiburuKodea),
    COUNT(alea.Signatura),
    COUNT(DISTINCT gaia.GaiKodea),
    SUM(alea.Prezioa)
FROM
    argitaletxea
        INNER JOIN
    liburua ON argitaletxea.ArgitalKodea = liburua.ArgitalKodea
        INNER JOIN
    gaia ON gaia.GaiKodea = liburua.GaiNagusi
        INNER JOIN
    alea ON alea.LiburuKodea = liburua.LiburuKodea
GROUP BY argitaletxea.ArgitalKodea;


/************* 43 ******************/
SELECT 
    gaia.Izena
FROM
    gaia
WHERE
    gaia.GaiKodea NOT IN (SELECT 
            liburua.GaiNagusi
        FROM
            liburua
                INNER JOIN
            alea ON liburua.LiburuKodea = alea.LiburuKodea
        WHERE
            alea.Prezioa BETWEEN 12 AND 50);