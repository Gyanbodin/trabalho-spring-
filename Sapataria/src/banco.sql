create database sapataria;

use sapataria;

create table sapato(
codigo long(2) AUTO_INCREMENTE key primary,
marca varchar(20) not null,
tamanho double(4)not null,
pre�o varchar(2) not null

);

select * from sapato;
