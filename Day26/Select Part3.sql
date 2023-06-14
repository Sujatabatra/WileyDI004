/*
select projection list
from TableName
where Selection condition
order by columnname asc/desc

default sort order : asc 
*/
use wileydi004;
select * from employee;

select *
from employee
order by designation;

select *
from employee
order by designation desc;

select * 
from employee
where deptt IS NOT null
order by deptt,designation;