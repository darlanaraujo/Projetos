drop database cadastros;

create database if not exists cadastros default charset utf8 default collate utf8_general_ci;

use cadastros;

create table if not exists usuarios(
id int(11) auto_increment,
usuario varchar(30) not null unique,
senha varchar(30) not null,
primary key (id)
) default charset utf8;