CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

create table `CERTIFICATE` ( id INT NOT NULL auto_increment, 
	`certificate_name` VARCHAR(30) default NULL, 
	`employee_id` INT default NULL, 
	PRIMARY KEY (`id`) );