/*
Name: Rohan Maharjan

Course: CSCI 2003 42733

Instructor: Ms.Greer

File name: Employee.java

Program Description: This is an Employee Class that has instance variables, 
                     constructors(with and without arguments)to initialize
                     instance variables. We also use getter and setter methods.

Date Assigned: Jan 24,2017

Date Due: Jan 31,2017      
*/

public class Employee  //Defining class
{
   //Setting instance variables
   
   private String name;
   private int idNumber;
   private String department;
   private String position;
   
   //Defining constructor with no arguments
   
   public Employee()
   {
      name = "";
      idNumber = 0;
      department = "";
      position = "";
   }
   
   //Defining constructor with arguments
   
   public Employee(String n, int id, String dep, String pos)
   {
      name = n;
      idNumber = id;
      department = dep;
      position = pos;
   }
   
   public void setName(String n) //Defining setName method
   {
      name = n;
   }
   
   public void setId(int id) //Defining setId method
   {
      idNumber = id;
   }
   
   public void setDepartment(String dep)//Defining setDepartment method
   {
      department = dep;
   }
   
   public void setPosition(String pos)//Defining setPosition method
   {
      position = pos;
   }
   
   public String getName()//Defining getName method
   {
      return name;
   }
   
   public int getId()//Defining getId method
   {
      return idNumber;
   }
   
   public String getDepartment()//Defining getDepartment method
   {
      return department;
   }
   
   public String getPosition()//Defining getPosition method
   {
      return position;
   }
   
}                           