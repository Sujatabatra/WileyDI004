-- selection : selecting rows
/*
selec projection list
from tablename
where selection condition

Relational Operator
>, <, >=, <=, <>, =

Logical Operators
AND, OR, NOT

Other Operators for condition check
IS , BETWEEN ... AND... , IN
*/


select * from employee;

select *
from employee
where deptt="IT";

select empName 
from employee
where designation="Manager" AND deptt="IT";


select *
from employee
where salary BETWEEN 5000 AND 8000;

select *
from employee
where deptt="HR" OR deptt="Sales";

select *
from employee
where deptt IN("HR","Sales");

select *
from employee
where deptt IS null;

select *
from employee
where deptt IS NOT null;

/*
Pattern Search
% : replaces zero and more characters
_ : replaces one character
*/
select *
from employee
where designation Like "Sr.%";

select *
from employee
where designation LIKE "____M%";