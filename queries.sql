-- Este archivo contiene las consultas SQL
-- que se muestran en el enunciado.

-- 1
SELECT name FROM employees

-- 2
SELECT name, age FROM employees

-- 3
SELECT name, age FROM employees WHERE age > 30

-- 4
SELECT name, age FROM employees ORDER BY age ASC

-- 5
SELECT name, age FROM employees WHERE age >= 30 ORDER BY name DESC

-- 6
SELECT * FROM products WHERE (price >= 100 AND stock > 0) OR (category = ’Electronics’)

-- 7
SELECT name, description FROM products WHERE (price >= 10.5 AND stock > 0) OR
(category = ’Electronics’) ORDER BY name ASC

-- 8
SELECT name, age FROM employees WHERE
(age > 30 AND (department = ’HR’ OR department = ’Finance’))
OR (salary > 50000)