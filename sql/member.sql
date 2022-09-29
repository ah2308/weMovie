DROP TABLE member;

CREATE TABLE member (
   id varchar(15) NOT NULL,
   pwd varchar(15) NOT NULL,
   name varchar(15) NOT NULL,
   age varchar(15) NOT NULL,
   phone varchar(15) NOT NULL
);

ALTER TABLE member ADD PRIMARY KEY (id);

SELECT * FROM member;