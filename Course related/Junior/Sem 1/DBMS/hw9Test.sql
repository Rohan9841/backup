create database COMPANY;
USE COMPANY;
CREATE TABLE EMPLOYEE
(
   Fname	varchar(15)	NOT NULL,
   Minit	char,
   Lname	varchar(15)	NOT NULL,
   Ssn		char(9)		NOT NULL,
   Bdate	date,
   Address	varchar(30),
   Sex		char,
   Salary	decimal(10,2),
   Super_ssn	char(9),
   Dno		int,

   PRIMARY KEY(Ssn) 
);

CREATE TABLE DEPARTMENT
(
   Dname	varchar(15)	NOT NULL,
   Dnumber	int		NOT NULL,
   Mgr_ssn	char(9)		NOT NULL,
   Mgr_start_date		Date,

   PRIMARY KEY(Dnumber)
);

CREATE TABLE DEPT_LOCATIONS
(
   Dnumber	int		NOT NULL,
   Dlocation	varchar(15)	NOT NULL,

   PRIMARY KEY(Dnumber, Dlocation)
);

CREATE TABLE PROJECT
(
   Pname	varchar(15)	NOT NULL,
   Pnumber	int		NOT NULL,
   Plocation	varchar(15),
   Dnum		int		NOT NULL,

   PRIMARY KEY(Pnumber),
   UNIQUE (Pname)
);

CREATE TABLE WORKS_ON
(
   Essn		char(9)		NOT NULL,
   Pno		int		NOT NULL,
   Hours	decimal(3,1),

   PRIMARY KEY(Essn, Pno)
);

