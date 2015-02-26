--Same address object can be associated with multiple employee objects
create table EMPLOYEE ( 
	id INT NOT NULL auto_increment, 
	first_name VARCHAR(20) default NULL, 
	last_name VARCHAR(20) default NULL, 
	salary INT default NULL, 
	PRIMARY KEY (id) 
	);

create table CERTIFICATE ( 
	id INT NOT NULL auto_increment, 
	certificate_name VARCHAR(30) default NULL, 
	employee_id INT default NULL,
	PRIMARY KEY (id) 
);