select * from student;

select * from course;

update student
set courseid=4
where rollNo IN(4,5);

select name,s.courseid,coursename
from student s
inner join course c
on s.courseid=c.courseid;

select name,s.courseid,coursename
from student s
left join course c
on s.courseid=c.courseid;

select name,s.courseid,coursename
from student s
right join course c
on s.courseid=c.courseid;

select name,s.courseid,coursename
from student s
cross join course c;

insert into course
values(1,"Computer Science");

select * from student;

insert into student
values(6,"FFFF","2002-08-07",null);

select * from student;