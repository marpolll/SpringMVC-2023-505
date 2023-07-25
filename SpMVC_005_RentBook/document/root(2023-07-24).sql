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

create table tbl_members(
	m_code	varchar(6)	NOT NULL	primary key,
	m_name	varchar(125)	NOT NULL,	
	m_tel	varchar(15)	NOT NULL,	
	m_addr	varchar(125)		
);

create table tbl_rent_book(

	r_seq	bigint	NOT NULL	primary key auto_increment,
	r_date	varchar(10)	NOT NULL,	
	r_return_date	varchar(10)	NOT NULL,
	r_bcode	varchar(13)	NOT NULL,	
	r_mcode	varchar(6)	NOT NULL,	
	r_return_yn	varchar(1),		
	r_point	int,		
	r_price	int		
);



commit;

drop table tbl_members;

select * from tbl_members;

show tables;


desc tbl_rent_book;

insert into tbl_books (
b_code, b_name, b_auther, b_comp, b_year, b_iprice, b_rprice
) values (
	'001', '자바야', '놀자', '출판', 2010, 20000, 2000
);

drop table tbl_rent_book;

