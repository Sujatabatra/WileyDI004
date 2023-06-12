create table person(
pid int primary key,
pName varchar(25),
pAge int,
pAddress varchar(25));

insert into person
values(1,"AAAA",67,"Addr1");

insert into person
values(2,"BBBB",null,"Addr2");

insert into person
values(1,"CCCC",45,"Addr3");

insert into person
values(null,"CCCC",45,"Addr3");
