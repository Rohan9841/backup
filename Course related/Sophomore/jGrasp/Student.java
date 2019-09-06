//Name: Rohan Maharjan                     Date Assigned: Fill in 
//                                         
//Course: CSCI 2003 60357                  Date Due: Fill in
//
//Instructor: Ms. Greer
//
//File name: Fill in
//
//Program Description: This is a student class that represents a student. It has both argument and 
//                     non argument constructor. Setters and getters are also used to set and get the
//                     required data.

//declaring class

public class Student
{
   //declaring instance variables
   
   private String nameOfStudent;
   private int studentId;
   
   //creating a non-argument constructor
   
   public Student()
   {
      nameOfStudent = null;
      studentId = 0;
   }   
   
   //creating an argument constructor
   
   public Student(String name, int id)
   {
      nameOfStudent = name;
      studentId = id;
   }
   
   //using set method to set the name of student
   
   public void setStudentName(String name)
   {
      nameOfStudent = name;
   }
   
   //using set method to set an id of student
   
   public void setStudentId(String id)
   {
      nameOfStudent = id;
   }
   
   //using get method to get the name of student
   
   public String getStudentName()
   {
      return(nameOfStudent);
   }
   
   //using get method to get an id of student
   
   public int getStudentId()
   {
      return(studentId);
   }
}                  