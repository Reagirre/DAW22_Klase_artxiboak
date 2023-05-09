create user 'Asier'@'localhost' identified by '1230';

grant select on oracleariketa2.departa to 'Asier'@'localhost';
grant select on oracleariketa2.langile to 'Asier'@'localhost';

grant update on oracleariketa2.departa to 'Asier'@'localhost';
grant update on oracleariketa2.langile to 'Asier'@'localhost';


grant create on oracleariketa2 to 'Asier'@'localhost';
grant insert on oracleariketa2.departa to 'Asier'@'localhost';
grant insert on oracleariketa2.langile to 'Asier'@'localhost';

revoke select on oracleariketa2.langile from 'Asier'@'localhost';

flush privileges;


delimiter $$
create function biParametroBatu(x int, y int) returns numeric deterministic
begin
	declare batu numeric;
    declare mezua varchar(20);
    

    set batu = 0;
    
    if x mod 2 = 0 then
		select 'Lehenengo zenbakia bakoitia izan behar da.' into mezua;
        return mezua;
	elseif (x = y) then
		select 'Bi zenbakiak berdinak dira' into mezua;
        return mezua;
	else 
		while x <= y do
			set batu = batu + x + 1;
			set x = x + 2;
		end while;
        
	end if;
    return batu;
end $$
delimiter  ;
drop function biParametroBatu;

select biParametroBatu(7,16);


delimiter $$
create procedure langiSoldatakIgo(in soldBerria numeric)
begin
	declare hasiData date;
    declare soldata numeric;
    declare abizena varchar(20);
    
    
    select langile.alta_data, langile.soldata, langile.abizena into hasiData, soldata, abizena
    from langile
    where year(langile.alta_data) = 1980;
    
    if soldata - soldBerria < 500 and soldata - soldBerria > -500 then
		set soldata = soldBerria;
		select abizena;
	end if;
end $$
delimiter ;

drop procedure langiSoldatakIgo;

call langiSoldatakIgo(1000);