/*
Aggregate methods : sum,min,max,average,count
*/

use wileydi004;

select deptt
from employee;

select distinct deptt
from employee;

select *
from employee;
-- find total number of employees
select count(*)
from employee;

select count(*)
from employee
where deptt="IT";

select count(distinct deptt) "Total Number of Departments"
from employee;

select max(salary)
from employee;

select min(salary)
from employee
where deptt="HR";