 create database isaac;
 use isaac;
 
DROP TABLE IF EXISTS account;  
CREATE TABLE  account (  
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,  
  `username` varchar(45) NOT NULL,  
  `password` varchar(45) NOT NULL,  
  `phone` varchar(45) NOT NULL,  
  `email` varchar(45) NOT NULL,  
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8; 


INSERT INTO account (  
 `username`,  
 `password`,  
 `phone`,  
 `email`)  
VALUES(  
 'admin',  
 'bocoxdpp',  
 '01088156789',  
 'xdpp@boco.com.cn'); 