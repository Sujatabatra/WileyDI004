describe blooddonar;

describe sales;

alter table sales
add salesManagerId int;

alter table sales
add salesTarget double
first;

alter table sales
add salesday int
after sId;

alter table employee
add allowance double,
add deduction double after department,
add serialNo int first;

alter table employee
modify empName varchar(25);

alter table employee
change department deptt varchar(30);

alter table sales
drop column salesTarget;

alter table employee
drop column serialNo;

alter table employee
add constraint Pk_EmpId Primary Key(empId);

SELECT TABLE_NAME, CONSTRAINT_TYPE, CONSTRAINT_NAME
FROM information_schema.table_constraints
WHERE table_name='sales' and table_schema="wileydi004";

alter table sales
drop constraint sales_chk_1;

describe information_schema.table_constraints;

alter table sales
rename to sales_june
