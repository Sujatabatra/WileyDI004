select * from employee;
/*
delete from TableName
where condition

Relational Operator : >,<,>=,<=,!=,= 

logical operators : and , or , not

Other Conditional Operators : Between , IN, IS
*/

SET SQL_SAFE_UPDATES = 0;
delete from employee
where designation="Sr. Executive";

delete from employee
where department IS Null;

delete from employee;


/*
Syntax:
update TableName
set columname1=new value,
columnname2=new value
where condition
*/

update employee
set salary=salary+100
where department="IT";

select * from employee;