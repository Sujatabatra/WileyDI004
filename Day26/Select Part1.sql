-- DQL : Data Query Language

use wileydi004;

alter table employee
drop column deduction,
drop column allowance;
/*
Projection : picking columns
Selection : picking rows

Syntax:
SELECT projection list(Column list)
FROM TableName;
*/

select * -- All the columns present in table
from employee;

select empId,designation,empName
from employee;

select 
empId,empName,salary "Monthly Salary",salary*12 "Annual Salary"
from employee;

/*
we can write expression in projection list
+,-,*,/
*,/ higher precedence then + and -
to overrule the above mentioned precedence use ( ).
*/

select
empName,salary,salary+100*12
from employee;

select
empName,salary,(salary+100)*12
from employee;

