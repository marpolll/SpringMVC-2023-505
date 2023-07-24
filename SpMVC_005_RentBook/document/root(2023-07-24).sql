-- RentBook root 접속 화면


create database rentbookDB;

use rentbookdb;

create table tbl_books (

	b_code	varchar(13)	not null	primary key,
	b_name	varchar(125)	NOT NULL,	
	b_auther	varchar(125)	NOT NULL	,
	b_comp	varchar(125),		
	b_year	int	NOT NULL,	
	b_iprice	int,		
	b_rprice	int	NOT NULL
);

drop table tbl_books;