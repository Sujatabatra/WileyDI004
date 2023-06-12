/*
Constraints:
1. Primary key
2. unique
3. not null
4. check
5. Foreign Key
*/
create table sales(
sId int primary key,
salesMonth varchar(10) not null,
salesAmount double not null check(salesAmount>0),
salesRegion varchar(15) unique not null,
salesYear int);

-- insert failed query
insert into sales
values(1,"Jan",-1900,"North",2020);

insert into sales
values(1,"Jan",1900,"North",2020);

-- insert failed query
insert into sales
values(2,"May",5900,"North",null);


insert into sales
values(2,"May",null,"East",null);

