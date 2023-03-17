SELECT * FROM students;
SELECT * FROM countries;
SELECT * FROM idtypes;
SELECT * FROM courses_has_students;
SELECT * FROM courses;
SELECT * FROM modules;
-- Encontrar estudiantes que sean del pais 125
SELECT *FROM students WHERE nationality = 125;

  
  -- Contar estudiantes que pertenezcan al curso JAVA-1
  SELECT COUNT(*) FROM courses_has_students WHERE course_code = 'JAVA-1';
  
  -- Contar estudiantes por cada modulo
SELECT
t4.name AS 'Modulo',
COUNT(t1.idStudent) AS 'No.Student'
FROM students t1
INNER JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
INNER JOIN courses t3
ON t2.course_code = t3.code
INNER JOIN modules t4
ON t3.module_code = t4.code
GROUP BY t4.code
ORDER BY COUNT(t1.idStudent);
  
  -- Encontrar estudiantes SIN curso
  select 
students.idStudent AS 'ID S',
students.name AS 'Nombre',
courses_has_students.students_id_student AS 'ID ',
courses_has_students.course_code
from students
left join courses_has_students
on students.idStudent = courses_has_students.students_id_student
where students.idStudent is null;
  
  