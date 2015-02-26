--A Many-to-Many mapping can be implemented using a Set java collection that does not 
--contain any duplicate element. We already have seen how to map Set collection in hibernate, 
--so if you already learned Set mapping then you are all set to go with many-to-many mapping.

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
	PRIMARY KEY (id) 
);

create table EMP_CERT ( 
	employee_id INT NOT NULL, 
	certificate_id INT NOT NULL, 
	PRIMARY KEY (employee_id,certificate_id) 
);