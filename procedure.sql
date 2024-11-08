create database employee;
use employee;
create table employee 
( employee_id int primary key,
  firstname char(20) not null,
  lastname char(20) not null,
  age int ,
  salary int not null

);
INSERT INTO employee (employee_id, firstname, lastname, age, salary) VALUES
(1, 'John', 'Doe', 29, 50000),
(2, 'Jane', 'Smith', 32, 55000),
(3, 'Alex', 'Johnson', 26, 48000),
(4, 'Emily', 'Davis', 41, 62000),
(5, 'Chris', 'Brown', 35, 54000),
(6, 'Katie', 'Miller', 27, 51000),
(7, 'Tom', 'Wilson', 30, 57000),
(8, 'Nancy', 'Moore', 28, 50000),
(9, 'David', 'Taylor', 45, 67000),
(10, 'Sophia', 'Anderson', 33, 60000),
(11, 'Michael', 'Thomas', 38, 61000),
(12, 'Megan', 'Jackson', 22, 45000),
(13, 'Brian', 'White', 31, 53000),
(14, 'Ashley', 'Harris', 29, 52000),
(15, 'James', 'Martin', 37, 59000);

CALL new_procedure(17, 'Johny', 'Doe', 29, 50000);
CALL new_i(10, 37);
 
 call ne(10,37);
 