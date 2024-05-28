use student_db;

CREATE TABLE students (
student_id int NOT NULL auto_increment,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
age INT NOT NULL,
contact_details VARCHAR(50) NOT NULL,
primary key (student_id)
);
CREATE TABLE courses (
course_id INT NOT NULL auto_increment,
course_name VARCHAR(50) NOT NULL,
credits VARCHAR(50) NOT NULL,
instructor VARCHAR(50) NOT NULL,
primary key (course_id)
);

SELECT * FROM student_db.students;

insert into students (first_name, last_name, age, contact_details)
values 
('Barney', 'Stinson', 30, 'New York'),
('Marshall', 'Eriksson', 30, 'New York'),
('Ted', 'Mosby', 30, 'New York'),
('Lily', 'Eriksson', 30, 'New York'),
('Robin', 'Scherbatsky', 30, 'New York');

update students
set contact_details = 'Kyoto'
where student_id = 5;

select first_name, last_name, age from students;

SELECT * FROM student_db.courses;

insert into courses (course_name, credits, instructor)
values
('Java', 10, 'Seymur'),
('SQL', 4, 'Seymur'),
('HTTP', 1, 'Seymur'),
('Spring Boot', 7, 'Seymur'),
('Fundamentals', 1, 'Self');

delete from courses
where course_id = 15;

select * from courses where credits > 3 order by course_name asc;