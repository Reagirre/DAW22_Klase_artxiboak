CREATE VIEW adibidea AS
    SELECT 
        *
    FROM
        alea;


CREATE VIEW adibidea2 AS
    SELECT 
        liburua.titulua, alea.prezioa
    FROM
        liburua
            INNER JOIN
        alea ON liburua.liburukodea = alea.liburukodea;


SELECT 
    *
FROM
    adibidea;


CREATE VIEW adibidea3 AS
    SELECT 
        *
    FROM
        alea
    WHERE
        prezioa < 15;


SELECT 
    *
FROM
    adibidea3;


drop view adibidea;


create user 'jon'@'localhost' identified by '1230';


SELECT 
    *
FROM
    mysql.user;


drop user 'jon@localhost';

flush privileges;



grant select on ariketa11.alea to 'jon'@'localhost';

grant select on ariketa11.* to 'jon'@'localhost';

create user 'ane'@'localhost' identified by '0000';

grant select on oracleariketa2.langile to 'ane'@'localhost';

grant select on oracleariketa2.departa to 'ane'@'localhost';

flush privileges;

grant update on oracleariketa2.langile to 'ane'@'localhost';
grant update on oracleariketa2.departa to 'ane'@'localhost';

