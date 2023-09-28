create database jogo;
use jogo;

create table jogador(
cod_jogador int PRIMARY KEY,
nome varchar(255),
nickname varchar (24),
sexo char,
email varchar(255),
dt_nasc date,
pontuacao int,
moedas int
);
create table poder(
cod_poder int primary key,
habilidade varchar (24)
);
create table adquire_poder(
cod_aquisicao int primary key,
cod_jogador int,
cod_poder int,
FOREIGN KEY(cod_jogador) REFERENCES jogador(cod_jogador),
FOREIGN KEY(cod_poder) REFERENCES poder(cod_poder),
dt_hora_aquisicao datetime 
);
create table cenario(
cod_cenario int primary key,
caracteristicas varchar(24),
qtde_min_pontos int
);
create table partida(
cod_partida int primary key,
data_hora_inicio datetime,
data_hora_termino datetime,
pontos_obtidos int,
cod_jogador int,
cod_cenario int,
FOREIGN KEY(cod_jogador) REFERENCES jogador(cod_jogador),
FOREIGN KEY(cod_cenario) REFERENCES cenario(cod_cenario)
);

select*from cenario

