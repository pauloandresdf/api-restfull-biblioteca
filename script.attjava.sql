CREATE DATABASE attjava_name; 
USE mydb;

CREATE TABLE livro ( 
id BIGINT PRIMARY KEY AUTO_INCREMENT, 
 titulo VARCHAR(100) NOT NULL,
 autor_principal VARCHAR(150) NOT NULL,
 ano_publicacao INT NOT NULL,
 edicao INT NOT NULL,
 data_criacao DATETIME NOT NULL,
 data_alteracao DATETIME,
 INDEX idx_livro_id (id)

);
