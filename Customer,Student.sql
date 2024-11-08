create schema dbms;
USE dbms;

CREATE TABLE customer (
    customer_id VARCHAR(20) PRIMARY KEY,           
    email VARCHAR(50) NOT NULL UNIQUE,              
    phone_no BIGINT UNIQUE,
    first_name VARCHAR(50) NOT NULL,             
    last_name VARCHAR(50) NOT NULL,               
    date_of_birth DATE,                        
    address VARCHAR(255),                       
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    loyalty_points INT DEFAULT 0 CHECK (loyalty_points >= 0),
    is_active BOOLEAN DEFAULT TRUE                  
);
ALTER TABLE customer
    ADD CONSTRAINT chk_email_format CHECK (email LIKE '%@%._%'),
    ADD CONSTRAINT chk_phone_length CHECK (LENGTH(phone_no) = 10), 
    ADD CONSTRAINT chk_first_last_name CHECK (first_name <> last_name); 

INSERT INTO customer (customer_id, email, phone_no, first_name, last_name, date_of_birth)
VALUES
    ('CUST001', 'customer1@example.com', 1234589890, 'John', 'Doe', '1990-01-01'),
    ('CUST002', 'customer2@example.com', 9876528210, 'Jane', 'Smith', '1992-05-20');


INSERT INTO customer (customer_id, email, phone_no, first_name, last_name, date_of_birth)
VALUES
    ('CUST003', 'amit.kumar@example.com', 9876543210, 'Amit', 'Kumar', '1985-02-15'),
    ('CUST004', 'pooja.sharma@example.com', 9123456789, 'Pooja', 'Sharma', '1990-06-20'),
    ('CUST005', 'ravi.patel@example.com', 9812345676, 'Ravi', 'Patel', '1991-03-25'),
    ('CUST006', 'sneha.jain@example.com', 9501234567, 'Sneha', 'Jain', '1993-08-10'),
    ('CUST007', 'vikram.singh@example.com', 9776543210, 'Vikram', 'Singh', '1987-05-17'),
    ('CUST008', 'deepika.mishra@example.com', 9209876543, 'Deepika', 'Mishra', '1994-01-10'),
    ('CUST009', 'arun.kumar@example.com', 9098765432, 'Arun', 'Kumar', '1992-11-15'),
    ('CUST010', 'neha.singh@example.com', 8001234567, 'Neha', 'Singh', '1995-09-20'),
    ('CUST011', 'sumit.agarwal@example.com', 8034567890, 'Sumit', 'Agarwal', '1988-12-02'),
    ('CUST012', 'rani.yadav@example.com', 9765432109, 'Rani', 'Yadav', '1990-07-11'),
    ('CUST013', 'manoj.shukla@example.com', 9587123456, 'Manoj', 'Shukla', '1984-04-22'),
    ('CUST014', 'priya.sharma@example.com', 9508765432, 'Priya', 'Sharma', '1991-10-18'),
    ('CUST015', 'sandeep.dubey@example.com', 9723456789, 'Sandeep', 'Dubey', '1992-02-05'),
    ('CUST016', 'sonia.rathore@example.com', 9678901234, 'Sonia', 'Rathore', '1993-12-25'),
    ('CUST017', 'rahul.verma@example.com', 9801234567, 'Rahul', 'Verma', '1986-06-28');

SELECT * FROM customer;
Select customer_id From customer where customer_id=CUST008;
SELECT customer_id FROM customer;

SELECT * 
FROM customer
WHERE customer_id = 'CUST003';


UPDATE customer
SET email = 'Ravi_patel@example.com'
WHERE customer_id = 'CUST005';

DELETE FROM customer
WHERE customer_id = 'CUST001';



CREATE TABLE students (
    student_id INT  PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    date_of_birth DATE NOT NULL,
    gender ENUM('Male', 'Female', 'Other') NOT NULL,
    phone_number VARCHAR(15),
    address VARCHAR(255),
    enrollment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    date_graduated DATE,
    is_active BOOLEAN DEFAULT TRUE,
    gpa DECIMAL(3, 2) CHECK (gpa >= 0 AND gpa <= 4.0),
    UNIQUE (first_name, last_name, date_of_birth)
);

CREATE TABLE Employee (
    employee_id INT AUTO_INCREMENT PRIMARY KEY,           -- Auto-incrementing unique employee ID
    first_name VARCHAR(50) NOT NULL,                      -- First name, cannot be NULL
    last_name VARCHAR(50) NOT NULL,                       -- Last name, cannot be NULL
    email VARCHAR(100) NOT NULL UNIQUE,                   -- Email, must be unique and cannot be NULL
    phone_number VARCHAR(15),                             -- Phone number (optional)
    hire_date DATE NOT NULL,                              -- Hire date (cannot be NULL)
    job_title VARCHAR(50),                                -- Job title (optional)
    salary DECIMAL(10, 2) CHECK (salary >= 0),             -- Salary, must be a positive number
    department VARCHAR(50),                               -- Department (optional)
    is_active BOOLEAN DEFAULT TRUE,                       -- Employee active status, defaults to TRUE
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,       -- Timestamp when the record was created
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP  -- Updated timestamp
);


