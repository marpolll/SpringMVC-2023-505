-- 여기는 mycarDB root로 접속

use mycardb;

create table tbl_users (
	username	varchar(15)		PRIMARY KEY,
	password	varchar(255)	NOT NULL,	
	u_name	varchar(20)	NOT NULL,	
	u_nickname	varchar(20),		
	u_tel	varchar(15),		
	u_role	varchar(15)	NOT NULL	
);

select * from tbl_users;

drop table tbl_carmanager;

show tables;

drop table tbl_users;

insert into tbl_users(username, password, u_name, u_nickname, u_tel, u_role)
values
('marpol', '12341234', '홍길', '길동', '', 'ADMIN');