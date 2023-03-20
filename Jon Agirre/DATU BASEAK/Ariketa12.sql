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


