/*
SELECT projection list
FROM tableName
WHERE selection condition
GROUP BY columname(s)
ORDER BY columnname(s) ASC/DESC
*/

select deptt "Department",count(deptt) "Total Number of Employees"
from employee
group by deptt;

select
concat(count(deptt)," employees , works in ",deptt," Department") "Information"
from employee
group by deptt;

select * from employee;

update employee
set deptt="IT" 
where empId=106;

update employee
set deptt="Sales" 
where empId=107;

update employee
set designation="Manager"
where empId=106;

select
deptt,designation,count(*)
from employee
where deptt<>"Sales"
group by deptt,designation;

select deptt,max(salary),min(salary),sum(salary)
from employee
group by deptt;

select deptt,max(salary),min(salary),sum(salary)
from employee
group by deptt
having max(salary)>9000;

select deptt,max(salary),min(salary),sum(salary)
from employee
where deptt!="Marketing"  -- 1 
group by deptt       -- 2
having max(salary)>9000;  -- 3

insert into employee
values(108,"HHHH","Associate","Marketing",10000);