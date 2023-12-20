create database store;
use store;

create table product (
                         id int not null primary key auto_increment,
                         name varchar(60) not null,
                         price double not null,
                         quantity int not null,
                         idCategory int,
                         foreign key (idCategory) references category(id)
);

create table category(
                         id int not null primary key auto_increment,
                         name varchar(60) not null
);