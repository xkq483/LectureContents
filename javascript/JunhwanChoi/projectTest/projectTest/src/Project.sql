create table project(
   project_no int not null auto_increment,
   name varchar(200) not null,
   price int not null,
   description text not null,
   reg_date timestamp not null default now(),
   primary key(project_no)
);