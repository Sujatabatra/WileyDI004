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

select * from employee;

select 
concat(empName," works in ",deptt," department and gets salary = ",salary) "Employee Details"
from employee;
/*
display employeename, 
basic salary, 
allowances=18% of basic salary
deductions =12% of basic salary
net salary = basic+allowances - deduction
*/

select 
empName,
salary "Basic Salary",
.18*salary "Allowances",
.12*salary "Deductions",
salary+.18*salary-.12*salary "Net Salary"
from employee;

/*
Failed Query
select 
empName,
salary "Basic Salary",
.18*salary "Allowances",
.12*salary "Deductions",
salary+Allowances-Deductions "Net Salary"
from employee;
*/