create database kontrola;
use kontrola;

CREATE TABLE Irakasleak (  id_Irakasle INT PRIMARY KEY,

  			        izena VARCHAR(50),

  			       abizena VARCHAR(50),

 			       asignatura VARCHAR(50),

  			       soldata DECIMAL(8,2));



INSERT INTO irakasleak (id_Irakasle, izena, abizena, asignatura, soldata)

VALUES  (1, 'Jon', 'García', 'Matematika', 2500.00),

(2, 'Malen', 'Martínez', 'Fisika', 2800.00),

(3, 'Peio', 'Sánchez', 'Ingelesa', 3000.00),

(4, 'Ane', 'López', 'Historia', 2700.00),

(5, 'Karlos', 'Rodríguez', 'Biologia', 2900.00),

(6, 'Sarai', 'Fernández', 'Informatika', 3200.00),

(7, 'Paul', 'Gómez', 'Kimika', 2600.00),

(8, 'Karmen', 'Díaz', 'Gorputz hezkuntza', 2400.00),

(9, 'Xabier', 'Romero', 'Filosofia', 3100.00),

(10, 'Lucía', 'Navarro', 'Geografia', 2800.00);



CREATE TABLE Ikasle (  id_Ikasle INT PRIMARY KEY,

  			    izena VARCHAR(50),

  			   abizena VARCHAR(50),

  			   jaioData DATE,

 			   nota DECIMAL(4,2),

   id_Irakasle INT,

  FOREIGN KEY (id_Irakasle) REFERENCES Irakasleak(id_Irakasle)

);



INSERT INTO Ikasle (id_Ikasle, izena, abizena, jaioData, nota, id_Irakasle)

VALUES 

(1, 'Laura', 'García', '2005-02-20' , 8.70, '1'),

(2, 'Mario', 'Martínez', '2004-01-14', 7.50, '2'),

(3, 'Marta', 'Sánchez', '2005-08-30', 9.20, '5'),

(4, 'Adrián', 'López', '2005-12-07', 6.80, '6'),

(5, 'Elena', 'Rodríguez', '2004-08-04', 8.90, '2'),

(6, 'David', 'Fernández', '2005-05-20', 7.60, '8'),

(7, 'Cristina', 'Gómez', '2005-02-14', 7.30, '9'),

(8, 'Pablo', 'Díaz', '2005-09-11', 8.10, '2'),

(9, 'Sandra', 'Romero', '2005-10-07', 9.50, '3'),

(10, 'Jorge', 'Navarro', '2005-02-09', 6.90, '7');


/*-------Ariketa 1-------*/

SELECT 
    CONCAT('Irakasleak: ',
            irakasleak.izena,
            ' ',
            irakasleak.abizena) Irakasleak
FROM
    irakasleak;


/*-------Ariketa 2-------*/

UPDATE ikasle 
SET 
    ikasle.nota = 7
WHERE
    YEAR(ikasle.jaioData) = 2004;


/*-------Ariketa 3-------*/

SELECT 
    CONCAT(UCASE(LEFT(ikasle.izena, 2)),
            MID(ikasle.izena,
                3,
                LENGTH(ikasle.izena) - 4),
            UCASE(RIGHT(ikasle.izena, 2))) concat
FROM
    ikasle;


/*-------Ariketa 4-------*/

UPDATE ikasle 
SET 
    ikasle.nota = LENGTH(ikasle.izena);


/*-------Ariketa 5-------*/

DELETE FROM irakasleak 
WHERE
    irakasleak.id_Irakasle NOT IN (SELECT 
        ikasle.id_Irakasle
    FROM
        ikasle
    GROUP BY ikasle.id_Irakasle);


/*-------Ariketa 6-------*/

SELECT 
    MONTHNAME(ikasle.jaioData),
    DAYNAME(ikasle.jaioData),
    DATEDIFF(CURDATE(), ikasle.jaioData)
FROM
    ikasle;


/*-------Ariketa 7-------*/

DELETE FROM ikasle 
WHERE
    MONTH(ikasle.jaioData) = 2
    OR SUBSTR(ikasle.izena, 1, 1) = 'J';


/*-------Ariketa 8-------*/

UPDATE irakasleak 
SET 
    irakasleak.soldata = irakasleak.soldata - 200
WHERE
    irakasleak.id_Irakasle in (SELECT 
            ikasle.id_Irakasle
        FROM
            ikasle
        WHERE
            YEAR(ikasle.jaioData) = 2005);


/*-------Ariketa 9-------*/

UPDATE ikasle 
SET 
    ikasle.jaioData = adddate(ikasle.izena, interval 5 day)
WHERE
    ikasle.nota < 5;


/*-------Ariketa 10-------*/

DELETE FROM ikasle 
WHERE
    LENGTH(ikasle.izena) > 5
    AND (MONTH(ikasle.jaioData) = 1
    OR MONTH(ikasle.jaioData) = 2
    OR MONTH(ikasle.jaioData) = 3);