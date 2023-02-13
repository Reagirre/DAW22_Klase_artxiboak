use oracleariketa2;

SELECT 
    POSITION('a' IN langile.abizena)
FROM
    langile;

SELECT 
    LOCATE('a', langile.abizena)
FROM
    langile;

SELECT 
    LENGTH(langile.abizena), langile.abizena
FROM
    langile;


SELECT 
    LENGTH(departa.herria), departa.herria
FROM
    departa;


SELECT ASCII('m');

SELECT 
    LCASE(langile.abizena)
FROM
    langile;

SELECT 
    UCASE(langile.abizena)
FROM
    langile;


SELECT 
    CONCAT('ABIZENA:', UCASE(langile.abizena))
FROM
    langile;

SELECT 
    LPAD(langile.abizena, 30, ';')
FROM
    langile;


SELECT 
    LEFT(langile.abizena, 3)
FROM
    langile;




SELECT 
    SUBSTRING(langile.abizena, 3, 2)
FROM
    langile;




SELECT 
    MAX(LENGTH(langile.abizena)), langile.abizena
FROM
    langile
WHERE
    LENGTH(langile.abizena) = (SELECT 
            MAX(LENGTH(langile.abizena))
        FROM
            langile);




SELECT CURRENT_DATE();

SELECT QUARTER('2023-08-23');

SELECT 
    DAYOFYEAR(CURRENT_DATE()),
    DAYOFMONTH(CURRENT_DATE()),
    DAYOFWEEK(CURRENT_DATE());