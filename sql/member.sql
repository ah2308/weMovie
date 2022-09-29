DROP TABLE tb_member;

CREATE TABLE tb_member (
   id varchar(15) NOT NULL,
   pwd varchar(15) NOT NULL,
   name varchar(15) NOT NULL,
   age varchar(15) NOT NULL,
   phone varchar(15) NOT NULL
);

ALTER TABLE tb_member ADD PRIMARY KEY (id);

SELECT * FROM tb_member;