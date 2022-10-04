drop table wemovies.member;

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

select * from wemovies.member;