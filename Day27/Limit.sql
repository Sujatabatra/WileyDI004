/*
row no starts with zero
Limit offset/no of row , total number of rows
*/
select * from employee
Limit 3;

select * from employee
Limit 2, 3;

select * from employee
order by salary desc;

select * from employee
order by salary desc
LIMIT 2;