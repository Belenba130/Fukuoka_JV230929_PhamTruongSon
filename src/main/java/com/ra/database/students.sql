create database if not exists module4;
use module4;
create table if not exists student (
id int primary key,
student_name varchar(100),
sex bit,
phone_number varchar(15),
image_url varchar(255),
birthday date,
address varchar(255)
);

