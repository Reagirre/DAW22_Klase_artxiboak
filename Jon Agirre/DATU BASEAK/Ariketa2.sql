SELECT 
    *
FROM
    langile,
    departa
WHERE
    langile.dept_zk = departa.dept_zk;



SELECT 
    *
FROM
    langile
        LEFT JOIN
    departa ON langile.dept_zk = departa.dept_zk;



SELECT 
    *
FROM
    (SELECT 
        COUNT(langile.lan_zk) zenbat, departa.depizen, departa.dept_zk
    FROM
        langile
    INNER JOIN departa ON langile.dept_zk = departa.dept_zk
    GROUP BY departa.dept_zk) AS taula
WHERE
    taula.zenbat > 3;




SELECT 
    departa.dept_zk,
    departa.depizen,
    COUNT(langile.lan_zk),
    SUM(langile.soldata),
    AVG(langile.soldata)
FROM
    langile
        INNER JOIN
    departa ON langile.dept_zk = departa.dept_zk
GROUP BY departa.dept_zk
having SUM(langile.soldata) > 6000 and SUM(langile.soldata) < 9000;



SELECT 
    departa.dept_zk,
    departa.depizen,
    COUNT(langile.lan_zk),
    SUM(langile.soldata),
    AVG(langile.soldata)
FROM
    langile
        INNER JOIN
    departa ON langile.dept_zk = departa.dept_zk
GROUP BY departa.dept_zk
HAVING AVG(langile.soldata) < 2000;



SELECT 
    departa.dept_zk,
    departa.depizen,
    COUNT(langile.lan_zk),
    SUM(langile.soldata)
FROM
    langile
        INNER JOIN
    departa ON langile.dept_zk = departa.dept_zk
WHERE
    langile.lanbidea = 'langile'
        OR langile.abizena LIKE '%e%'
GROUP BY departa.dept_zk;

SELECT 
    langile.*
FROM
    langile
WHERE
    langile.soldata > (SELECT 
            AVG(langile.soldata)
        FROM
            langile);
            
            
SELECT 
    langile.*
FROM
    langile
WHERE
    lanbidea = (SELECT 
            lanbidea
        FROM
            langile
        WHERE
            abizena = 'Murua');


SELECT 
    langile.abizena, langile.lanbidea
FROM
    langile
WHERE
    lanbidea IN (SELECT 
            lanbidea
        FROM
            langile
        WHERE
            dept_zk = 20);



SELECT 
    MAX(zenbat), taula.depizen, taula.dept_zk
FROM
    (SELECT 
        COUNT(langile.lan_zk) zenbat,
            departa.depizen,
            departa.dept_zk
    FROM
        departa
    INNER JOIN langile ON departa.dept_zk = langile.dept_zk
    GROUP BY departa.dept_zk) AS taula;


