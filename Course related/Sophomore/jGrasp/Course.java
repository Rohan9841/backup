//Name: Rohan Maharjan                     Date Assigned: Fill in 
//                                         
//Course: CSCI 2003 60357                  Date Due: Fill in
//
//Instructor: Ms. Greer
//
//File name: Fill in
//
//Program Description: This is a course class that has an argument and non argument constructor. It uses setters and getters to display major 
//                     course contents like the course name, course code, section number, seats available and the total students enrolled in 
//                     a class.

//declaring class name

public class Course
{
   //declaring instance variables
   
   private String name;
   private String code;
   private int sectionNum;
   private int availableSeats;
   private Student[] array;
   
   //declaring static variable
   
   private static int totalEnrollment=0;
   
   //creating a non-argument constructor
   
   public Course()
   {
      name = null;
      code = null;
      sectionNum = 0;
      availableSeats = 0;
      array = new Student[50];
   }   
   
   //creating an argument constructor
   
   public Course(String n, String c, int s,int a, Student[] ar)
   {
      name = n;
      code = c;
      sectionNum = s;
      availableSeats = a;
      array = ar;
   }   
   
   //using set method to set the name of course
   
   public void setCourseName(String n)
   {
      name = n;
   }
   
   //using set method to set the course code
   
   public void setCourseCode(String c)
   {
      code = c;
   }
   
   //using set method to set the section number
   
   public void setSectionNum(int s)
   {
      sectionNum = s;
   }
   
   //using set method to set the number of seats available
   
   public void setAvailableSeats(int a)
   {
      availableSeats = a;
   }
   
   //using set method to set the number of students
   
   public void setArray(Student[] ar)
   {
      array = ar;
   }  
   
   //using addStudent method to add a student and calculate available seats and 
   //total students enrolled
   
   public void addStudent(Student s)
   {
      if (availableSeats <=0)
      {
         System.out.print("\nClass is full");
      }
   
      
      for (int i = 0; i <= array.length; i++){ //using for loop to fill the value in the array
         if (array[i] == null)
         {
            array[i] = s;
            break;
         }
      }
      
      availableSeats-=1; 
      totalEnrollment+=1;
      
   } 
   
   //using displayCourseInfo method to display the course contents
   
   public void displayCourseInfo()
   {
      System.out.println("Name: "+name);
      System.out.println("Course: "+code);
      System.out.println("Section: "+sectionNum);
      System.out.println("Seats: "+availableSeats);
   }     
   
   //using displayStudents method to display the students enrolled in a certain class
   
   public void displayStudents()
   {
      boolean flag = false;
      System.out.println("\n"+code + " - " + sectionNum + " : " + name);
      boolean first = true; 
         
         
      for (int i = 0; i < array.length; i++)//using for loop to 
      {            
         if (array[i] != null)
         {         
            if (first) //using boolean variable 'first' to print an informatino one time
            {
               System.out.printf("\n%-12s%s\n", "ID", "Name");
               System.out.printf("%2s%10s%4s\n", "--", "", "----");
            }
               
            System.out.printf("%-12s%s\n", array[i].getStudentId(), array[i].getStudentName());
            flag = true;
            
            first = false;
         }
                     
      }
      if (!flag)
      {
         System.out.println("\nNo students enrolled!");
           
      }
         
   }
      
        
   //using get method to return name of course
         
   public String getCourseName()
   {
      return name;
   }
   
   //using get method to return code of course
   
   public String getCourseCode()
   {
      return code;
   }
   
   //using get method to return section number
   
   public int getSectionNum()
   {
      return sectionNum;
   }
   
   //using get method to return number of seats available
   
   public int getAvailableSeats()
   {
      return availableSeats;
   }
   
   //using get method to return the students array
   
   public Student[] getArray()
   {
      return array;
   }
   
   //using get method to return the total students enrolled in a class.
   
   public int getTotalEnrollment()
   {
      return totalEnrollment;
   }   
   
}                                     
