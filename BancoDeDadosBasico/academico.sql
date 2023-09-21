create database academico;

CREATE TABLE Curso(
cod_curso int PRIMARY KEY,
nome_curso varchar(40),
sigla varchar(8)
);

CREATE TABLE Aluno(
matr numeric(4) PRIMARY KEY,
nome varchar(50),
entrada char(6),
cod_curso int,
FOREIGN KEY(cod_curso) REFERENCES Curso(cod_curso)
);