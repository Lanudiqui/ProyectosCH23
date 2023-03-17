-- USE `business`;

-- Revisar employyee
SELECT * FROM employee;

-- Alias 
SELECT last_name AS 'Apellido' FROM employee;

-- Alias ++
SELECT employee_id AS 'ID',
	first_name AS 'Nombre',
	last_name AS 'Apellido',
	department AS 'Departamento' 
FROM employee;

-- Filtrar por nombre
-- Buscar Monica

SELECT * FROM employee WHERE first_name = 'Monika';

-- Filtrar doble
SELECT * FROM employee
WHERE salary = 500000 AND first_name = 'Vivek';

-- Filtrar por NOT 
SELECT * FROM employee
WHERE NOT first_name = 'Barrack';

-- Filtrar por doble NOT 
SELECT * FROM employee
WHERE NOT first_name = 'Santiago' AND NOT first_name = 'Ian' ;

-- Ordenamiento
-- ORDER BY
-- Default  es orden descendiente DESC y ascendente ASC
SELECT * FROM employee
ORDER BY department ASC;

-- DESC
SELECT * FROM employee
ORDER BY department DESC;

SELECT * FROM employee
ORDER BY department ASC, last_name DESC;


-- GROUP BY  
SELECT * FROM employee
GROUP BY salary;

-- IN 
SELECT * FROM employee
WHERE employee_id IN (1,3,7,8,5);

-- BETWEEN
SELECT * FROM employee
WHERE salary BETWEEN 200000 AND 500000;

-- NOT BETWEEN 
SELECT * FROM employee
WHERE salary NOT BETWEEN 200000 AND 500000;

-- LIMIT 
SELECT * FROM employee
LIMIT 5;

-- LIMIT + OFFSET
SELECT * FROM employee
LIMIT 3 OFFSET 3;

-- LIKE 
SELECT * FROM employee
WHERE last_name LIKE 'B%';

SELECT * FROM employee
WHERE last_name LIKE BINARY '%A';

-- LIKE ++
SELECT * FROM employee
WHERE join_date LIKE '%02%';

-- UPDATE 
UPDATE employee
	SET salary =300000
WHERE employee_id = 8;

UPDATE employee
	SET salary =75000
WHERE employee_id = 6;

SELECT * FROM employee;

INSERT INTO employee (first_name,last_name,salary,join_date,department)VALUES ('Daniela','Ruiz','500000','2023-03-17','Devalapars');

UPDATE employee
	SET join_date = '2023-03-17'
WHERE employee_id LIMIT 7;


