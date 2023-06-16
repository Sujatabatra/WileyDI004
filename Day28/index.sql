use wileydi004;

/*
create index indexname on table(columnname(s))
*/

create index dept_idx
on employee(deptt);

show indexes from employee;

drop index dept_idx on employee;