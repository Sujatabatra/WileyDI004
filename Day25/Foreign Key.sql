use wileydi004;

create table course(
courseid int primary key,
coursename varchar(25));

-- primary key on one table can be foreign key to another table
create table student(
rollNo int primary key,
name varchar(20),
dob date,
courseid int,
constraint foreign key(courseid) REFERENCES course(courseid)
);

insert into course
values(1,"Computer Science"),
(2,"Medicine"),
(3,"Information Technology"),
(4,"Dentistry");

select * from course;

insert into student
values(1,"AAAAA","2002-10-12",3);

/* failed query
insert into student
values(2,"BBBBB","2001-12-12",6);
*/

insert into student
values(2,"BBBBB","2001-12-12",2);

select * from student;

select * from course;

delete from course
where courseid=2;