use oracleariketa2;

CREATE TABLE Ikastaro (
    lan_zk NUMERIC(4),
    ikastaro_zk NUMERIC(4) PRIMARY KEY,
    ikastaro_izena VARCHAR(20),
    hasi DATE,
    bukatu DATE,
    orduak NUMERIC(4),
    kostua NUMERIC(5),
    FOREIGN KEY (lan_zk)
        REFERENCES langile (lan_zk)
        ON DELETE CASCADE
);

insert into Ikastaro values('7566','1', 'Windows Vista', '2016-09-14', '2016-09-17', 20, 110);
insert into Ikastaro values('7782', '2','Word 2013','2016-09-14','2016-09-24','40','280');
insert into Ikastaro values('7902','3','Sareen instalazioa','2016-09-15','2016-09-30','45','280');
insert into Ikastaro values('7839','4','Excel 2013','2016-09-28','2016-11-11','40','250');
insert into Ikastaro values('7900','5','Excel 2013','2016-09-28','2016-11-11','40','250');
insert into Ikastaro values('7566','6','Excel 2013','2016-10-29','2016-11-30','40','260');
insert into Ikastaro values('7782','7','Power Point 2013','2016-11-05','2016-12-05','10','70');
insert into Ikastaro values('7566','8','Word 2013','2016-11-19','2016-11-28','40','280');
insert into Ikastaro values('7369','9','Word 2013','2016-11-19','2016-11-28','40','280');

CREATE TABLE bajak (
    lan_zk NUMERIC(4),
    zergatia VARCHAR(25),
    osagilea VARCHAR(20),
    baja DATE,
    alta DATE,
    PRIMARY KEY (lan_zk , baja),
    FOREIGN KEY (lan_zk)
        REFERENCES langile (lan_zk)
        ON DELETE CASCADE
);

alter table bajak add constraint check(baja < alta);


insert into bajak values('7499','Bronkitis','Mikel Sola','2017-09-17','2017-09-20');
insert into bajak values('7782','Belarriko infekzioa','Jon Egia','2017-09-20','2017-09-25');
insert into bajak values('7499','Neumonia','Mikel Sola','2017-09-24','2017-10-02');
insert into bajak values('7782','Belarriko infekzioa','Jon Egia','2017-10-22','2017-10-25');
insert into bajak values('7369','Gripe','Jon Egia','2017-10-22','2017-10-28');
insert into bajak values('7844','Gripe','Jon Egia','2017-10-29','2017-11-04');
insert into bajak values('7499','Birus','Ana Zabala','2016-10-30','2017-11-06');
insert into bajak values('7900','Gripe','Mikel Sola','2016-11-04',null);
insert into bajak values('7782','Tibiaren apurketa','Jon Egia','2016-11-05',null);
insert into bajak values('7844','Bronkitisa','Ana Zabala','2016-11-06',null);
insert into bajak values('7499','Neumonia','Ana Zabala','2016-11-06',null);
insert into bajak values('7839','Gripe','Txomin Perez','2016-11-13',null);



SELECT 
    COUNT(lan_zk), SUM(kostua)
FROM
    ikastaro
GROUP BY ikastaro_izena;



SELECT 
    langile.abizena, ikastaro.ikastaro_izena
FROM
    langile
        INNER JOIN
    ikastaro ON langile.lan_zk = ikastaro.lan_zk;



SELECT 
    departa.dept_zk,
    departa.depizen,
    langile.abizena,
    langile.lanbidea,
    bajak.zergatia,
    bajak.osagilea,
    bajak.baja
FROM
    langile,
    bajak,
    departa
WHERE
    langile.lan_zk = bajak.lan_zk
        AND langile.dept_zk = departa.dept_zk
        AND bajak.alta IS NULL;



SELECT 
    COUNT(osagilea)
FROM
    (SELECT 
        COUNT(osagilea), bajak.*
    FROM
        bajak
    GROUP BY osagilea) AS taula;



SELECT 
    departa.dept_zk,
    departa.depizen,
    langile.abizena,
    langile.soldata,
    langile.lanbidea
FROM
    departa,
    langile
WHERE
    langile.dept_zk = langile.dept_zk
        AND lan_zk NOT IN (SELECT 
            bajak.lan_zk
        FROM
            bajak);


SELECT 
    langile.lan_zk,
    langile.abizena,
    langile.dept_zk,
    langile.lanbidea,
    COUNT(ikastaro.ikastaro_izena)
FROM
    langile,
    ikastaro
WHERE
    langile.lan_zk = ikastaro.lan_zk
GROUP BY langile.lan_zk;



SELECT 
    langile.lan_zk,
    langile.abizena,
    ikastaro.ikastaro_izena,
    ikastaro.hasi,
    ikastaro.bukatu,
    TIMESTAMPDIFF(DAY,
        ikastaro.hasi,
        ikastaro.bukatu),
    ikastaro.kostua,
    ikastaro.orduak,
    (ikastaro.kostua / ikastaro.orduak)
FROM
    langile,
    ikastaro
WHERE
    langile.lan_zk = ikastaro.lan_zk
GROUP BY ikastaro.ikastaro_izena;



SELECT 
    langile.*
FROM
    langile,
    bajak
WHERE
    langile.lan_zk = bajak.lan_zk
        AND bajak.alta IS NULL
        AND bajak.lan_zk IN (SELECT 
            bajak.lan_zk
        FROM
            bajak
        WHERE
            bajak.alta IS NOT NULL);



SELECT 
    langile.*
FROM
    langile,
    bajak
WHERE
    bajak.lan_zk = langile.lan_zk 
UNION SELECT 
    langile.*
FROM
    langile,
    ikastaro
WHERE
    langile.lan_zk = ikastaro.lan_zk;



SELECT 
    max(TIMESTAMPDIFF(DAY,
        bajak.baja,
        bajak.alta)) egunak
FROM
    bajak;



SELECT 
    langile.*
FROM
    langile
WHERE
    lan_zk NOT IN (SELECT 
            lan_zk
        FROM
            ikastaro) and lan_zk not in (select lan_zk from bajak);



select langile.lan_zk, langile.abizena,