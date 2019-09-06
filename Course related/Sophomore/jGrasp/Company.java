/*
Name: Rohan Maharjan

Course: CSCI 2003 42733

Instructor: Ms.Greer

File name: Employee.java

Program Description: This is a driver class which creates three objects of Employee
                     class, two with argument constructor and one with non-argument
                     constructor. It then displays the information of employees in a
                     table form.

Date Assigned: Jan 24,2017

Date Due: Jan 31,2017      
*/


public class Company //Defing class
{
   public static void main(String[] args) //Defining main method
   {
      //Creating objects with argument constructor. 
         
      Employee obj3 = new Employee("Susan Meyers",47899,"Accounting","Vice President");
      
      Employee obj4 = new Employee("Mark Jones",39119,"IT","Programmer");
      
      //Creating an object with no-argument constructor
      
      Employee obj5 = new Employee();
      
      //Using set method to set the values of the instance variables.
      
      obj5.setName("Joy Rogers");
      obj5.setId(81774);
      obj5.setDepartment("Manufacturing");
      obj5.setPosition("Engineer");
      
      //Displaying the information of employees using format.
      
      System.out.printf("%4s %23s %20s %20s","Name","ID Number","Department","Position\n");
      System.out.print("--------------------------------------------------------------------------\n");
      System.out.printf("%12s %11d %24s %25s",obj3.getName(),obj3.getId(),obj3.getDepartment(),obj3.getPosition());
      System.out.printf("\n%10s %13d %16s %29s",obj4.getName(),obj4.getId(),obj4.getDepartment(),obj4.getPosition());  
      System.out.printf("\n%10s %13d %27s %16s",obj5.getName(),obj5.getId(),obj5.getDepartment(),obj5.getPosition());    

            
           
   }
}   
      
      