create database empresa;
use empresa;

CREATE TABLE cargo(
cod_cargo int PRIMARY KEY,
nome varchar(50),
nivel varchar(10),
salario numeric(7,2)
);

CREATE TABLE departamento(
cod_depto int PRIMARY KEY,
nome varchar(50),
sigla varchar(8)
);

CREATE TABLE funcionario(
cod_func int PRIMARY KEY,
nome varchar(50),
data_adm date,
sexo char,
cod_cargo int,
cod_depto int,
FOREIGN KEY(cod_cargo) REFERENCES cargo(cod_cargo),
FOREIGN KEY(cod_depto) REFERENCES departamento(cod_depto)
);

select * from funcionario


