create database db_RH2;
use db_RH2;

create table tb_cargo(
	id_cargo int primary key,
	cargo enum('dev back-end', 'dev front-end', 'dev banco de dados', 'Web Designer'),
    salario double unsigned not null
);

create table tb_funcionario(
	id_funcionario int auto_increment primary key,
	nome varchar(40) not null,
    idade int unsigned,
    endereco varchar(40),
    formacao varchar(40),
    id_cargo int,
    CONSTRAINT fk_cargo FOREIGN KEY ( id_cargo ) REFERENCES tb_cargo ( id_cargo ) 
);

select * from tb_funcionario f inner join tb_cargo c where f.id_cargo = c.id_cargo and c.salario > 2000;
select * from tb_funcionario f inner join tb_cargo c where f.id_cargo = c.id_cargo and c.salario between 1000 and 2000;
select * from tb_funcionario f inner join tb_cargo c where f.id_cargo = c.id_cargo and f.nome like 'c%';

insert into tb_cargo values (1, 'dev back-end', 3500.00);
insert into tb_cargo values (2, 'dev front-end', 2500.00);
insert into tb_cargo values (3, 'dev banco de dados', 3000.00);
insert into tb_cargo values (4, 'Web Designer', 1900.00);
insert into tb_cargo values (5, 'dev back-end', 2900.00);

insert into tb_funcionario values (1,'Marcio', 31, 'Rua 01', 'ADS', 1),
								  (2,'Emily', 20, 'Rua 02', 'SI', 2),
								  (3,'Vinicius', 19, 'Rua 03', 'CC', 3),
								  (4,'Eliane', 35, 'Rua 04', 'ES', 4),
								  (5,'Isabella', 40, 'Rua 05', 'ADS', 5), 
								  (6,'Calebe', 27, 'Rua 06', 'SI', 5), 
								  (7,'Emanuel', 26, 'Rua 07', 'ADS', 4), 
								  (8,'Igor', 23, 'Rua 08', 'CC', 1), 
								  (9,'Alícia', 21, 'Rua 09', 'CC', 1), 
								  (10,'Cristiane', 31, 'Rua 10', 'BD', 3), 
								  (11,'Fernando', 29, 'Rua 11', 'ADS', 4), 
								  (12,'Rodrigo', 30, 'Rua 12', 'CC', 1), 
								  (13,'Daniel', 30, 'Rua 13', 'CC', 5), 
								  (14,'Clara', 37, 'Rua 14', 'BD', 3), 
								  (15,'Fabiana', 32, 'Rua 15', 'SI', 2)
