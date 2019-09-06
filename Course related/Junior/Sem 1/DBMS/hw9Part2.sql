SELECT Name
FROM STUDENT, SECTION
WHERE Major = 'CS' AND Class = 4;

SELECT Course_name 
FROM COURSE, SECTION
WHERE Instructor = 'King' AND 
COURSE.Course_number = SECTION.Course_number AND 
(Year = '07' OR Year = '08');

SELECT Course_number, Semester, Year, COUNT(GRADE_REPORT.Student_number)
FROM SECTION,GRADE_REPORT
WHERE Instructor = 'King' AND 
SECTION.Section_identifier = GRADE_REPORT.Section_identifier;


SELECT Name, Course_name, COURSE.Course_number, Credit_hours, Semester, Year, Grade
FROM STUDENT, COURSE, SECTION, GRADE_REPORT
WHERE Class = 4 AND Major = 'CS' AND 
STUDENT.Student_number = GRADE_REPORT.Student_number AND
SECTION.Section_identifier = GRADE_REPORT.Section_identifier AND
SECTION.Course_number = COURSE.Course_number;
