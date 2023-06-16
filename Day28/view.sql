create view itview
as
select * from employee
where deptt="IT";

select * from employee;
select * from itview;

insert into itview
values(111,"ABCD","Director","Sales",78000);
create view payrollview(empNo,name,BasicSalary,Allowances,Deduction)
as
select empid,empName,salary,.15*salary,.08*salary
from employee;

select * from payrollview;