CREATE TABLE DEPENDENT
(
   Essn		char(9)		NOT NULL,
   Dependent_name   varchar(15) NOT NULL,
   Sex	        char,
   Bdate        date,
   Relationship varchar(8), 
	
   PRIMARY KEY(Essn, Dependent_name)
);
insert into EMPLOYEE(Fname, Minit, Lname, Ssn, Bdate, Address, Sex, Salary, Super_ssn, Dno)
values ('John', 'B', 'Smith', '123456789', '1965-01-09','731 Fondern, Houston, TX', 'M', 30000, '333445555', 5);
insert into EMPLOYEE(Fname, Minit, Lname, Ssn, Bdate, Address, Sex, Salary, Super_ssn, Dno)
values ('Franklin', 'T', 'Wong', '333445555', '1955-12-08','638 Voss, Houston, TX', 'M', 40000, '888665555', 5);
insert into EMPLOYEE(Fname, Minit, Lname, Ssn, Bdate, Address, Sex, Salary, Super_ssn, Dno)
values ('Alicia', 'J', 'Zelaya', '999887777', '1968-07-19','3321 Castle, Spring, TX', 'F', 25000, '987654321', 4);
insert into EMPLOYEE(Fname, Minit, Lname, Ssn, Bdate, Address, Sex, Salary, Super_ssn, Dno)
values ('Jennifer', 'S', 'Wallace', '987654321', '1941-06-20','291 Berry, Bellaire, TX', 'F', 43000, '888665555', 4);
insert into EMPLOYEE(Fname, Minit, Lname, Ssn, Bdate, Address, Sex, Salary, Super_ssn, Dno)
values ('Ramesh', 'K', 'Narayan', '666884444', '1962-09-15','975 Fire Oak, Humble, TX', 'M', 38000, '333445555', 5);
insert into EMPLOYEE(Fname, Minit, Lname, Ssn, Bdate, Address, Sex, Salary, Super_ssn, Dno)
values ('Joyce', 'A', 'English', '453453453', '1972-07-31','5631 Rice, Houston, TX', 'F', 25000, '333445555', 5);
insert into EMPLOYEE(Fname, Minit, Lname, Ssn, Bdate, Address, Sex, Salary, Super_ssn, Dno)
values ('Ahmad', 'V', 'Jabbar', '987987987', '1969-03-29','980 Dallas, Houston, TX', 'M', 25000, '987654321', 4);
insert into EMPLOYEE(Fname, Minit, Lname, Ssn, Bdate, Address, Sex, Salary, Super_ssn, Dno)
values ('James', 'E', 'Borg', '888665555', '1937-11-10','450 Stone, Houston, TX', 'M', 55000, null, 1);
insert into DEPARTMENT(Dname, Dnumber, Mgr_ssn, Mgr_start_date)
values ('Research', 5, '333445555', '1988-05-22');
insert into DEPARTMENT(Dname, Dnumber, Mgr_ssn, Mgr_start_date)
values ('Administration', 4, '987654321', '1995-01-01');
insert into DEPARTMENT(Dname, Dnumber, Mgr_ssn, Mgr_start_date)
values ('Headquarters', 1, '888665555', '1981-06-19');
insert into DEPT_LOCATIONS(Dnumber, Dlocation)
values (1, 'Houston');
insert into DEPT_LOCATIONS(Dnumber, Dlocation)
values (4, 'Stafford');
insert into DEPT_LOCATIONS(Dnumber, Dlocation)
values (5, 'Bellaire');
insert into DEPT_LOCATIONS(Dnumber, Dlocation)
values (5, 'Sugarland');
insert into DEPT_LOCATIONS(Dnumber, Dlocation)
values (5, 'Houston');
insert into PROJECT(Pname, Pnumber, Plocation, Dnum)
values ('ProductX', 1, 'Bellaire', 5);
insert into PROJECT(Pname, Pnumber, Plocation, Dnum)
values ('ProductY', 2, 'Sugarland', 5);
insert into PROJECT(Pname, Pnumber, Plocation, Dnum)
values ('ProductZ', 3, 'Houston', 5);
insert into PROJECT(Pname, Pnumber, Plocation, Dnum)
values ('Computerization', 10, 'Stafford', 4);
insert into PROJECT(Pname, Pnumber, Plocation, Dnum)
values ('Reorganization', 20, 'Houston', 1);
insert into PROJECT(Pname, Pnumber, Plocation, Dnum)
values ('Newbenefits', 30, 'Stafford', 4);
insert into WORKS_ON(Essn, Pno, Hours)
values ('123456789', 1, 32.5);
insert into WORKS_ON(Essn, Pno, Hours)
values ('123456789', 2, 7.5);
insert into WORKS_ON(Essn, Pno, Hours)
values ('666884444', 3, 40.0);
insert into WORKS_ON(Essn, Pno, Hours)
values ('453453453', 1, 20.0);
insert into WORKS_ON(Essn, Pno, Hours)
values ('453453453', 2, 20.0);
insert into WORKS_ON(Essn, Pno, Hours)
values ('333445555', 2, 10.0);
insert into WORKS_ON(Essn, Pno, Hours)
values ('333445555', 3, 10.0);
insert into WORKS_ON(Essn, Pno, Hours)
values ('333445555', 10, 10.0);
insert into WORKS_ON(Essn, Pno, Hours)
values ('333445555', 20, 10.0);
insert into WORKS_ON(Essn, Pno, Hours)
values ('999887777', 30, 30.0);
insert into WORKS_ON(Essn, Pno, Hours)
values ('999887777', 10, 10.0);
insert into WORKS_ON(Essn, Pno, Hours)
values ('987987987', 10, 35.0);
insert into WORKS_ON(Essn, Pno, Hours)
values ('987987987', 30, 5.0);
insert into WORKS_ON(Essn, Pno, Hours)
values ('987654321', 30, 20.0);
insert into WORKS_ON(Essn, Pno, Hours)
values ('987654321', 20, 15.0);
insert into WORKS_ON(Essn, Pno, Hours)
values ('888665555', 20, null);
insert into DEPENDENT(Essn, Dependent_name, Sex, Bdate, Relationship)
values ('333445555', 'Alice', 'F', '1986-04-05', 'Daughter');
insert into DEPENDENT(Essn, Dependent_name, Sex, Bdate, Relationship)
values ('333445555', 'Theodore', 'M', '1983-10-25', 'Son');
insert into DEPENDENT(Essn, Dependent_name, Sex, Bdate, Relationship)
values ('333445555', 'Joy', 'F', '1958-05-03', 'Spouse');
insert into DEPENDENT(Essn, Dependent_name, Sex, Bdate, Relationship)
values ('987654321', 'Abner', 'M', '1942-02-28', 'Spouse');
insert into DEPENDENT(Essn, Dependent_name, Sex, Bdate, Relationship)
values ('123456789', 'Michael', 'M', '1988-01-04', 'Son');
insert into DEPENDENT(Essn, Dependent_name, Sex, Bdate, Relationship)
values ('123456789', 'Alice', 'F', '1988-12-30', 'Daughter');
insert into DEPENDENT(Essn, Dependent_name, Sex, Bdate, Relationship)
values ('123456789', 'Elizabeth', 'F', '1967-05-05', 'Spouse');
ALTER TABLE EMPLOYEE ADD CONSTRAINT fk_supervisor
      FOREIGN KEY (Super_ssn) REFERENCES EMPLOYEE(Ssn);
ALTER TABLE EMPLOYEE ADD CONSTRAINT fk_department
      FOREIGN KEY (Dno) REFERENCES DEPARTMENT(Dnumber);
ALTER TABLE DEPARTMENT ADD CONSTRAINT fk_manager
      FOREIGN KEY (Mgr_ssn) REFERENCES EMPLOYEE(Ssn);
ALTER TABLE DEPT_LOCATIONS ADD CONSTRAINT fk_loc_department
      FOREIGN KEY (Dnumber) REFERENCES DEPARTMENT(Dnumber);
ALTER TABLE PROJECT ADD CONSTRAINT fk_control_department
      FOREIGN KEY (Dnum) REFERENCES DEPARTMENT(Dnumber);
ALTER TABLE WORKS_ON ADD CONSTRAINT fk_work_employee
      FOREIGN KEY (Essn) REFERENCES Employee(Ssn);
ALTER TABLE WORKS_ON ADD CONSTRAINT fk_work_project
      FOREIGN KEY (Pno) REFERENCES Project(Pnumber);
ALTER TABLE DEPENDENT ADD CONSTRAINT fk_depend_employee
      FOREIGN KEY (Essn) REFERENCES Employee(Ssn);