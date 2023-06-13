create table course(
courseid int primary key,
coursename varchar(25));

drop table student;

create table student(
rollNo int primary key,
name varchar(20),
dob date,
courseid int,
constraint foreign key(courseid) REFERENCES course(courseid) On delete cascade on update cascade
);

insert into student
values(1,"AAAAA","2002-10-12",3),
(2,"BBBB","2001-11-15",2),
(3,"CCCC","2004-8-11",3),
(4,"DDDD","2001-3-5",1),
(5,"EEEE","2001-7-12",1);

select * from course;
select * from student;

update student
set courseid=102
where rollNo=2;

update course
set courseid=101
where courseid=1;

delete from course
where courseid=101;