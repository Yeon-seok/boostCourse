create database Business_card;

use Business_card;

drop table card;

create table card(
name varchar(20),
phone_number varchar(20),
company varchar(20),
time DATETIME DEFAULT now()
);

show tables;

desc card;

select * from card;


