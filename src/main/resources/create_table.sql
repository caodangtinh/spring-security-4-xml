create database springsec;
use springsec;
create table users (
username varchar(50) not null primary key,
password varchar(50) not null,
enable boolean not null
);
create table authorities (
username varchar(50) not null,
authority varchar(50) not null,
constraint fk_authorities_user foreign key (username) references users(username)
);

select * from users;
select * from authorities;