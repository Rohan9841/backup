CREATE TABLE STUDENT 
(
    Name VARCHAR(40) NOT NULL,
    Student_number INTEGER NOT NULL,
    Class CHAR NOT NULL,
    Major CHAR(5),
    PRIMARY KEY (Student_number)
);

CREATE TABLE COURSE 
(
    Course_name VARCHAR(50) NOT NULL UNIQUE,
    Course_number CHAR(10) NOT NULL,
    Credit_hours INTEGER,
    Department CHAR(6),
    PRIMARY KEY (Course_number)
);

CREATE TABLE PREREQUISITE 
( 
    Course_number CHAR(10) NOT NULL,
    Prerequisite_number CHAR(10) NOT NULL,
    PRIMARY KEY (Course_number, Prerequisite_number),
    FOREIGN KEY (Course_number) REFERENCES COURSE (Course_number),
    FOREIGN KEY (Prerequisite_number) REFERENCES COURSE (Course_number)
);

CREATE TABLE SECTION 
(
    Section_identifier INTEGER NOT NULL,
    Course_number CHAR(10) NOT NULL,
    Semester VARCHAR(6) NOT NULL,
    Year CHAR(4) NOT NULL,
    Instructor VARCHAR(15),
    PRIMARY KEY (Section_identifier),
    FOREIGN KEY (Course_number) REFERENCES COURSE (Course_number)
 );

CREATE TABLE GRADE_REPORT 
(
    Student_number INTEGER NOT NULL,
    Section_identifier INTEGER NOT NULL,
    Grade CHAR,
    PRIMARY KEY (Student_number, Section_identifier),
    FOREIGN KEY (Student_number) REFERENCES STUDENT (Student_number),
    FOREIGN KEY (Section_identifier) REFERENCES SECTION (Section_identifier)
);
