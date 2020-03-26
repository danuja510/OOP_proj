create table Customer_oop(
cno integer,
fname varchar(50),
lname varchar(50),
email varchar(50),
tp_no varchar(50),
password varchar(50),
constraint o1 primary key(cno))

select * from Customer_oop

delete
from Customer_oop
where cno=2

select cno from Customer_oop where password='123' and email='danuja.nimsara@gmail.com'

select MAX(cno) from Customer_oop


create table Employee_oop(
emp_no integer,
empname varchar(50),
emplname varchar(50),
email varchar(50),
tp_no varchar(50),
adress varchar (100),
password varchar(50),
Position varchar (20),
status varchar(20),
constraint d891 primary key(emp_no),
 constraint t56 check (Position = 'Manager' OR Position = 'Worker' ),
 constraint t567 check (status = 'Assinged' OR Status = 'Available' ))

insert into Employee_oop values (1, 'tae', 'sdf','sdafa','123','sdfgh','123','Manager','Assinged')
insert into Employee_oop values (2, 'te', 'sdf','sdafa','123','sdfgh','456','Worker','Available')

select * from Employee_oop

select password from Employee_oop where emp_no=1

alter table Employee_oop
add salary float

create table order_details(
odno integer,
odname varchar(50),
standard_quality_price float,
cost_per_standard_order float,
constraint t4 primary key(odno))

select * from order_details

insert into order_details values (1,'PP_Classic_6x4',190,120 )
insert into order_details values (2,'PP_Classic_6x4.5',190,120 )
insert into order_details values (3,'PP_Large_8x6',200,130 )
insert into order_details values (4,'PP_Large_9x6',210,130 )
insert into order_details values (5,'PP_Square_5X5' ,130,80)
insert into order_details values (6,'PP_Square_8x8',200,130 )
insert into order_details values (7,'SFP_Classic_12x10',1200,800)
insert into order_details values (8,'SFP_Large_20x17.5',1500,1000)
insert into order_details values (9,'BP_Classic_36x72',9900, 6000)
insert into order_details values (10,'BP_Large_48x72',14900, 10000)
insert into order_details values (11,'PA_Wedding_Classic',100000,50000 )
insert into order_details values (12,'PA_Wedding_Premium',230000,120000)
insert into order_details values (13,'PA_FamilyAlbum_1 (100 photos)',14900, 8000)
insert into order_details values (14,'PA_FamilyAlbum_2 (300 photos)',24900, 16000)
insert into order_details values (15,'TB&P_1 (100pgs)',900,450)
insert into order_details values (16,'TB&P_2 (300pgs)',1600, 900)


create table orders_oop(
orderno integer primary key,
odno integer,
cno integer,
emp_no integer,
description varchar(100),
price float,
total_price float,
status varchar(25),
order_date date,
date_started date,
date_ended date,
total_cost float
constraint t457 foreign key(odno) references order_details(odno),
constraint t454 foreign key(cno) references Customer_oop(cno),
constraint t45 foreign key(emp_no) references Employee_oop(emp_no),
constraint t346 check(status='On Hold' or status='Started' or status = 'Ready to Collect' ) )

select * from orders_oop

update Employee_oop
set salary=25000
where Position='Worker'

update Employee_oop
set salary=35000
where Position='Manager'