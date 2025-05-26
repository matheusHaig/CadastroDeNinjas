-- V2: migrations para add a coluna de rank na tabla de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);