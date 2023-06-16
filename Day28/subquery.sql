select * from employee;

select *
from employee
where salary > (select salary from employee where empName="GGGG");

create table SalesEmployee
(select * from employee where deptt="sales");

select * from SalesEmployee;

select * from employee
where salary > (select AVG(Salary) from employee);

select * from employee;

update employee
set designation=(select designation from salesemployee where empId=101)
where empid=102;