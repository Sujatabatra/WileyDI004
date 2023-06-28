create table userrating(
ratingId int primary key,
userId varchar(5),
movieId varchar(5),
rating int);

insert into userrating
values(1,"U001","M002",5),
(2,"U001","M001",4),
(3,"U002","M003",3),
(4,"U002","M002",5),
(5,"U002","M001",5),
(6,"U003","M002",3),
(7,"U003","M004",1),
(8,"U004","M001",2),
(9,"U005","M002",5),
(10,"U005","M003",5);

select * from userrating;