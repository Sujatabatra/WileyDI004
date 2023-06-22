-- create table
/*
Syntax:
create table TableName(
columnName1 datatype,
columnName2 datatype,
.
.
columnNamen datatype);
*/
create table employee(
empId int primary key,
empName varchar(20),
designation varchar(20),
deptt varchar(20),
salary double);

-- to delete table structure
drop table employee;
