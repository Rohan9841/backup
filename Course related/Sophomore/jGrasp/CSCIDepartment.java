//Name: Rohan Maharjan                     Date Assigned: Fill in 
//                                         
//Course: CSCI 2003 60357                  Date Due: Fill in
//
//Instructor: Ms. Greer
//
//File name: Fill in
//
//Program Description: Brief description of what the program does. 

import java.util.Scanner;

public class CSCIDepartment
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      Student student1 = new Student();
      Student student2 = new Student("Tyler Greer",12345678);
      
      Course course2 = new Course("Intermediate Programming", "CSCI 2003",63972, 35, new Student[35]);
      Course course1 = new Course("Intoduction to programming","CSCI 2000",60536,35,new Student[35]);
      
      boolean check = false;
      
      System.out.println("Course Information Access");
      System.out.println("=========================\n");
      
      do
      {
      
         System.out.println("Options");
         System.out.println("=======\n");
         System.out.println("1. View Available Course Information");
         System.out.println("2. View Students Enrolled in Course");
         System.out.println("3. Add Student to a Course");
         System.out.println("4. View Total Enrollment for Deparment");
         System.out.println("5. Quit");
         
         System.out.print("\nEnter choice (1-5): ");
         int optionChoice = in.nextInt();
         
         System.out.println("\n---------------------------------------\n");
         
         if(optionChoice == 1)
         {
             
            System.out.println("Available Courses");
            System.out.println("=================\n");
            
            course1.displayCourseInfo();
            
            System.out.println("\n");
            
            course2.displayCourseInfo();
            
            System.out.println("\n---------------------------------------\n");

         }
         
         if(optionChoice == 2)
         {
            System.out.println("Course Display Options");
            System.out.println("======================");
            System.out.println("1. Introduction to Programming");
            System.out.println("2. Intermediate Programming\n");
            
            System.out.print("Enter choice (1 or 2): ");
            int courseChoice = in.nextInt();
            
            if (courseChoice == 1)
            {
               course1.displayStudents();
            }
            
            if (courseChoice == 2)
            {
               course2.displayStudents();
            }  
            
            System.out.println("\n----------------------------------------\n");    
         }  
         
         if(optionChoice == 3)
         {
            System.out.println("Course Options");
            System.out.println("======================");
            System.out.println("1. Introduction to Programming");
            System.out.println("2. Intermediate Programming\n");
            
            System.out.print("Enter choice (1 or 2): ");
            int courseChoice = in.nextInt();
            in.nextLine();
            
            System.out.println("\nAdd a student");
            System.out.println("=============\n");
            
            System.out.print("Enter Student's Name: ");
            String name = in.nextLine();
            
            System.out.print("Enter Student's ID: ");
            int id = in.nextInt();
            
            Student rohan = new Student(name, id);
            
            if(courseChoice == 1)
            {
               course1.addStudent(rohan);
            }
            
            if(courseChoice == 2)
            {
               course2.addStudent(rohan);
            }   
            
            System.out.println("\n-------------------------------------\n");
    
         }    
         
         if (optionChoice == 4)
         {
            System.out.println("Total Students Enrolled: "+ course1.getTotalEnrollment()+"\n");
            System.out.println("--------------------------------------\n");
         }  
         
         if (optionChoice == 5)
         {
            check = true;
         }    
            
      }while(!check);    
      
      System.out.print("Goodbye!");  
   }
}   