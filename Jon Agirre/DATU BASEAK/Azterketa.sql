create database azterketa;

use azterketa;

CREATE TABLE DEPARTAMENTU (
    ID NUMERIC(3) PRIMARY KEY,
    IZENA VARCHAR(100) NOT NULL,
    AURREKONTU NUMERIC(7) NOT NULL,
    GASTUA NUMERIC(7) NOT NULL
);

CREATE TABLE LANGILE (
    ID NUMERIC(3),
    NAN VARCHAR(9) NOT NULL,
    IZENA VARCHAR(25) NOT NULL,
    ABIZENA VARCHAR(25) NOT NULL,
    ABIZENA2 VARCHAR(25),
    DEPT_ID NUMERIC(3),
    PRIMARY KEY (Id , NAN),
    FOREIGN KEY (DEPT_ID)
        REFERENCES DEPARTAMENTU (ID)
);

alter table LANGILE add constraint cd_NAN unique (NAN);

ALTER TABLE LANGILE ADD column SOLDATA NUMERIC(5);

ALTER TABLE LANGILE ADD CONSTRAINT CD_SOLDATA check (SOLDATA > 500);

ALTER TABLE LANGILE DROP CONSTRAINT CD_SOLDATA;

ALTER TABLE LANGILE DROP column SOLDATA;


INSERT INTO DEPARTAMENTU VALUES(1, 'Desarrollo', 120000, 6000);
INSERT INTO DEPARTAMENTU VALUES(2, 'Sistemas', 150000, 21000);
INSERT INTO DEPARTAMENTU VALUES(3, 'Recursos Humanos', 280000, 25000);
INSERT INTO DEPARTAMENTU VALUES(4, 'Contabilidad', 110000, 3000);
INSERT INTO DEPARTAMENTU VALUES(5, 'I+D', 375000, 380000);
INSERT INTO DEPARTAMENTU VALUES(6, 'Proyectos', 0, 0);
INSERT INTO DEPARTAMENTU VALUES(7, 'Publicidad', 0, 1000);
INSERT INTO LANGILE VALUES(1, '32481596F', 'Aitor', 'Rivero', 'Gómez', 1);
INSERT INTO LANGILE VALUES(2, 'Y5575632D', 'Asier', 'Salas', 'Díaz', 2);
INSERT INTO LANGILE VALUES(3, 'R6970642B', 'Ana', 'Rubio', 'Flores', 3);
INSERT INTO LANGILE VALUES(4, '77705545E', 'Angel', 'Suárez', NULL, 4);
INSERT INTO LANGILE VALUES(5, '17087203C', 'Mikel', 'Loyola', 'Méndez', 5);
INSERT INTO LANGILE VALUES(6, '38382980M', 'Maialen', 'Santana', 'Moreno', 1);
INSERT INTO LANGILE VALUES(7, '80576669X', 'Peru', 'Ruiz', NULL, 2);
INSERT INTO LANGILE VALUES(8, '71651431Z', 'Pepe', 'Ruiz', 'Santana', 3);
INSERT INTO LANGILE VALUES(9, '56399183D', 'Juan', 'Gómez', 'López', 2);
INSERT INTO LANGILE VALUES(10, '46384486H', 'Diego','Flores', 'Salas', 5);
INSERT INTO LANGILE VALUES(11, '67389283A', 'Malen','Herrera', 'Gil', 1);
INSERT INTO LANGILE VALUES(12, '41234836R', 'Irene','Salas', 'Flores', NULL);
INSERT INTO LANGILE VALUES(13, '82635162B', 'Juan Antonio','Sáez', 'Guerrero', NULL);


/* Ariketa 8 */

SELECT 
    DEPARTAMENTU.AURREKONTU
FROM
    DEPARTAMENTU
WHERE
    departamentu.AURREKONTU > 1500;
    

/* Ariketa 9 */

SELECT 
    departamentu.IZENA, departamentu.AURREKONTU
FROM
    departamentu
WHERE
    departamentu.AURREKONTU > 100000
        AND departamentu.AURREKONTU < 200000;
        

/* Ariketa 10 */

SELECT 
    LANGILE.*
FROM
    LANGILE
WHERE
    langile.ABIZENA2 NOT LIKE (SELECT ISNULL(LANGILE.ABIZENA2));
    

/* Ariketa 11 */

SELECT 
    LANGILE.IZENA,
    langile.ABIZENA,
    langile.ABIZENA2,
    langile.NAN
FROM
    departamentu,
    langile
WHERE
    departamentu.ID = langile.DEPT_ID
        AND (departamentu.ID = 2
        OR departamentu.ID = 4
        OR departamentu.ID = 5);


/* Ariketa 12 */

SELECT 
    langile.*
FROM
    langile,
    departamentu
WHERE
    departamentu.ID = langile.DEPT_ID
        AND departamentu.IZENA = 'I+D';
        

/* Ariketa 13 */

SELECT 
    langile.*
FROM
    langile
WHERE
    langile.DEPT_ID IS NULL
ORDER BY langile.izena ASC;
    

/* Ariketa 14 */

SELECT 
    departamentu.IZENA
FROM
    langile,
    departamentu
WHERE
    departamentu.ID = langile.DEPT_ID
        AND langile.izena = 'Pepe'
        AND langile.ABIZENA = 'Ruiz'
        AND langile.ABIZENA2 = 'Santana';
        

/* Ariketa 15 */

SELECT 
    departamentu.IZENA, departamentu.AURREKONTU
FROM
    departamentu
WHERE
    departamentu.AURREKONTU = (SELECT MAX(departamentu.AURREKONTU) from departamentu);
    

/* Ariketa 16 */

SELECT 
    COUNT(*) Langile_kopurua
FROM
    langile
        INNER JOIN
    departamentu ON departamentu.ID = langile.DEPT_ID
WHERE
    departamentu.AURREKONTU > 200000;

/* Ariketa 17 */

SELECT 
    departamentu.IZENA, COUNT(*)
FROM
    langile
        INNER JOIN
    departamentu ON departamentu.ID = langile.DEPT_ID;
    

/* Ariketa 18 */

SELECT 
    departamentu.IZENA, departamentu.AURREKONTU
FROM
    departamentu
WHERE
    departamentu.AURREKONTU = (SELECT MAX(departamentu.AURREKONTU) from departamentu);
    

/* Ariketa 19 */

SELECT langile;
    

/* Ariketa 20 */

SELECT langile;