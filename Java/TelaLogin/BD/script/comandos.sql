create database if not exists cadastro charset utf8 collate utf8_general_ci;

use cadastro;

create table if not exists usuarios(
id int auto_increment,
usuario varchar(30) not null unique,
senha varchar(30) not null,
primary key(id)
);