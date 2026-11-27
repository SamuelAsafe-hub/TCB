create database sis_GeVidaPessoal;
use sis_GeVidaPessoal;

create table Usuario(
	id_Usuario int not null auto_increment,
    nickname varchar(100) not null unique,
    senha varchar(100) not null,
	primary key(id_Usuario)
);

create table Atividade(
	id_Atividade int not null auto_increment,
    id_Usuario int not null,
    descricao varchar(255) not null,
	data_Atividade date not null,
    horario time not null,
    duracao int not null,
	primary key(id_Atividade),
	constraint fk_Atividades_Usuario 
		foreign key (id_Usuario) 
        references Usuario(id_Usuario)
);

create table Tabela_Financas(
	id_Tabela int not null auto_increment,
    id_Usuario int not null,
    nome varchar(100) not null,
    saldo_Inicial decimal (10,2) not null,
    valor_Alvo decimal (10,2) not null,
    primary key(id_Tabela),
	constraint fk_Tabela_Usuario
		foreign key (id_Usuario) 
        references Usuario(id_Usuario)
);

create table Transacao(
	id_Transacao int not null auto_increment,
    id_Tabela int not null,
    tipo varchar(20) not null,
    valor decimal (10,2) not null,
    descricao varchar(255) not null,
    data_Transacao date not null,
    primary key(id_Transacao),
	constraint fk_Transacao_Tabela
		foreign key (id_Tabela) 
        references Tabela_Financas(id_Tabela)
);
