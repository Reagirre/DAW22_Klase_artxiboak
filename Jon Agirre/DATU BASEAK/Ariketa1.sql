SELECT /*30.ariketa*/
    bezero.idbezero,
    bezero.herria,
    bezero.izena,
    bezero.helbidea,
    bezero.abizena,
    produktu.idproduktu,
    produktu.izena,
    produktu.prezioa,
    produktu.idhornitzaile,
    hornitzaile.idhornitzaile
FROM
    produktu,
    bezero,
    saldu,
    hornitzaile
WHERE
    produktu.idproduktu = saldu.idproduktu
        AND bezero.idbezero = saldu.idbezero
        AND produktu.idhornitzaile = hornitzaile.idhornitzaile;
        
SELECT /*31.ariketa*/
    COUNT(saldu.idproduktu), saldu.idbezero, AVG(prezioa), bezero.izena, bezero.abizena
FROM
    saldu,
    produktu,
    bezero
WHERE
    produktu.idproduktu = saldu.idproduktu and bezero.idbezero = saldu.idbezero
GROUP BY saldu.idbezero;


SELECT /*32.ariketa*/
    MAX(zenbat), taula.idbezero, bezero.izena, bezero.abizena
FROM
    (SELECT 
        COUNT(idproduktu) zenbat, idbezero
    FROM
        saldu
    GROUP BY idbezero) AS taula, bezero
where bezero.idbezero = taula.idbezero;


select max(zenbat), idhornitzaile /*33.ariketa*/
from (select count(idproduktu) zenbat, idhornitzaile
from produktu
group by idhornitzaile) as taula;

select bezero.izena, bezero.herria, bezero.telefonoa /*34.ariketa*/
from bezero
union
select hornitzaile.izena, hornitzaile.herria, hornitzaile.telefonoa
from hornitzaile
order by izena;



SELECT /*35.ariketa*/
    herria
FROM
    hornitzaile
WHERE
    herria NOT IN (SELECT 
            herria
        FROM
            bezero);

SELECT #36.ariketa
    herria
FROM
    hornitzaile
WHERE
    herria IN (SELECT 
            herria
        FROM
            bezero)
GROUP BY herria;
