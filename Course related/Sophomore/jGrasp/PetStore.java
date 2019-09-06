//Name: Rohan Maharjan
//
//Course: CSCI 2003 60357
//
//Instructor: Ms.Greer
//
//File name: PetStore.java
//
//Program Description: This class will use the Dog class to simulate an order from the PetStore website.
//                     It has one object for dog class. The program displays the price of dog based
//                     on its size and then gives output based on user's choice of input. 
//
//Date Assigned: Feb 21, 2017
//
//Date Due: Feb 28, 2017

//importing Scanner class from java.util package.
import java.util.Scanner;


public class PetStore
{
   public static void main(String[] args)
   {
      //creating a variable with double datatype to store the price of dogs. 
      double price = 0;
      
      //creating object for Dog class.
      Dog obj = new Dog();
      
      //creating scanner object.
      Scanner in = new Scanner(System.in);
      
      //displaying the prices for dogs based on their sizes.
      System.out.println("Welcome! Select traits to choose a dog!");
      System.out.println("=======================================");
      System.out.println("\n======================");
      System.out.println("|  AVAILABLE PRICES  |");
      System.out.println("======================");
      System.out.println("Small Dog ----- $40.00");
      System.out.println("Medium Dog ---- $60.00");
      System.out.println("Large Dog ----- $80.00");
      
      //displaying sizes of dogs.
      System.out.println("\n\n  Sizes");
      System.out.println("=========");
      System.out.println("1. Small");
      System.out.println("2. Medium");
      System.out.println("3. Large");
      
      //asking user to input choice for size of dog
      System.out.print("\nEnter choice (1, 2, or 3): ");
      int sizeChoice = in.nextInt();
      
      //seting condition to set the size based on user's input 
      if (sizeChoice == 1)
      {
         obj.setSize("Small");
         price = 40.00;
      }
      
      else if (sizeChoice == 2)
      {
         obj.setSize("Medium");
         price = 60.00;
      }
      
      else if (sizeChoice == 3)
      {
         obj.setSize("Large");
         price = 80.00;
      }         
      
      //displaying coat length       
      System.out.println("\n\n  Coats");
      System.out.println("=========");
      System.out.println("1. Short");
      System.out.println("2. Medium");
      System.out.println("3. Long");
      
      //asking user to input choice for coat length
      System.out.print("\nEnter choice (1, 2, or 3): ");
      int coatChoice = in.nextInt();
      
      //setting condition to set coat length based to user's input
      if (coatChoice == 1)
      {
         obj.setCoatLen("Short");
      }   
      
      else if (coatChoice == 2)
      {
         obj.setCoatLen("Medium");
      }    
      
      else if (coatChoice == 3) 
      {
         obj.setCoatLen("Long");
      }   
     
      //calling getBreed() to display the breed of dog.
      System.out.println("\nBased on your response, we suggest a "+obj.getBreed()+"!");
      
      //asking user if he/she wants to adopt the dog and storing the answer in variable yesOrNo.
      System.out.printf("\nWould you like to adopt a %3s for $%5.2f? (y/n): ",obj.getBreed(),price);  
      String yesOrNo = in.next();
      
      //diplaying the bill if the user answers 'y'
      if (yesOrNo.equals("y"))
      {
         System.out.printf("\n\nBreed:%30s",obj.getBreed());
         System.out.println("\n------------------------------------");
         System.out.printf("Subtotal:%22s%5.2f","$",price);
         System.out.printf("\nTax:%27s%5.2f","$",(11.0)/100*price);
         System.out.printf("\nTotal:%25s%5.2f","$",price+((11.0)/100*price));
         System.out.print("\n\nPlease come again!");       
      } 
      
      //setting condition when the user answers 'no'
      else if (yesOrNo.equals("n"))
      {
         //asking user if he/she wants to change his/her choice and storing the answer in variable yesOrNo2.
         System.out.print("\nWould you like to change your choice of size and/or coat length? (y/n): ");
         String yesOrNo2 = in.next();
         
         //displaying the update if the user enters 'y' 
         if (yesOrNo2.equals("y"))
         {
            System.out.println("\n  Update");
            System.out.println("=========");
            System.out.println("1. Size");
            System.out.println("2. Coat");
            System.out.println("3. Both");
            
            //asking user to enter choice for what he/she wants to update and storing in variable updateChoice
            System.out.print("\nEnter choice (1, 2, or 3): ");
            int updateChoice = in.nextInt();
            
            //Displaying sizes when the update choice is 1.
            if (updateChoice == 1)
            {
            
               System.out.println("\n\n  Sizes");
               System.out.println("=========");
               System.out.println("1. Small");
               System.out.println("2. Medium");
               System.out.println("3. Large");
              
               //asking user to enter size choice and storing the choice in variable sizeChoice 
               System.out.print("\nEnter  choice (1, 2, or 3): ");
               sizeChoice = in.nextInt();
               
               //setting up instruction for certain size choices.
               if (sizeChoice == 1)
               {
                  obj.setSize("Small");
                  price = 40.00;
               }
               
               else if (sizeChoice == 2)
               {
                  obj.setSize("Medium");
                  price = 60.00;
               }
               
               else if (sizeChoice == 3)
               {
                  obj.setSize("Large");
                  price = 80.00;
               }
               
               //calling getBreed method to display the breed of the dog.
               System.out.println("\nBased on your response, we suggest a "+obj.getBreed()+"!");
               
               //asking user to decide if he/she wants the dog and storing the answering in variable yesOrNo3.
               System.out.printf("\nWould you like to adopt a %3s for $%5.2f? (y/n): ",obj.getBreed(),price);
               String yesOrNo3 = in.next();
               
               //Displaying the bill when the user answers 'y' 
               if (yesOrNo3.equals("y"))
               {  
               
                  System.out.printf("\n\nBreed:%30s",obj.getBreed());
                  System.out.println("\n------------------------------------");
                  System.out.printf("Subtotal:%22s%5.2f","$",price);
                  System.out.printf("\nTax:%27s%5.2f","$",(11.0)/100*price);
                  System.out.printf("\nTotal:%25s%5.2f","$",price+((11.0)/100*price));
                  System.out.print("\n\nPlease come again!");    
               }    
               
               else if (yesOrNo3.equals("n"))
               {
                  System.out.printf("\nPlease come again!");
               }     
            
            }   
            
            //Displaying sizes of dogs when the updateChoice is 3.
            else if (updateChoice == 3)
            {
            
               System.out.println("\n\n  Sizes");
               System.out.println("=========");
               System.out.println("1. Small");
               System.out.println("2. Medium");
               System.out.println("3. Large");
               
               //asking user to enter choice for size and storing in sizeChoice.
               System.out.print("\nEnter  choice (1, 2, or 3): ");
               sizeChoice = in.nextInt();
               
               //setting up certain instruction for size choices
               if (sizeChoice == 1)
               {
                  obj.setSize("Small");
                  price = 40.00;
               }
               
               else if (sizeChoice == 2)
               {
                  obj.setSize("Medium");
                  price = 60.00;
               }
               
               else if (sizeChoice == 3)
               {
                  obj.setSize("Large");
                  price = 80.00;
               }
               
               //displaying the coat lengths
               System.out.println("\n\n  Coats");
               System.out.println("=========");
               System.out.println("1. Short");
               System.out.println("2. Medium");
               System.out.println("3. Long");
            
               //asking user to enter the choice and storing it in variable coatChoice
               System.out.print("\nEnter choice (1, 2, or 3): ");
               coatChoice = in.nextInt();
               
               //setting up certain instructions for coat choice.
               if (coatChoice == 1)
               {
                  obj.setCoatLen("Short");
               }   
               
               else if (coatChoice == 2)
               {
                  obj.setCoatLen("Medium");
               }    
               
               else if(coatChoice == 3)
               {
                  obj.setCoatLen("Long");
               }
               
               //calling get method to display the breed of dog
               System.out.println("\nBased on your response, we suggest a "+obj.getBreed()+"!");
               
               //asking user to decide if they want the dog and storing the answer in yesOrNo4
               System.out.printf("\nWould you like to adopt a %3s for $%5.2f? (y/n): ",obj.getBreed(),price);
               String yesOrNo4 = in.next();
               
               //displaying bill when the user chooses 'y'
               if (yesOrNo4.equals("y"))
               {  
               
                  System.out.printf("\n\nBreed:%30s",obj.getBreed());
                  System.out.println("\n------------------------------------");
                  System.out.printf("Subtotal:%22s%5.2f","$",price);
                  System.out.printf("\nTax:%27s%5.2f","$",(11.0)/100*price);
                  System.out.printf("\nTotal:%25s%5.2f","$",price+((11.0)/100*price));
                  System.out.print("\n\nPlease come again!");    
               }   
               
               //displaying farewell line when the user chooses 'n'
               else if (yesOrNo4.equals("n"))
               {
                  System.out.print("Please come again");
               }   
                        
            } 
            
            //displaying coat length for updateChoice 2.
            else if (updateChoice == 2)
            {
               System.out.println("\n\n  Coats");
               System.out.println("=========");
               System.out.println("1. Short");
               System.out.println("2. Medium");
               System.out.println("3. Long");
            
               //asking user to enter coat length choice and storing in coatChoice
               System.out.print("\nEnter choice (1, 2, or 3): ");
               coatChoice = in.nextInt();
            
               //setting instruction for coat Choice
               if (coatChoice == 1)
               {
                  obj.setCoatLen("Short");
               }   
               
               else if (coatChoice == 2)
               {
                  obj.setCoatLen("Medium");
               }    
               
               else 
               {
                  obj.setCoatLen("Long");
               }
               
               //calling get method to display the breed of the dog
               System.out.println("\nBased on your response, we suggest a "+obj.getBreed()+"!");
               
               //asking user if he/she wants the dog and storing the answer in yesOrNo5
               System.out.printf("\nWould you like to adopt a %3s for $%5.2f? (y/n): ",obj.getBreed(),price);
               String yesOrNo5 = in.next();
               
               //displaying bill when the user enters 'y'
               if (yesOrNo5.equals("y"))
               {  
               
                  System.out.printf("\n\nBreed:%30s",obj.getBreed());
                  System.out.println("\n------------------------------------");
                  System.out.printf("Subtotal:%22s%5.2f","$",price);
                  System.out.printf("\nTax:%27s%5.2f","$",(11.0)/100*price);
                  System.out.printf("\nTotal:%25s%5.2f","$",price+((11.0)/100*price));
                  System.out.print("\n\nPlease come again!");    
               } 
               
               //displaying farewell line when the user enter 'n'
               else if (yesOrNo5.equals("n"))
               {
                  System.out.print("\nPlease come again!");
               } 
            }     
         }
      }       
   }   
}