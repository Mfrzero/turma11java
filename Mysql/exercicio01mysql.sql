create database servicorh;
use servicorh;

create table funcionarios(
	id int auto_increment primary key,
    nome varchar(40) not null,
    idade int unsigned not null,
    formacao varchar(40) not null,
    salario double unsigned not null
);

insert into funcionarios (nome, idade, formacao, salario) values ('Marcio', 30, 'Comunicação', 2500.00);
insert into funcionarios (nome, idade, formacao, salario) values ('Maria', 22, 'Psicologia', 2000.00);
insert into funcionarios (nome, idade, formacao, salario) values ('Caio', 27, 'Pedagogia', 1900.00);
insert into funcionarios (nome, idade, formacao, salario) values ('Josefa', 40, 'Psicologia', 3500.00);
insert into funcionarios (nome, idade, formacao, salario) values ('Luiz', 35, 'Sociologia', 2700.00);

select * from funcionarios where salario > 2000;
select * from funcionarios where salario < 2000;

begin;
insert into funcionarios (nome, idade, formacao, salario) values ('Luiz', 36, 'Sociologia', 3000.00);
commit;