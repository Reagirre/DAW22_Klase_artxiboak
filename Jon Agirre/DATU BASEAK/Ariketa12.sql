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


SELECT 
    ikasle_notak.ikasle_izena,
    GREATEST(nota1, nota2, nota3),
    LEAST(nota1, nota2, nota3),
    ((nota1 + nota2 + nota3) / 3)
FROM
    ikasle_notak;


set password for 'ane'@'localhost' = '0001';


use oracleariketa2;

SELECT 
    departa.depizen,
    langile.abizena,
    langile.soldata,
    bajak.zergatia,
    bajak.baja
FROM
    departa
        INNER JOIN
    langile ON departa.dept_zk = langile.dept_zk
        INNER JOIN
    bajak ON bajak.lan_zk = langile.lan_zk
WHERE
    bajak.alta IS NULL;


SELECT 
    COUNT(langile.lan_zk) langileak
FROM
    langile
        INNER JOIN
    bajak ON bajak.lan_zk = langile.lan_zk
        INNER JOIN
    departa ON langile.dept_zk = departa.dept_zk
WHERE
    bajak.alta IS NULL
        AND departa.depizen = 'salmentak';


UPDATE bajak 
SET 
    bajak.alta = CURDATE()
WHERE
    bajak.lan_zk = (SELECT 
            langile.lan_zk
        FROM
            langile
        WHERE
            langile.abizena = 'Longarte')
        AND bajak.alta IS NULL;


SELECT 
    langile.abizena,
    langile.lanbidea,
    langile.soldata,
    ikastaro.ikastaro_izena,
    ikastaro.hasi,
    ikastaro.bukatu,
    ikastaro.orduak
FROM
    langile
        INNER JOIN
    ikastaro ON langile.lan_zk = ikastaro.lan_zk
        INNER JOIN
    departa ON departa.dept_zk = langile.dept_zk
WHERE
    departa.depizen = 'Ikerketa';


