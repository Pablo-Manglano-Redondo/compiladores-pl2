SELECT name FROM employees;

SELECT name, age FROM employees;

SELECT name, age FROM employees WHERE age > 30;

SELECT name, age FROM employees ORDER BY age ASC;

SELECT name, age FROM employees WHERE age >= 30 ORDER BY name DESC;

SELECT * FROM products WHERE (price >= 100 AND stock > 0) OR (category = "Electronics");

SELECT name, description FROM products WHERE (price >= 10.5 AND stock > 0) OR
(category = "Electronics") ORDER BY name ASC;

SELECT name, age FROM employees WHERE
(age > 30 AND (department = "HR" OR department = "Finance"))
OR (salary > 50000);