create database ErrepasoAriketak;

use ErrepasoAriketak;

CREATE TABLE Hornitzaile (
    hornitzaile_id NUMERIC(2) PRIMARY KEY,
    izena VARCHAR(20) NOT NULL
);


CREATE TABLE Produktu (
    produktu_id NUMERIC(2) PRIMARY KEY,
    izena VARCHAR(20),
    prezioa NUMERIC(7 , 2 ),
    hornitzaile_id NUMERIC(2),
    FOREIGN KEY (hornitzaile_id)
        REFERENCES Hornitzaile (hornitzaile_id)
);

INSERT INTO hornitzaile VALUES(1, 'Asus');
INSERT INTO hornitzaile VALUES(2, 'Lenovo');
INSERT INTO hornitzaile VALUES(3, 'Hewlett-Packard');
INSERT INTO hornitzaile VALUES(4, 'Samsung');
INSERT INTO hornitzaile VALUES(5, 'Seagate');
INSERT INTO hornitzaile VALUES(6, 'Crucial');
INSERT INTO hornitzaile VALUES(7, 'Gigabyte');
INSERT INTO hornitzaile VALUES(8, 'Huawei');
INSERT INTO hornitzaile VALUES(9, 'Xiaomi');
INSERT INTO produktu VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO produktu VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO produktu VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO produktu VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO produktu VALUES(5, 'GeForce GTX 1080 Xt', 755, 6);
INSERT INTO produktu VALUES(6, 'Monitor 24 Full HD', 202, 1);
INSERT INTO produktu VALUES(7, 'Monitor 27 Full HD', 245.99, 1);
INSERT INTO produktu VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO produktu VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO produktu VALUES(10, 'Impresora HP Deskjet', 59.99, 3);
INSERT INTO produktu VALUES(11, 'Impresora HP Laser', 180, 3);



SELECT 
    produktu.izena Izena
FROM
    produktu;


SELECT 
    produktu.izena, produktu.prezioa
FROM
    produktu;


SELECT 
    hornitzaile.izena
FROM
    hornitzaile
ORDER BY hornitzaile.izena ASC;


SELECT 
    produktu.izena
FROM
    produktu
ORDER BY produktu.izena ASC , prezioa DESC;


SELECT 
    MIN(produktu.prezioa), produktu.izena
FROM
    produktu;


SELECT 
    MAX(produktu.prezioa), produktu.izena
FROM
    produktu;


SELECT 
    produktu.izena
FROM
    produktu
WHERE
    hornitzaile_id = 2;
    
    
SELECT 
    produktu.izena
FROM
    produktu
WHERE
    prezioa <= 120;


SELECT 
    produktu.izena
FROM
    produktu
WHERE
    prezioa > 400;



SELECT 
    produktu.izena
FROM
    produktu
WHERE
    prezioa > 80 AND prezioa < 300;/*Beste aukera: where prezioa between 80 and 300*/



SELECT 
    produktu.izena
FROM
    produktu
WHERE
    prezioa > 60 AND prezioa < 200;



SELECT 
    produktu.*
FROM
    produktu
WHERE
    prezioa > 200 AND hornitzaile_id = 6;



SELECT 
    produktu.*
FROM
    produktu
WHERE
    produktu.hornitzaile_id = 1
        OR produktu.hornitzaile_id = 3
        OR produktu.hornitzaile_id = 5; /*Beste aukera bat: where produktu.hornitzaile_id in (1,3,5)*/


SELECT 
    hornitzaile.izena
FROM
    hornitzaile
WHERE
    hornitzaile.izena LIKE 'S%';


SELECT 
    hornitzaile.izena
FROM
    hornitzaile
WHERE
    hornitzaile.izena LIKE '%e';


SELECT 
    hornitzaile.izena
FROM
    hornitzaile
WHERE
    hornitzaile.izena LIKE '%w%';

SELECT 
    hornitzaile.izena
FROM
    hornitzaile
WHERE
    hornitzaile.izena LIKE '____';

SELECT 
    produktu.izena
FROM
    produktu
WHERE
    izena LIKE '%monitor%' AND prezioa < 215;





SELECT 
    produktu.izena
FROM
    produktu
WHERE
    prezioa > 180
ORDER BY prezioa DESC , produktu.izena ASC;


SELECT 
    produktu.izena, produktu.prezioa, hornitzaile.izena
FROM
    hornitzaile,
    produktu
WHERE
    hornitzaile.hornitzaile_id = produktu.hornitzaile_id;



SELECT 
    produktu.izena, produktu.prezioa, hornitzaile.izena
FROM
    hornitzaile,
    produktu
WHERE
    hornitzaile.hornitzaile_id = produktu.hornitzaile_id
ORDER BY hornitzaile.izena ASC;



SELECT 
    produktu.izena,
    produktu.prezioa,
    hornitzaile.izena,
    produktu.produktu_id
FROM
    hornitzaile,
    produktu
WHERE
    hornitzaile.hornitzaile_id = produktu.hornitzaile_id
ORDER BY hornitzaile.izena ASC;



SELECT 
    produktu.izena, produktu.prezioa, hornitzaile.izena
FROM
    produktu,
    hornitzaile
WHERE
    produktu.hornitzaile_id = hornitzaile.hornitzaile_id
ORDER BY produktu.prezioa ASC
LIMIT 1;



SELECT 
    produktu.izena, produktu.prezioa, hornitzaile.izena
FROM
    produktu,
    hornitzaile
WHERE
    produktu.hornitzaile_id = hornitzaile.hornitzaile_id
ORDER BY produktu.prezioa DESC
LIMIT 1;/*ESTO ENTRA EN EXAMEN // HAU AZTERKETAN SARTZEN DA*/


SELECT 
    produktu.*
FROM
    produktu,
    hornitzaile
WHERE
    produktu.hornitzaile_id = hornitzaile.hornitzaile_id
        AND hornitzaile.izena = 'Lenovo';



SELECT 
    produktu.*
FROM
    produktu,
    hornitzaile
WHERE
    produktu.hornitzaile_id = hornitzaile.hornitzaile_id
        AND produktu.prezioa > 200
        AND hornitzaile.izena = 'Crucial';



SELECT 
    produktu.*
FROM
    produktu,
    hornitzaile
WHERE
    (produktu.hornitzaile_id = hornitzaile.hornitzaile_id
        AND hornitzaile.izena = 'Asus')
        OR (produktu.hornitzaile_id = hornitzaile.hornitzaile_id
        AND hornitzaile.izena = 'Hewlett-Packard')
        OR (produktu.hornitzaile_id = hornitzaile.hornitzaile_id
        AND hornitzaile.izena = 'seagate');


SELECT 
    produktu.*
FROM
    produktu,
    hornitzaile
WHERE
    produktu.hornitzaile_id = hornitzaile.hornitzaile_id
        AND hornitzaile.izena IN ('Asus' , 'Hewlett-Packard', 'seagate');