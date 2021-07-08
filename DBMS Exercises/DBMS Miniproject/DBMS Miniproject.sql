-- ------------------------------- DMBS Mini Project --------------------------
-- ------------------------ Car Rental Service Management ---------------------
-- ---------------------------- Presented By : Team 14 ------------------------
-- ----------------------------------------------------------------------------
-- - MEMBERS : AMBERKHANE SHREYASH & KULKARNI SHREYAS -------------------------
-- ----------------------------------------------------------------------------

create schema `dbms_miniproject`;
use dbms_miniproject;

-- ----------------------------------------------------------------------------
-- Creating Table Structures
-- ----------------------------------------------------------------------------

create table `staff` (
  `staff_id` varchar(15) not null,
  `staff_name` varchar(255) not null,
  `sal` int(15) not null,
  `hiredate` date,
  `contact_no` bigint unique,
  primary key (`staff_id`)
);

create table `cars` (
  `car_id` int(11) not null auto_increment,
  `car_name` varchar(255) not null,
  `car_type` varchar(255) not null,
  `hire_cost` int(11) not null,
  `capacity` int(11) not null,
  `status` varchar(255) not null,
  primary key (`car_id`)
  );
  
  create table `client` (
  `client_id` int(11) not null auto_increment,
  `fname` varchar(255) not null,
  `email` varchar(255) not null,
  `id_no` varchar(255) not null unique,
  `phone` bigint not null,
  `location` varchar(255) not null,
  `gender` varchar(255) not null,
  `car_id` int(11) not null,
  `status` varchar(255) not null,
  `upi_id` varchar(255) not null unique,
  primary key (`client_id`),
  foreign key (car_id) references cars (car_id)
);
  
  create table `hire` (
  `hire_id` int(11) not null auto_increment,
  `client_id` int(11) not null,
  `car_id` int(11) not null,
  `status` varchar(255) not null,
  primary key (`hire_id`),
  foreign key (car_id) references cars (car_id),
  foreign key (client_id) references client (client_id)
);

create table `feedback` (
  `msg_id` int(11) not null auto_increment,
  `client_id` int(11) not null,
  `message` varchar(255) not null,
  `date` date not null,
  primary key (`msg_id`),
  foreign key (client_id) references client (client_id)
);

use dbms_miniproject;
select * from staff;
select * from cars;
select * from client;
select * from feedback;
select * from hire;

-- ---------------------------------------------------------------------------------
-- Adding Data for tables
-- ---------------------------------------------------------------------------------

insert into `staff` (`staff_id`, `staff_name`, `sal`, `hiredate`, `contact_no`) values
('S01', 'Tony Stark', 25000, '2015-05-21', 9812345678),
('S02', 'Steve Rogers', 23000, '2016-01-31',9913243647),
('S03', 'Clint Barton', 20000, '2016-08-14', 9018273645),
('S04', 'Bruce Banner', 20000, '2017-01-19', 8432153676),
('S05', 'Natasha Rommanoff', 18000, '2017-09-29', 8123465772),
('S06', 'Thor Odinson', 17000, '2018-06-21', 8332882191);

insert into `cars` (`car_id`, `car_name`, `car_type`, `hire_cost`, `capacity`, `status`) values
(5001, 'Mercedes Benz', 'C-Class', 50000, 4, 'Available'),
(null, 'Range Rover', 'Land Rover', 25000, 6, 'Available'),
(null, 'TATA', 'Harrier', 10000, 5, 'Available'),
(null, 'Toyota', 'Venza', 10000, 5, 'Available'),
(null, 'Hyundai', 'Elantra', 15000, 4, 'Available'),
(null, 'Jeep', 'Wrangler', 30000, 4, 'Available');

