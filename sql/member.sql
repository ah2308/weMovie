drop table member;

create table member(
mem_no INT NOT NULL auto_increment,
userid varchar(50), 
passwd varchar(50),
name varchar(50),
email varchar(50),
primary key(mem_no)
);

INSERT INTO member (userid, passwd, name, email)
VALUES ('hjw452', '1234', '홍진우', 'hjw452@naver.com');

select * from member;

COMMIT;