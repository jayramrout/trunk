CREATE TABLE `student` (
           `sid` int(5) NOT NULL auto_increment,  
           `sname` varchar(20) default NULL,      
           `tot_m` float(5,2) default NULL,       
           PRIMARY KEY  (`sid`)                   
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;