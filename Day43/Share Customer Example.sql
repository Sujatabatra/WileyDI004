use wileydi004;

create table UserDetails(
username varchar(30) primary key,
password varchar(30));

insert into UserDetails
values("Sujata","Batra"),
("Catalina","Kalman"),
("User1","pwd");

select * from UserDetails;

create table share(
shareId varchar(20),
shareName varchar(40),
marketPrice double);

insert into share
values("S001","XYZ Corp.",780),
("S002","ABC Group",1500),
("S003","SSS Enterprise",5600),
("S004","VVV Corp.",5000);

select * from share;

create table CustomerShareDetails(
detailId int primary key,
customerId varchar(30),
shareId varchar(20),
shareType varchar(30),
quantity int);

insert into CustomerShareDetails
values(1,"C001","S001","Intra Day",10),
(2,"C001","S003","Internary",45),
(3,"C002","S002","Internary",55),
(4,"C002","S003","Intra Day",39),
(5,"C002","S004","Internary",2),
(6,"C003","S001","Intra Day",70),
(7,"C003","S002","Internary",8),
(8,"C004","S001","Internary",90),
(9,"C004","S002","Internary",43),
(10,"C004","S003","Intra Day",67);

select * from CustomerShareDetails;

describe CustomerShareDetails;