truncate client;
insert into `client` (`fname`, `email`, `id_no`, `phone`, `location`, `gender`, `car_id`, `status`, `upi_id`) values
('Rachel Green', 'rachelg@gmail.com', 32595137, 9874660142, 'Pune', 'Female', 5003, 'Approved', '9874660142@ybl.com'),
('Ross Geller', 'geller123ross@yahoo.com', 30073147, 9705053484, 'Mumbai', 'Male', 5001, 'Approved', '9705053484@ybl.com'),
('Phoebe Buffay', 'phoebe_cat@gmail.com', 27695131, 7807403614, 'Nashik', 'Female', 5002, 'Approved', '7807403614@sbi.com'),
('Chandler Bing', 'chanandler551@gmail.com', 87645213, 7117056766, 'Pune', 'Male', 5005, 'Pending', '7117056766@bhim.com'),
('Monica Geller', 'monicacook@gmail.com', 75432612, 9784526641, 'Mumbai', 'Female', 5003, 'Approved', '9784526641@bhim.com'),
('Joey Tribbiani', 'tribbianij11@outlook.com', 54863019, 9130564477, 'Pune', 'Male', 5005, 'Approved', '9130564477@ybl.com'),
('Loki Lauffeyson', 'godofmischief@gmail.com', 89733211, 9121314151, 'Asgard', 'Male',  5004, 'Pending', '9121314151@bhim.com'),
('Wade Wilson', 'deadpool_111@yahoo.com', 21314576, 8928717719, 'Aurangabad', 'Male', 5003, 'Pending', '8928717719@ybl.com'),
('Shivaji Rao Gaekwad', 'thalaiva_1@rajnikanth.com', 11111111, 9191911919, 'Mumbai','Male', 5001, 'Approved', '9191911919@icici.com'),
('Shrikant Sonawane', 'devmanus@cdac.com', 32165487, 9018273645, 'Nagar', 'Male', 5006, 'Approved', '9018273645@idbi.com');


insert into `hire` (`hire_id`, `client_id`, `car_id`, `status`) values 
(100, 1,	5003,	'Approved'),
(null, 2,	5001,	'Approved'),
(null, 3,	5002,	'Approved'),
(null, 4,	5005,	'Pending'),
(null, 5,	5003,	'Approved'),
(null, 6,	5005,	'Approved'),
(null, 7,	5004,	'Pending'),
(null, 8,	5003,	'Pending'),
(null, 9,	5001,	'Approved'),
(null, 10,	5006,	'Approved');
		
insert into `feedback` (`msg_id`, `client_id`, `message`, `date`) values
(1001, 2, 'Great Service Provided...!!!', '2021-03-21'),
(null, 3, 'Thanks for Providing Cars on Urgent basis', '2021-04-01'),
(null, 1, 'I love this.Car worked the way i want.', '2021-01-21');

-- --------------------------------------------------------------------------------------
-- QUERIES
-- --------------------------------------------------------------------------------------

/*Show Staff name with their phone number arrange alphabetically*/
select staff_name, contact_no from staff order by 1;

/*Show minimum salary from all staff*/
select min(sal) from staff;

/*Show average salary from all staff*/
select avg(sal) from staff;

/*Update salary of employee who has staff id as S03 by 2000*/
update staff
set sal = 22000
where staff_id = 'S03';

/*Display client name who have their status as pending*/
select fname, status from  client where status = 'Pending';

/*Display client name according to their locations*/
select fname, location from client order by location;

/*Fetch the no. of cars grouping them by seating capacity in the descending order.*/
select capacity, count(capacity) from cars group by capacity order by capacity desc;

/*Display Client name along with client id, hire id, car name of all clients*/
select client.client_id, fname, hire_id, cars.car_id, car_name from client, hire, cars 
where client.car_id = cars.car_id and hire.client_id = client.client_id;

/*Display feedback as per client, client name, msg id, client id and arrange in increasing order.*/
select client.client_id, fname, msg_id, message from feedback, client 
where feedback.client_id = client.client_id order by 1;

/*Show staff name who earns minimum salary of all*/
select staff_name,sal from staff where sal like (select min(sal) from staff);

-- -------------------------------------------------------------------------------------------------
-- STORED FUNCTION
-- -------------------------------------------------------------------------------------------------

/* Write a stored function by the name of Days_diff. The stored function should accept ‘Current date’ and ‘Hire date’ as date parameters. The stored function should return the number of days between the two dates. Calling program for the stored function need not be written. */

delimiter //
create function Days_diff(Cuurent_date date, Hire_date date)
returns int
deterministic
begin
return datediff(Cuurent_date, Hire_date);
end; //
delimiter ;

set @Days = Days_diff(sysdate(), '2015-05-21');
select @Days from dual;

drop function days_diff;

-- --------------------------------------------------------------------------------------------------
-- STORED PROCEDURE
-- --------------------------------------------------------------------------------------------------

/* Write a stored procedure to show diwali discount of 10% on hire price, take price as input from user and display discounted price in tempp table. */

create table tempp
(
  price int,
  dis_amt float,
  dis_price float
);


delimiter //
create procedure discount(price int)
begin
     declare dis float default 0.1;
     declare dis_price float;
     declare dis_amt float;
     set dis_price = dis * price;
     set dis_amt = price - dis_price;
     insert into tempp values (price, dis_amt, dis_price);
 end; //
 delimiter ;
 
 call discount(50000);
 select * from tempp;
 

 truncate tempp;
 drop procedure discount;
 drop table tempp;
 