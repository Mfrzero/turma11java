create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria(
	id_categoria int primary key,
    tipo enum ('Bovina', 'Frango', 'Suino'),
    marca enum ('BRF', 'JBS', 'Mafrig')
); 

create table tb_produto(
	id_produto int primary key auto_increment,
    nome varchar(30),
    preco double,
    quantidade double,
    id_categoria int,
    constraint fk_categoria foreign key (id_categoria) references tb_categoria (id_categoria)    
); 

insert into tb_categoria values (1, 'Bovina', 'BRF'),
								(2, 'Frango', 'Mafrig'),
								(3, 'Suino', 'BRF'),
								(4, 'Bovina', 'JBS'),
								(5, 'Bovina', 'JBS');
							
select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like('c%') or ('%c%');
select * from tb_produto inner join tb_categoria ;
select * from tb_produto p inner join tb_categoria c on p.id_categoria = c.id_categoria where c.tipo = 'Frango';
insert into tb_produto values (1,'Bisteca', 30.50, 10, 3),
								(2, 'Peito', 15.50, 5, 2),
								(3, 'Linguiça', 13.90, 12, 3),
								(4, 'Acém', 26.80, 13, 4),
								(5, 'Filé mignon', 59.30, 6, 5),
								(6, 'Filé de Costela', 42.60, 4, 1),
								(7, 'Costela Suina', 20.40, 3, 3),
								(8, 'Sobrecoxa', 15.40, 7, 2);


