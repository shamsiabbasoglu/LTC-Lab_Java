-- creating tables, inserting some data into them
create table students (
    student_id serial primary key,
    first_name varchar(50),
    last_name varchar(50)
);

create table courses (
    course_id serial primary key,
    course_name varchar(50)
);

create table enrollments (
    enrollment_id serial primary key,
    student_id int references students(student_id),
    course_id int references courses(course_id)
);

select * from students;

insert into students (first_name, last_name)
values
('Barney', 'Stinson'),
('Marshall', 'Erikson'),
('Ted', 'Mosby'),
('Lily', 'Aldrin'),
('Robin', 'Scherbatsky');

select * from courses;

insert into courses (course_name)
values
('Java'),
('Python'),
('SQL');

select * from enrollments;

insert into enrollments (student_id, course_id)
values
(3, 2),
(1, 1),
(4, 3),
(5, 2),
(2, 3),
(2, 1);

--retrieving student's and course's data
select students.first_name, students.last_name from students;
select courses.course_name from courses;

-- displaying the student names and the courses they enrolled in
select s.first_name, s.last_name, c.course_name
from enrollments e
join students s on e.student_id = s.student_id
join courses c on e.course_id = c.course_id;

-- count the number of enrollments
select count(*) as enrollment_count from enrollments;

-- retrieve student data ordered by last name
select students.first_name, last_name from students order by last_name;

-- count total number of students
select count(*) as total_student from students;

-- list student data and total number of enrollments for each
select s.first_name, s.last_name, count(e.enrollment_id) as total_enrollments
from students s
left join enrollments e on s.student_id = e.student_id
group by s.student_id;

-- display course names amd the number of students enrolled in each, but only include courses with more than 1 student
select c.course_name, count(e.enrollment_id) as student_count
from courses c
left join enrollments e on c.course_id = e.course_id
group by c.course_id
having count(e.enrollment_id) > 1;

-- retrieve students and the courses they are enrolled in, even if student is not enrolled in any
insert into students (first_name, last_name)
values
('Ranjit', 'Driver');
select s.first_name, s.last_name, c.course_name
from students s
left join enrollments e on s.student_id = e.student_id
left join courses c on e.course_id = c.course_id;

-- find the course names that have no enrollments
insert into courses (course_name)
values
('HTML');
select c.course_name
from courses c
left join enrollments e on c.course_id = e.course_id
where e.course_id is null;

-- calculate the average number of enrollments per student
select avg(enrollment_count) as average_enrollments
from (
    select count(e.enrollment_id) as enrollment_count
    from students s
    left join enrollments e on s.student_id = e.student_id
    group by s.student_id
     ) sub;

-- list student names and the courses they are enrolled in, only for students who are enrolled in more than one course
select s.first_name, s.last_name, c.course_name
from students s
join enrollments e on s.student_id = e.student_id
join courses c on e.course_id = c.course_id
where s.student_id in (
    select student_id
    from enrollments
    group by student_id
    having count(course_id) > 1
    );