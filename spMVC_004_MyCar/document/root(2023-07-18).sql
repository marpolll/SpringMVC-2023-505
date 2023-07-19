-- MyCar root 화면

CREATE DATABASE mycarDB;

use mycardb;

create table tbl_carmanager (
	c_seq	bigint		PRIMARY KEY	AUTO_INCREMENT,
	c_carnum	varchar(15)	NOT NULL,		
	c_qty	varchar(10)	NOT NULL,		
	c_username	varchar(20)	NOT NULL,		
	c_sdate	varchar(10)	NOT NULL,		
	c_stime	varchar(10)	NOT NULL,		
	c_goal	varchar(30),			
	c_edate	varchar(10),			
	c_etime	varchar(10),			
	c_skm	int,			
	c_ekm	int,			
	c_cost	int			
);

INSERT INTO tbl_carmanager(
c_carnum, c_qty, c_username, c_sdate, c_stime, c_skm, c_ekm)
values('001', '출근', 'marpol', '2023-07-01', '07:00', 3000, 3010);

INSERT INTO tbl_carmanager(
c_carnum, c_qty, c_username, c_sdate, c_stime, c_skm, c_ekm)
values('001', '퇴근', 'marpol', '2023-07-01', '18:00', 3010, 3020);

commit;

select * from tbl_carmanager
WHERE c_carnum = '001'
order by c_sdate desc, c_stime desc
limit 1;

INSERT INTO tbl_carmanager(
c_carnum, c_qty, c_username, c_sdate, c_stime, c_skm, c_ekm)
values('002', '서울출장', 'marpol', '2023-07-01', '07:00', 10000, 10300);

INSERT INTO tbl_carmanager(
c_carnum, c_qty, c_username, c_sdate, c_stime, c_skm, c_ekm)
values('002', '서울출장복귀', 'marpol', '2023-07-01', '18:00', 10300, 10600);

select * from tbl_carmanager;
