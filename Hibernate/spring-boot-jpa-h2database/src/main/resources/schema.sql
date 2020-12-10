DROP TABLE IF EXISTS employees;

CREATE TABLE employee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  address VARCHAR(250) DEFAULT NULL,
  passport_id int
);

CREATE TABLE passport (
   id INT AUTO_INCREMENT  PRIMARY KEY,
   number VARCHAR(250) NOT NULL
);

CREATE TABLE salary (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  from_date date NOT NULL,
  to_date date NOT NULL,
  salary float(6.3) not null,
  employee_id int not null
);

CREATE TABLE certificate (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    name VARCHAR2(100) NOT NULL

);

CREATE TABLE EMPLOYEE_X_CERTIFICATE(
    employee_id INT NOT NULL,
    certificate_id INT NOT NULL,
    PRIMARY KEY (employee_id, certificate_id)
)