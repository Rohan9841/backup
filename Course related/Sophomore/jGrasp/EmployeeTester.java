/*
Name: Rohan Maharjan

Course: CSCI 2003 42733

Instructor: Ms.Greer

File name: Employee.java

Program Description: This is a driver class which creates two objects of Employee
                     class, one with argument constructor and the other with non-
                     argument constructor. It then displays the values called by
                     get method.

Date Assigned: Jan 24,2017

Date Due: Jan 31,2017      
*/


public class EmployeeTester //Defining class
{
   public static void main(String[] args) //Defining main method
   {
      
      //Creating an object with argument constructor
      
      Employee obj1 = new Employee("Tyler Greer",12345,"Computer Science","Instructor");
      
      //displaying certain texts
      System.out.println("TESTING ARGUMENT CONSTRUCTOR");
      System.out.println("----------------------------\n");
      
      //Calling get method to get the value from argument of 'obj1' and displaying it.
      
      System.out.println(obj1.getName());
      System.out.println("Expected: Tyler Greer\n");
      
      //Calling get method to get the value from argument of 'obj1' and displaying it.
      
      System.out.println(obj1.getId());
      System.out.println("Expected: 12345\n");
      
      //Calling get method to get the value from argument of 'obj1' and displaying it.
      
      System.out.println(obj1.getDepartment());
      System.out.println("Expected: Computer Science\n");
      
      //Calling get method to get the value from argument of 'obj1' and displaying it.
      
      System.out.println(obj1.getPosition());
      System.out.println("Expected: Instructor\n");
      
      //Creating an object with no-argument constructor.
      
      Employee obj2 = new Employee();
      
      //Displaying certain texts.
      
      System.out.println("TESTING NO-ARGUMENT CONSTRUCTOR");
      System.out.println("-------------------------------\n");
      
      //Using set method to set the values of instance variables    
      
      obj2.setName("Desiree Wilson");
      obj2.setId(45678);
      obj2.setDepartment("Orthopaedics");
      obj2.setPosition("Registered Nurse");
      
      //Calling get method to get the value set for name by setter, and displaying it.
      
      System.out.println(obj2.getName());
      System.out.println("Expected: Desiree Wilson\n");
      
      //Calling get method to get the value set for idNumber by setter, and displaying it.
      
      System.out.println(obj2.getId());
      System.out.println("Expected: 45678\n");
      
      //Calling get method to get the value set for department by setter, and displaying it.
      
      System.out.println(obj2.getDepartment());
      System.out.println("Expected: Orthopaedics\n");
      
      //Calling get method to get the value set for position by setter, and displaying it.
      
      System.out.println(obj2.getPosition());
      System.out.println("Expected: Registered Nurse");
      
   } 
   
}     