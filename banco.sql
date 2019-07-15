create database CM_Community;

create table pessoa(
	cpf bigint(11) primary key,
    nome varchar(30) not null,
    endereco varchar(60) not null,
    telefone varchar(11) not null,
    sexo char 
)ENGINE=INNODB;
create table voluntario(
	cpf_voluntario bigint(11) primary key,
    nome varchar(30) not null,
    endereco varchar(60) not null,
    telefone varchar(11) not null,
    sexo char, 
    nome_usuario varchar(11),
    senha varchar(12) not null, 
    adm boolean not null
)ENGINE=INNODB;    
create table exemplar( 
	titulo varchar(30),
    autor varchar (30),
    editora varchar(30),
	volume int,
	edicao varchar(20),
	data_entrada date,
    quantidade int,
    isbn bigint(13) primary key
)ENGINE=INNODB;
create table emprestimo(
	codigo int auto_increment primary key,
    livro bigint(13) not null,
    locatario bigint(11) not null,
	voluntario_resp bigint(11) not null,
    data_emprestimo datetime not null,
    data_devolucao datetime
)ENGINE=INNODB;

alter table emprestimo add foreign key (livro) references exemplar(isbn);
alter table emprestimo add foreign key(voluntario_resp) references voluntario(cpf_voluntario);
alter table emprestimo add foreign key (locatario) references pessoa(cpf);


select * from exemplar;
select * from pessoa;
select * from voluntario;

insert into voluntario (cpf_voluntario,nome,endereco,telefone,sexo,nome_usuario,senha,adm) values (11855486666,'jose','rua dos bobos','3133873710','m','Jose','814374',true); 

