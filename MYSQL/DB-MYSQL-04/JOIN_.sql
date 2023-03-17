-- INNER JOIN 
-- t.students t.countries

SELECT * FROM students;
SELECT * FROM countries;
SELECT * FROM idtypes;
SELECT * FROM courses_has_students;
SELECT * FROM courses;
SELECT * FROM modules;


-- encontrar a que pais pertenecen 
SELECT students.*, countries.name, countries.code
FROM students
INNER JOIN countries
ON 
students.nationality = countries.idCountries;

SELECT students.idStudent AS 'ID',students.name AS 'Nombre', students.last_name AS 'Apellido',countries.name AS 'Pais de origen', countries.code AS 'Codigo de pais'
FROM students
INNER JOIN countries
ON 
students.nationality = countries.idCountries;

-- Encontramos que tipo de id tiene la raza 
SELECT students.idStudent AS 'ID',
students.name AS 'Nombre', 
students.last_name AS 'Apellido',
idtypes.name AS 'Tipo de ID de registro'
FROM students
INNER JOIN idtypes
ON students.IdType_id = idtypes.id_idTypes;

-- Abreviaciones
SELECT t1.name , 
	t2.name, 
	t2.code
FROM students t1
INNER JOIN countries t2
ON 
t1.nationality = t2.idCountries;

-- Estudiantes que esten registrados en un curso
-- Nombre, id, apellido, curso al que estan registrados
SELECT students.name AS 'Nombre',
students.idStudent AS 'ID', 
students.last_name AS 'Apellido',
courses_has_students.course_code AS 'Curso', 
courses_has_students.students_id_student AS 'Id students con curso'
FROM students
INNER JOIN courses_has_students
ON 
students.idStudent= courses_has_students.students_id_student;

SELECT 
t1.name AS 'Nombre',
t1.last_name AS 'Apellido',
t2.course_code AS 'Codigo',
t3.name AS 'Curso',
t3.credits AS 'CREDITOS'
FROM students t1
INNER JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
INNER JOIN courses t3
ON t2.course_code = t3.code;


-- GROUP BY sirve para agrupar datos agregados/coincidentes.
SELECT 
t1.course_code AS 'Codigo de curso',
t2.code AS 'Codigo de curso',
t2.name AS 'Curso'
FROM courses_has_students t1
INNER JOIN courses t2
ON t1.course_code = t2.code
GROUP BY t2.code;



