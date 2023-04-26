use oracleariketa2;


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
		lan_zk = id;
end $$
delimiter ;

delimiter $$
create function soldataMaximoa() returns numeric
begin
	declare soldataMaximoa numeric;
    
    select langile.soldata into soldataMaximoa
    from langile
    order by soldata desc
    limit 1;
    
    return soldataMaximoa;
end $$
delimiter ;

select soldataMaximoa();


delimiter $$
create procedure batetikHamarrera()
begin
	declare i int;
    set i = 1;
	while i < 10 do
		select i;
        set i = i + 1;
	end while;
end $$
delimiter ;

call batetikHamarrera();

delimiter $$
create procedure karratua(in x numeric)
begin 
	declare i numeric;
    set i = 1;
    while i <= x do
		select i, i*i;
        set i = i + 1;
	end while;
end $$
delimiter ;

call karratua(3);

delimiter $$
create function bakoitia(x int) returns boolean
begin 
	if x mod 2 = 0 then
		return false;
	else
		return true;
	end if;
end $$
delimiter ;


delimiter $$
create function saria(id numeric) returns numeric
begin 
	declare saria numeric;
    
    select langile.soldata * 0.05 into saria
    from langile
    where langile.lan_zk = id;
    
    return saria;
end $$
delimiter ;

select saria(7369);


delimiter $$
create function saria2(id numeric) returns varchar(50)
begin
	declare saria numeric;
    declare mezua varchar(50);
    
    select langile.soldata * 0.05 into saria
    from langile
    where langile.lan_zk = id;
    
    if saria is null then
		set mezua = 'Langilea ez da existitzen';
        return mezua;
	else
		return saria;
	end if;
end $$
delimiter ;

select saria2(122);


delimiter $$
create function saria3(id numeric) returns varchar(50)
begin
	declare saria numeric;
    declare mezua varchar(50);
    declare alta date;
    
    select alta_data into alta
    from langile
    where langile.lan_zk = id;
    
    if year(alta) < 1985 then
		set saria = 400;
	else 
		set saria = 300;
	end if;
    
    if saria is null then
		set mezua = 'Ez da langilea existitzen';
        return mezua;
	else
		return saria;
	end if;
end $$
delimiter ;

select saria3(7369)saria;

delimiter $$
create procedure sariaGehitu(id numeric) 
begin
	declare saria numeric;
    declare alta date;
    
    select langile.soldata * 0.05 into saria
    from langile
    where langile.lan_zk = id;
    
    
    if year(alta) < 1985 then
		set saria = 400;
	else 
		set saria = 300;
	end if;
    
    update langile
    set soldata = soldata + saria
    where lan_zk = id;
end $$
delimiter ;

call sariaGehitu(7369);



delimiter $$
create function batura(x int, y int) returns int
begin 
	declare batu int;
    set batu = 0;
	while x <= y do
		set batu = batu + x;
        set x = x + 1;
    end while;
	return batu;
end $$ 
delimiter ;

select batura(1,10);


delimiter $$
create procedure biZenbakienArtekoZenbakiak(in zenbakia1 int, in zenbakia2 int) 
begin
	if zenbakia1 < zenbakia2 then
		while zenbakia1 <= zenbakia2 do
			select zenbakia1;
			set zenbakia1 = zenbakia1 + 1;
        end while;
	elseif zenbakia2 < zenbakia1 then
		while zenbakia1 <= zenbakia2 do
			select zenbakia2;
			set zenbakia2 = zenbakia2 + 1;
        end while;
	else
		select 'Bi zenbakiak berdinak dira';
	end if;
end $$
delimiter ;

call biZenbakienArtekoZenbakiak(10,15);


delimiter $$
create procedure soldataIgoera(in id numeric) 
begin
	declare lanbidea varchar(20);
    declare soldata numeric;
	select langile.lanbidea, langile.soldata into lanbidea, soldata
    from langile
    where langile.lan_zk = id;
    
    if lanbidea = 'Saltzaile' then
		set soldata = soldata + (soldata * 5 / 100);
	elseif lanbidea = 'Analista' then
		set soldata = soldata + (soldata * 7 / 100);
	elseif lanbidea = 'Langile' then
		set soldata = soldata + (soldata * 8 / 100);
	elseif lanbidea = 'Lehendakari' then
		set soldata = soldata + (soldata * 12 / 100);
	elseif lanbidea = 'Zuzendari' then
		set soldata = soldata + (soldata * 10 / 100);
	elseif lanbidea is null then
		select 'Ez da langilerik existitzen';
	end if;
    
    select langile.lan_zk, langile.abizena, langile.lanbidea, langile.soldata, soldata
    from langile
    where langile.lan_zk = id;
        
end $$
delimiter ;

call soldataIgoera(7369);


delimiter $$
create procedure katea(in aukera int, in testua varchar(20)) 
begin
	declare kont int;
    set kont = 1;
	if aukera = 1 then
		if binary(testua) = binary(upper(testua)) then
			select 'Testua letra larriz idatzita dago';
		else
			select 'Testua letra xehez idatzita dago';
		end if;
    elseif aukera = 2 then
		while kont <= length(testua) do
			select substr(testua, kont, 1);
			set kont = kont + 1;
        end while;
    elseif aukera = 3 then
		set kont = length(testua);
		while 0 < kont do
			select substr(testua, kont, 1);
			set kont = kont - 1;
        end while;
    elseif aukera = 4 then
        if locate(" ", testua) = 0 then
			select testua;
		else
			select substr(testua, 1, locate(" ", testua));
            select substr(testua, locate(" ", testua));
		end if;
    else
		select 'Ez da aukera zuzena';
    end if;
        
end $$
delimiter ;

call katea(4, 'Hezkuntza berria');

drop procedure katea;