-- MIN 
SELECT MIN(salary) FROM employee;

SELECT MIN(last_name) FROM employee;

-- MAX 
SELECT MAX(salary) FROM employee;

-- AVG 
SELECT AVG(salary) AS promedio FROM employee;
SELECT AVG(join_date) FROM employee;
SELECT AVG(last_name) FROM employee;

-- SUMA
SELECT SUM(employee_id) FROM employee;
SELECT SUM(salary) AS salarioTotal, SUM(employee_id) AS sumaId FROM employee;
SELECT SUM(salary), AVG(salary) FROM employee;

-- COUNT 
SELECT COUNT(employee_id) FROM employee;
SELECT COUNT(salary) FROM employee;
SELECT COUNT(DISTINCT(salary)) FROM employee;






SELECT * FROM employee
ORDER BY salary ASC;