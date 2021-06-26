/*SQL EXERCISE 1*/

create schema 'assignment_1';
use assignment_1;

/*1. Create the table SEMP with the following structure:-
EMPNO CHAR(4)
EMPNAME CHAR(20)
BASIC FLOAT(9,2)
DEPTNO CHAR(2)
DEPTHEAD CHAR(4)*/
CREATE TABLE `semp` (
  `empno` char(4) NOT NULL,
  `empname` char(20) DEFAULT NULL,
  `basic` float(9,2) DEFAULT NULL,
  `deptno` char(2) DEFAULT NULL,
  `depthead` char(4) DEFAULT NULL,
  PRIMARY KEY (`empno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*2. Create the table SDEPT with the following structure:-
DEPTNO CHAR(2)
DEPTNAME CHAR(15)*/
CREATE TABLE `sdept` (
  `deptno` char(2) NOT NULL,
  `deptname` char(15) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*3. Insert into the SDEPT table the following values:-
10, Development
20, Training*/
insert into sdept values ('10','Development'),('20','Training');
select * from sdept;

/*4. Insert into the SEMP table the following values:-
0001, SUNIL, 6000, 10
0002, HIREN, 8000, 20
0003, ALI, 4000, 10, 0001
0004, GEORGE, 6000, 0002*/
insert into semp
values ('0001','Sunil',6000,'10',null),
('0002', 'Hiren', 8000, '20', null),
('0003', 'Ali',4000, '10', '0001'),
('0004','George',6000,null,'0002');
select * from semp;

/*Create S, P, J, SPJ tables as specified below and insert a few rows in each table:-
SUPPLIER
(S#, Sname, Status, City)
-
S
PARTS
(P#, Pname, Color, Weight, City)
-
P
PROJECTS
(J#, Jname, City)
-
J
SUPPLIER-PARTS-PROJECT
(S#, P#, J#, Qty)
-
SPJ
Sample data for S# column:- ‘S1’, ‘S2’, ‘S3’, etc.
Sample data for P# column:- ‘P1’, ‘P2’, ‘P3’, etc.
Sample data for J# column:- ‘J1’, ‘J2’, ‘J3’, etc.
Sample data for Status column:- 10, 20, 30, etc.*/
CREATE TABLE `s` (
  `S` varchar(45) NOT NULL,
  `Sname` varchar(45) DEFAULT NULL,
  `Status` int DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`S`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Supplier';

CREATE TABLE `p` (
  `P` varchar(45) NOT NULL,
  `Pname` varchar(45) DEFAULT NULL,
  `Color` varchar(45) DEFAULT NULL,
  `Weight` varchar(45) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`P`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Parts';

CREATE TABLE `j` (
  `J` varchar(45) NOT NULL,
  `Jname` varchar(45) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`J`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Projects';

CREATE TABLE `spj` (
  `S` varchar(45) DEFAULT NULL,
  `P` varchar(45) DEFAULT NULL,
  `J` varchar(45) DEFAULT NULL,
  `Qty` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Supplier-Parts-Projects';

insert into s (s, sname, status, city) 
value ('S1', 'Smith', '20', 'London'),
('S2', 'Jones', '10', 'Paris'),
('S3', 'Blake', '30', 'Paris'),
('S4', 'Clark', '20', 'London'),
('S5', 'Adams', '30', 'Athens');

/*5. Display all the data from the S table.*/
select * from s;

insert into p (p, pname, color, weight, city)
values ('P1', 'Nut', 'Red', '12', 'London'),
('P2', 'Bolt', 'Green', '17', 'Paris'),
('P3', 'Screw', 'Blue', '17', 'Rome'),
('P4', 'Screw', 'Red', '14', 'London'),
('P5', 'Cam', 'Blue', '12', 'Paris'),
('P6', 'Cog', 'Red', '19', 'London');
select * from p;

insert into j (j, jname, city)
values ('J1', 'Sorter', 'Paris'),
('J2', 'Punch', 'Rome'),
('J3', 'Reader', 'Athens'),
('J4', 'Console', 'Athens'),
('J5', 'Collator', 'London'),
('J6', 'Terminal', 'Oslo'),
('J7', 'Tape', 'London');
select * from j;

insert into spj (s, p, j, qty)
values ('S1', 'P1', 'J1', '200'),
('S1', 'P1', 'J4', '700'),
('S2', 'P3', 'J1', '400'),
('S2', 'P3', 'J2', '200'),
('S2', 'P3', 'J3', '200'),
('S2', 'P3', 'J4', '500'),
('S2', 'P3', 'J5', '600'),
('S2', 'P3', 'J6', '400'),
('S2', 'P3', 'J7', '800'),
('S3', 'P5', 'J2', '100'),
('S3', 'P3', 'J1', '200'),
('S3', 'P4', 'J2', '500'),
('S4', 'P6', 'J3', '300'),
('S4', 'P6', 'J7', '300'),
('S5', 'P2', 'J2', '200'),
('S5', 'P2', 'J4', '100'),
('S5', 'P5', 'J5', '500'),
('S5', 'P5', 'J7', '100'),
('S5', 'P6', 'J2', '200'),
('S5', 'P1', 'J4', '100'),
('S5', 'P3', 'J4', '200'),
('S5', 'P4', 'J4', '800'),
('S5', 'P5', 'J4', '400'),
('S5', 'P6', 'J4', '500');
select * from spj;

/*6. Display only the S# and SNAME fields from the S table.*/
select s, sname from s;

/*7. Display the PNAME and COLOR from the P table for the CITY=”London”.*/
select pname, color,city from p where city = 'London';

/*8. Display all the Suppliers from London.*/
select sname,city from s where city = 'London';

/*9. Display all the Suppliers from Paris or Athens.*/
select sname, city from s where city = 'Paris' or city = 'Athens';

/*10. Display all the Projects in Athens.*/
select jname,city from j where city = 'Athens';

/*11. Display all the Partnames with the weight between 12 and 14 (inclusive of both).*/
select pname, weight from p where weight >='12' and weight<='14';

/*12. Display all the Suppliers with a Status greater than or equal to 20.*/
select sname, status from s where status >=20;

/*13. Display all the Suppliers except the Suppliers from London.*/
select sname, city from s where city !='London';

/*14. Display only the Cities from where the Suppliers come from.*/
select sname,city from s;

/*15. Assuming that the Part Weight is in GRAMS, display the same in MILLIGRAMS and KILOGRAMS.*/
select weight'grams', weight*1000'mili', weight/1000'kilo' from p;