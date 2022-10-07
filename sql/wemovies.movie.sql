drop table wemovies.movie;

create table wemovies.movie(
mid varchar(100),
res_name varchar(100),
res_t_locate varchar(100),
res_seat varchar(100),
res_price varchar(100),
res_day varchar(100),
res_lating int(20),
foreign key (mid) references wemovies.member (mid)
);

select * from wemovies.movie;
		