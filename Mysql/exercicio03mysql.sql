create database db_ecommerce;
use db_ecommerce;


create table tb_categoria(
	id_categoria int primary key,
	tipo varchar(30),
    marca varchar(30)
);

create table tb_produto(
	id_produto int primary key,
    preco double not null,
    disponivel enum ('Sim', 'Não'),
    tamanho enum ('P', 'M', 'G', 'GG', 'EXG'),
    cor varchar(30),
    id_categoria int,
    CONSTRAINT fk_categoria FOREIGN KEY ( id_categoria ) REFERENCES tb_categoria ( id_categoria ) 
);

drop table tb_produto;

select * from tb_produto where preco > 2000;
select * from tb_produto where preco between 1000 and 2000;
select * from tb_categoria c where c.tipo like 'c%';

select * from tb_categoria;

insert into tb_categoria values (1, 'Moletom', 'Lacoste'),
								(2, 'Camisa Social', 'Diesel'),
								(3, 'Camisa Polo', 'Adidas'),
								(4, 'Camiseta Regata', 'DC'),
								(5, 'Casaco', 'Oakley');
	
insert into tb_produto values (1, 1500, 'Sim', 'P', 'Azul', 1),
							  (2, 1000, 'Sim', 'M', 'Vermelho', 5),
							  (3, 980, 'Não', 'G', 'Preto', 2),
							  (4, 5000, 'Não', 'M', 'Azul', 3),
							  (5, 4500, 'Sim', 'G', 'Vermelho', 4),
                              (6, 6000, 'Não', 'G', 'Preto', 5),
							  (7, 3500, 'Sim', 'GG', 'Verde', 1),
							  (8, 1400, 'Sim', 'G', 'Azul', 3),
							  (9, 800, 'Sim', 'P', 'Preto', 4),
							  (10, 105, 'Sim', 'M', 'Verde', 1),
                              (11, 164, 'Não', 'P', 'Verde', 2),
							  (12, 500, 'Não', 'EXG', 'Azul', 4),
							  (13, 6050, 'Sim', 'GG', 'Preto', 2),
							  (14, 8000, 'Não', 'M', 'Vermelho', 5),
							  (15, 10000, 'Sim', 'G', 'Azul', 5);