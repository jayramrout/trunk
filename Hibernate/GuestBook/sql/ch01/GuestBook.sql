CREATE DATABASE GuestBook;

USE GuestBook;

CREATE TABLE GuestBook(
VisitorNo Int PRIMARY KEY AUTO_INCREMENT,
VisitorName varchar(50),
Message varchar(100),
MessageDate varchar(40));