SELECT Fname, Minit, Lname
FROM EMPLOYEE, WORKS_ON, PROJECT
WHERE Dno = 5 AND Essn = Ssn AND Hours > 10.0 AND Pname = 'ProductX' AND Pnumber = Pno;

SELECT Fname, Minit, Lname 
FROM EMPLOYEE, DEPENDENT
WHERE Essn = Ssn AND Fname = Dependent_name;

SELECT E.Fname, E.Minit, E.Lname
FROM EMPLOYEE AS E, EMPLOYEE AS S
WHERE S.Fname = 'Franklin' AND S.Lname = 'Wong' AND E.Super_ssn = S.Ssn;