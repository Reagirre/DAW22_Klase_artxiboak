use oracleariketa2;

SELECT 
    *
FROM
    departa;

UPDATE langile 
SET 
    langile.soldata = langile.soldata + 1;


SELECT 
    langile.lan_zk,
    langile.abizena,
    langile.soldata,
    departa.depizen,
    departa.dept_zk
FROM
    langile
        INNER JOIN
    departa ON langile.dept_zk = departa.dept_zk;


CREATE VIEW BAT AS
    SELECT 
        langile.lan_zk,
        langile.abizena,
        langile.soldata,
        departa.depizen
    FROM
        langile
            INNER JOIN
        departa ON langile.dept_zk = departa.dept_zk;


CREATE TABLE AAA (
    aa NUMERIC(2) PRIMARY KEY,
    nn VARCHAR(10)
);


insert into AAA values(1, 'kaixo');
insert into AAA values(2, 'agur');


UPDATE aaa 
SET 
    nn = UCASE(nn);

use ariketa10;

UPDATE ikasle_notak 
SET 
    nota1 = nota1 - 1
WHERE
    ikasle_notak.Ikasle_izena = (SELECT 
            ikasle_izena
        FROM
            (SELECT 
                ikasle_notak.ikasle_izena
            FROM
                ikasle_notak
            ORDER BY ikasle_notak.nota1 ASC
            LIMIT 1) AS taula);


