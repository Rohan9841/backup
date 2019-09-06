// Name: Rohan Maharjan        Date Assigned: 13 April 2017
//
// Course: CSCI 2003 60357     Date Due: 27 April 2017
//
// Instructor: Ms. Greer
//
// File name: Calendar
//
// Program Description: This program stimulates a real life calendar



import java.util.Scanner;
import java.util.InputMismatchException;

public class Calendar
{
   public static void main(String[] args)
   {
      // initialize the variables
      Scanner in = new Scanner(System.in);
      boolean leapYear = true;
      
      // print opening lines
      System.out.println("Create a Calendar");
      System.out.println("=================\n");
     
      boolean valid = false;
      int year = 1;
          
      // Take year input      
      while(!valid)
      {
         try
         {
            System.out.print("Enter year: ");
            
            year = in.nextInt();
            
            if (year > 0)
            {
               valid = true;
            }
            
         }
         
         catch(InputMismatchException inputMismatch)
         {
            in.nextLine();
         }   
     }    
     
     // Print the optoins for the months
     System.out.println("\nChoose Month");
     System.out.println("------------");  
     
     // Printing the months
     System.out.println("1. January      5. May        9. September");
     System.out.println("2. February     6. June      10. October");
     System.out.println("3. March        7. July      11. November");
     System.out.println("4. April        8. August    12. December\n");
     
     boolean check = false; 
     int month = 1;
     
     // Taking the input for the month
     while (!check)
     {   
         try
         {
            System.out.print("Enter Month (1 - 12): ");
            month = in.nextInt();
            
            if(month >= 1 && month <= 12)
            {
               check = true;
            }   
         }
         
         catch(InputMismatchException mismatch)
         {
            in.nextLine();
         }
      }   
      
      boolean validity = false; 
      int day = 1;
      
      System.out.println();
      
      // Create an array for the months names
      String[] months = {"January", "February", "March", "April", "May", "June", "July", 
                                    "August", "September", "October", "November", "December"};
          
      // Create the number of days for the number of days in month                              
      int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      
      // Assign the month name based on the month option
      String monthName = months[month - 1];
      
      // Assign the number of days based on the month option
      int numOfDays = monthDays[month - 1];
      
      
      
      // Check for the leap year  
      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
      {
         // Input year is a leap year
         leapYear = true;
      }
      
      // If it is February and if it is a leap year then assign 29 to the number of days
      if (month == 2)
      {
         if (leapYear) 
         {
            numOfDays = 29;
         }
      }

     // An infinite loop for taking the input for the day option
     while (!validity)
     {   
         try
         {
            System.out.printf("Enter Day (1 - %d): ", numOfDays);
            day = in.nextInt();
            
            if(day >= 1 && day <= 30)
            {
               validity = true;
            }   
         }
         
         catch(InputMismatchException mismatchError)
         {
            in.nextLine();
         }
      }  
      
      // Print the options for the week option
      System.out.println("\nChoose Day of Week");
      System.out.println("------------------");
      
      System.out.println("1. Sunday       5. Thursday");
      System.out.println("2. Monday       6. Friday");
      System.out.println("3. Tuesday      7. Saturday");
      System.out.println("4. Wednesday\n");
    
            
            
      boolean validitys = false;
      int weekDay = 1; 
     
     // Taking the input of the day of the week
     while (!validitys)
     {   
         try
         {
            System.out.print("Enter Day of the Week (1 - 7): ");
            weekDay = in.nextInt();
            
            if(weekDay >= 1 && weekDay <= 7)
            {
               validitys = true;
            }   
         }
         
         catch(InputMismatchException mismatchError)
         {
            in.nextLine();
         }
      }       
      
      // Initializing the months array after declaring it
     int[][] monthsArray = new int[6][7];
          
          
     // Finding the day at which we should start to write the days in the month   
     int value = weekDay - (day % 7);
     
     
     if (day % 7 == 0)
     {
         value = weekDay - (day % 7 + 7);
     }
     
     if (value < 0) 
     {
         value += 7;
     }
     
     
     // Print the number of days and the year input 
     System.out.printf("\n\n%-16s%4d\n", monthName, year);
     
     System.out.println("--------------------");
     
     // Print the days in proper format
     System.out.println(" S  M  T  W  T  F  S");
     
     System.out.println("--------------------");

     
     // Create the array for the calendar
     int num = 1;
     boolean start = false;
     
     for (int i = 0; i < monthsArray.length && num <= numOfDays; i++) 
     {
      for (int j = 0; j< monthsArray[i].length && num <= numOfDays; j++) 
      {
         if (j >= value)
         {
            start = true;
         }
         if (start) 
         {
            monthsArray[i][j] = num;
            num++;
         }
      }
     }
     
     
     // Print the calendar array
     for (int[] weekInArray : monthsArray)
     {
      for (int dayInArray : weekInArray)
      {  
         if (dayInArray == 0)
         {
            System.out.printf("%2s ", "");
         }
         else
         {
            System.out.printf("%2d ", dayInArray);
         }
      }
      System.out.println();
     }

        
     
          
   }
}      
