create database ariketa9;

use oracleariketa2;

insert into ikastaro values(7566, 11, 'JavaScript', '2021-03-04', '2021-03-18', 25, 250);
insert into ikastaro values(7782, 12, 'JavaScript', '2021-03-04', '2021-03-18', 25, 250);
insert into ikastaro values(7902, 13, 'Microsoft Teams', '2021-03-22', '2021-03-26', 30, 310);
insert into ikastaro values(7844, 14, 'Sormen tailerra I', '2021-03-23', '2021-03-23', 8, 100);
insert into ikastaro values(7844, 15, 'Sormen tailerra II', '2021-04-13', '2021-04-14', 10, 130);
insert into ikastaro values(7839, 16, 'Excel 365', '2021-03-24', '2021-04-24', 50, 380);
insert into ikastaro values(7839, 17, 'Excel 365', '2021-02-24', '2021-04-24', 50, 380);

SELECT langile.*
FROM langile, bajak
WHERE langile.lan_zk = bajak.lan_zk
AND bajak.alta IS NULL and bajak.lan_zk in (select langile.lan_zk
FROM langile, bajak
WHERE langile.lan_zk = bajak.lan_zk and bajak.alta is not null);


SELECT 
    langile.*
FROM
    langile,
    bajak
WHERE
    langile.lan_zk = bajak.lan_zk
        AND osagilea != 'Jon Egia'
        AND langile.lan_zk NOT IN (SELECT 
            bajak.lan_zk
        FROM
            bajak
        WHERE
            osagilea = 'Jon Egia');


SELECT 
    langile.dept_zk,
    concat(sum(langile.soldata), '€') soldata,
    concat(sum(langile.komisioa), '€') komisioa
FROM
    langile;