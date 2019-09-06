//Name: Rohan Maharjan
//
//Course: CSCI 2003 60357
//
//Instructor: Ms.Greer
//
//File name: ThemeParkOnline.java
//
//Program Description: This class will simulate an order for tickets to a theme park. This class
//                     determines a possible discount based on the number of adult tickets purchased,
//                     a possible discount based on the number of child tickets purchased, calculates
//                     the subtotal, tax, and total, and displays the complete order.
//                     
//Date Assigned: Feb 17, 2017
//
//Date Due: Feb 21, 2017

//importing scanner class from java.util package
import java.util.Scanner;

public class ThemeParkOnlineTickets
{
   public static void main(String[] args)
   {
      //creating an object for ThemeParkOrder class
      ThemeParkOrder obj = new ThemeParkOrder();
      
      //creating scanner object
      Scanner in = new Scanner(System.in);
      
      //displaying the name of theme park
      System.out.print("\t\tWelcome! Please complete your ticket order below!");
      
      System.out.print("\n=================================================================\n\n");
      
      System.out.print("    +---------------------+\n");
      System.out.print("    |     THEME PARK      |\n");
      System.out.print("+---+---------------------+\n");
      System.out.print("| 1 |   Universal Studios |\n");
      System.out.print("+---+---------------------+\n"); 
      System.out.print("| 2 |    Magic Kingdom    |\n"); 
      System.out.print("+---+---------------------+\n");
      System.out.print("| 3 |        Epcot        |\n"); 
      System.out.print("+---+---------------------+\n\n");   
      
      //asking user to choose a theme park
      System.out.print("Choose a Theme Park (1-3): ");
      int name = in.nextInt();
      
      //seeting condition to display the price of one of the themepark
      if (name == 2)
      {
         obj.setName("MAGIC KINGDOM ");
         
         System.out.print("+---------------------------------------------+\n");
         System.out.print("|               "+obj.getName()+"                |\n");
         System.out.print("+-----+-------------------+-------------------+\n");
         System.out.print("| DAY |   ADULT TICKET    |    CHILD TICKET   |\n");
         System.out.print("+-----+-------------------+-------------------+\n");
         System.out.print("|  1  |     $124.00       |      $118.00      | \n"); 
         System.out.print("+-----+-------------------+-------------------+\n");
         System.out.print("|  2  |     $199.00       |      $187.00      | \n");
         System.out.print("+-----+-------------------+-------------------+\n");
         System.out.print("|  3  |     $289.00       |      $271.00      | \n");
         System.out.print("+-----+-------------------+-------------------+\n\n");
         
         System.out.print("Choose Number of Days(1-3): ");
         int numOfDays = in.nextInt();
         
         //setting condition to set the value of adultTicketPrice using setter
         if (numOfDays == 1)
         {
            obj.setAdultTicketPrice(124.00);
            obj.setChildTicketPrice(118.00);
         }  
         else if (numOfDays == 2)
         {
            obj.setAdultTicketPrice(199.00);
            obj.setChildTicketPrice(187.00);
         }
         else if (numOfDays == 3)
         {
            obj.setAdultTicketPrice(289.00);
            obj.setChildTicketPrice(271.00);
         }
         else
         {
            System.out.print("Please enter valid number");
         } 
         
         System.out.print("\nNumber of Adult Tickets: ");
         int noOfAdultTickets = in.nextInt();
         
         System.out.print("Number of Child Tickets: ");
         int noOfChildTickets = in.nextInt();
         
         obj.setAdultTicketPurchased(noOfAdultTickets);
         obj.setChildTicketPurchased(noOfChildTickets);  
         
         obj.getCompleteOrder();       
      }
      
      //setting conditiong to display another theme park
      else if (name == 1)
      {
         obj.setName("UNIVERSAL STUDIOS ");     
         
         System.out.print("+---------------------------------------------+\n");
         System.out.print("|               "+obj.getName()+"            |\n");
         System.out.print("+-----+-------------------+-------------------+\n");
         System.out.print("| DAY |   ADULT TICKET    |    CHILD TICKET   |\n");
         System.out.print("+-----+-------------------+-------------------+\n");
         System.out.print("|  1  |     $105.00       |      $100.00      | \n"); 
         System.out.print("+-----+-------------------+-------------------+\n");
         System.out.print("|  2  |     $184.99       |      $174.99      | \n");
         System.out.print("+-----+-------------------+-------------------+\n");
         System.out.print("|  3  |     $204.99       |      $194.99      | \n");
         System.out.print("+-----+-------------------+-------------------+\n\n");
         
         System.out.print("Choose Number of Days(1-3): ");
         int numOfDays = in.nextInt();
         
         //setting condition to set the value of adultTicketPrice using setter
         if (numOfDays == 1)
         {
            obj.setAdultTicketPrice(105.00);
            obj.setChildTicketPrice(100.00);
         }  
         else if (numOfDays == 2)
         {
            obj.setAdultTicketPrice(184.99);
            obj.setChildTicketPrice(174.99);
         }
         else if (numOfDays == 3)
         {
            obj.setAdultTicketPrice(204.99);
            obj.setChildTicketPrice(194.99);
         }
         else
         {
            System.out.print("Please enter valid number");
         } 
         
         System.out.print("\nNumber of Adult Tickets: ");
         int noOfAdultTickets = in.nextInt();
         
         System.out.print("Number of Child Tickets: ");
         int noOfChildTickets = in.nextInt();
         
         obj.setAdultTicketPurchased(noOfAdultTickets);
         obj.setChildTicketPurchased(noOfChildTickets);  
         
         obj.getCompleteOrder();       
         
      }
      
      //setting condition to display another theme park
      else if (name == 3)
      {
         obj.setName("EPCOT ");
         
        System.out.print("+---------------------------------------------+\n");
         System.out.print("|                     "+obj.getName()+"                  |\n");
         System.out.print("+-----+-------------------+-------------------+\n");
         System.out.print("| DAY |   ADULT TICKET    |    CHILD TICKET   |\n");
         System.out.print("+-----+-------------------+-------------------+\n");
         System.out.print("|  1  |     $114.00       |      $108.00      | \n"); 
         System.out.print("+-----+-------------------+-------------------+\n");
         System.out.print("|  2  |     $199.00       |      $187.00      | \n");
         System.out.print("+-----+-------------------+-------------------+\n");
         System.out.print("|  3  |     $289.00       |      $271.00      | \n");
         System.out.print("+-----+-------------------+-------------------+\n\n");
         
         System.out.print("Choose Number of Days(1-3): ");
         int numOfDays = in.nextInt();
         
         //setting condition to set the value of adultTicketPrice using setter
         if (numOfDays == 1)
         {
            obj.setAdultTicketPrice(114.00);
            obj.setChildTicketPrice(108.00);
         }  
         else if (numOfDays == 2)
         {
            obj.setAdultTicketPrice(199.00);
            obj.setChildTicketPrice(187.00);
         }
         else if (numOfDays == 3)
         {
            obj.setAdultTicketPrice(289.00);
            obj.setChildTicketPrice(271.00);
         }
         else
         {
            System.out.print("Please enter valid number");
         } 
         
         System.out.print("\nNumber of Adult Tickets: ");
         int noOfAdultTickets = in.nextInt();
         
         System.out.print("Number of Child Tickets: ");
         int noOfChildTickets = in.nextInt();
         
         obj.setAdultTicketPurchased(noOfAdultTickets);
         obj.setChildTicketPurchased(noOfChildTickets);  
         
         obj.getCompleteOrder();       
           
      }
      
      else
      {
         System.out.print("Please enter a correct number.");
      }   
      
   }
}      
      