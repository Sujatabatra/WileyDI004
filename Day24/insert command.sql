/*
insert into TableName(fieldlist)
values(valuelist);
*/

insert into employee(empId,empName,designation,department,salary)
values(101,"AAAA",'Executive','Sales',4567.50);

insert into employee
values(102,"BBBB",'Sr. Executive','HR',7590.00);

select * from employee;

insert into employee
values(103,"CCCC","Manager","IT",7890),
(104,"DDDD","Sr. Manager","HR",9880),
(105,"EEEE","Associate","IT",8950);