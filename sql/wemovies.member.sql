create table wemovies.member(
	mid varchar(100),
    pwd varchar(100),
    name varchar(100),
    email varchar(100),
    birth date,
    mauth char(5),
    reg_date date,
    primary key(mid)
);

insert into wemovies.member (mid, pwd, name, email, birth, mauth, reg_date) 
values ('role', '1234', '회원', 'role452@naver.com', '2022-10-04', 'B', now());

select * from wemovies.member;