Drop table Employee;
CREATE TABLE Employee (
    employee_id INT AUTO_INCREMENT PRIMARY KEY,         
    first_name VARCHAR(50) NOT NULL,                   
    last_name VARCHAR(50) NOT NULL,                    
    email VARCHAR(100) NOT NULL UNIQUE,                 
    phone_number VARCHAR(15),                           
    hire_date DATE NOT NULL,                           
    job_title VARCHAR(50),                          
    salary DECIMAL(10, 2) CHECK (salary >= 0),             
    department VARCHAR(50),                               
    is_active BOOLEAN DEFAULT TRUE,                       
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,       
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP   
);
DELIMITER $$

CREATE FUNCTION get_employee_name(p_employee_id INT) 
RETURNS VARCHAR(100)
DETERMINISTIC
BEGIN
    DECLARE full_name VARCHAR(100);
    
    SELECT CONCAT(first_name, ' ', last_name)
    INTO full_name
    FROM Employee
    WHERE employee_id = p_employee_id;
    
    RETURN full_name;
END $$

DELIMITER ;
INSERT INTO Employee (first_name, last_name, email, phone_number, hire_date, job_title, salary, department)
VALUES 
('John', 'Doe', 'john.doe@example.com', '1234567890', '2020-03-15', 'Software Engineer', 60000.00, 'IT'),
('Jane', 'Smith', 'jane.smith@example.com', '2345678901', '2019-05-23', 'Project Manager', 75000.00, 'Operations'),
('Suresh', 'Reddy', 'suresh.reddy@example.com', '3456789012', '2018-02-12', 'Senior Developer', 80000.00, 'IT'),
('Priya', 'Patel', 'priya.patel@example.com', '4567890123', '2021-06-30', 'HR Manager', 65000.00, 'HR'),
('Raj', 'Kumar', 'raj.kumar@example.com', '5678901234', '2022-01-10', 'Accountant', 50000.00, 'Finance');

INSERT INTO Employee (first_name, last_name, email, phone_number, hire_date, job_title, salary, department)
SELECT 'John', 'Doe', 'john.doe@example.com', '1234567890', '2020-03-15', 'Software Engineer', 60000.00, 'IT'
FROM DUAL
WHERE NOT EXISTS (
    SELECT 1 FROM Employee WHERE email = 'john.doe@example.com'
);

ALTER TABLE Employee MODIFY email VARCHAR(100) NULL;

UPDATE Employee
SET email = 'john.doe2@example.com'
WHERE employee_id = 1; 
SELECT COUNT(*) AS total_employees FROM Employee;
SELECT SUM(salary) AS total_salary FROM Employee;
SELECT AVG(salary) AS average_salary FROM Employee;
SELECT MIN(salary) AS minimum_salary FROM Employee;
SELECT MAX(salary) AS maximum_salary FROM Employee;
SELECT department, AVG(salary) AS average_salary
FROM Employee
GROUP BY department;

CREATE TABLE Student (
    student_id INT AUTO_INCREMENT PRIMARY KEY,  -- Primary key for Student
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    date_of_birth DATE NOT NULL,
    gender ENUM('Male', 'Female', 'Other') NOT NULL,
    phone_number VARCHAR(15),
    address VARCHAR(255),
    enrollment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    is_active BOOLEAN DEFAULT TRUE
);


CREATE TABLE Department (
    dept_id INT AUTO_INCREMENT PRIMARY KEY,       
    dept_name VARCHAR(100) NOT NULL,                
    dept_head INT,                                  
    creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
    FOREIGN KEY (dept_head) REFERENCES Student(student_id) 
);

INSERT INTO Student (first_name, last_name, email, date_of_birth, gender, phone_number)
VALUES 
('John', 'Doe', 'john.doe@example.com', '2000-01-01', 'Male', '1234567890'),
('Jane', 'Smith', 'jane.smith@example.com', '1998-05-23', 'Female', '2345678901');

INSERT INTO Department (dept_name, dept_head)
VALUES 
('Computer Science', 1),  
('Engineering', 2);     


SELECT 
    d.dept_id, 
    d.dept_name, 
    d.creation_date, 
    s.first_name AS dept_head_first_name, 
    s.last_name AS dept_head_last_name
FROM 
    Department d
JOIN 
    Student s ON d.dept_head = s.student_id;


SELECT orders.order_id, customers.customer_name
FROM orders
INNER JOIN customers
ON orders.customer_id = customers.customer_id;

SELECT employees.employee_id, employees.first_name, departments.department_name
FROM dbms.employees
LEFT JOIN dbms.departments
ON employees.department_id = departments.department_id;

