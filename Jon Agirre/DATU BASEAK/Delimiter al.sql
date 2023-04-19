
delimiter $$
create function MezuaItzuli() returns varchar(20)
begin
return 'HOLA MUNDO!';
END $$
delimiter ;

set global log_bin_trust_function_creators = 1;

SELECT MEZUAITZULI();


delimiter $$
create procedure abizenaSoldata(in id numeric)
begin 
select abizena, soldata 
from irakasleak
where irakasleak.id_Irakasle = id;
end $$
delimiter ;


delimiter $$
create procedure extra(in id numeric)
begin 
	declare alta_data date;
    declare extra numeric;
    
SELECT 
    langile.alta_data
INTO alta_data FROM
    langile
WHERE
    lan_zk = id;
    
    if alta_data < 1982 then 
    set  extra = 600;
    elseif alta_data >= 1982 and añta_data <= 1982 then
    set extra = 400;
    else
    set extra = 200;
    end if;

	SELECT 
    lan_zk, abizena, soldata, extra
FROM
    langile
WHERE
    lan_zk = id
end $$
delimiter ;