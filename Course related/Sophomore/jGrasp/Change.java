// Name:  Rohan Maharjan      Date Assigned: 04/04/17   
//  
// Course:  CSCI 2003 60357      Date Due:  04/13/17      
//  
// Instructor: Ms. Greer  
//             
// File name:  Lottery          
//              
// Program Description:  This program simulates a Lottery game machine where player has to match
//                       as many numbers to the computer's as possible. 


//importing java classes
   
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
   
public class Change
{
   public static void main(String[] args)
   {
      // Creating object for scacnner class
      
      Scanner in = new Scanner(System.in);
      
      int price = 0;
      int choice1 = 0;
      int options = 0; 
      int matches = 0;
      int rounds = 0;
      int randomNumber = 0;
      
      //creating array
      
      int[] inputNumbers = new int[5];
      
      boolean quit = false;
      boolean first = true;
      boolean once = false;
      boolean end = true;
      boolean newNum = false;
      
      //creating object for random class
      
      Random random = new Random();
      
      int[] winnings = new int[5];
      
      double winning = 0;
      
      // initialization ends
      
      //Using while loop
      while (true)
      {
         System.out.println("Instant Lottery");
         System.out.println("===============\n");
         System.out.println("Price Options:");
         System.out.println("==============");
         System.out.println("1. $1.00 for one round.");
         System.out.println("2. $5.00 for five rounds.");
         
         
         System.out.println();
         
         // ask until user inputs valid input
         while(true)
         {
            try
            {
               System.out.print("Enter choice (1 or 2): ");
               price = in.nextInt();
            } 
            catch (InputMismatchException e)
            {
               in.nextLine();
               continue;
            }
            if (price == 1 || price == 2)
            {
               break;
            }
                                        
         }         
         
         // This is the start of the game
         
         once = false;
         
                  
         // set number of rounds based on the price entered by the user
         
         if (price == 1)
         {
            rounds = 1;
         }
         else if (price == 2)
         {
            rounds = 5;
         }         
      
         // continue as long as the number of rounds is greater than 0
         while (true){
            
            
            System.out.println("\nOptions:");
            System.out.println("========");
            System.out.println("1. Choose Numbers\n2. Check Winnings\n3. Quit"); 
            System.out.println();
            
            while (true)
            {
               System.out.print("Enter Choice (1, 2, or 3): ");
            
               try
               {               
                  options = in.nextInt();
               
                  if (options == 1 || options == 2 || options == 3)
                  {  
                     // valid input
                     break;
                  
                  }
                  else
                  {
                     // if the input is invalid ask the user again
                     in.nextLine();
                     continue;     
                  }
               }
               catch (InputMismatchException e)
               {          
                  in.nextLine();  
                  continue;
               }
            }            
            
            
            System.out.println("\n-----------------------------------");
                                    
         
            if (options == 1)
            {  
               if (rounds == 0)
               {
                  break; 
               }
               // if the user has played 
               once = true;
               
                      
               // Select an option 1 or 2
               System.out.println("\nNumber Options:\n"
                               + "===============\n"
                               + "1. Choose your Numbers\n"
                               + "2. Quick Pick");
               
               System.out.println();
                                                                                             
               // validating input
               while (true)
               {
                  try
                  {
                     System.out.print("Enter choice (1 or 2): ");
                     choice1 = in.nextInt();
                  }
                  catch (InputMismatchException e)
                  {  
                     in.nextLine();
                     continue;
                  }
                  if (choice1 == 1 || choice1 == 2)
                  {
                     // if input is valid, break from loop.
                     break;
                  }
                  else 
                  {
                     in.nextLine();
                  }
               }
            
               // choice for option is 1
            
               if (choice1 == 1)
               {
                  int numberToInput = 1;
                  end = false;
                  int num;
                  inputNumbers = new int[5];
                  newNum = false;
               
               
               // Display number options
                  System.out.println("\nChoose 5 Different Numbers\n");            
                  System.out.println("1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20\n");
               
               // continue until we have the 5th number      
                  while (numberToInput < 6)
                  {
                     newNum = true;               
                     System.out.print("Number " + numberToInput + ": ");                  
                  
                     try
                     {
                        num = in.nextInt();
                        
                        if (num < 1 || num > 20)
                        {
                           in.nextLine();
                           continue;
                        }
                     
                     
                     // checking if the number is new           
                        for (int j  = 0; j < inputNumbers.length; j++)
                        {
                           if (num == inputNumbers[j])
                           {
                              newNum = false;
                           }
                        }
                         
                        if (newNum)
                        {
                           
                           inputNumbers[numberToInput - 1] = num; 
                           numberToInput += 1;
                        }
                        else 
                        {
                           
                           System.out.println("            Error! No Duplicates!");
                        }
                     
                     } 
                     catch (InputMismatchException e)
                     {
                     
                        in.nextLine();
                     
                     }
                  
                  }  // while loop ends
                  
                  
                    
               } 
                       
                  
                  
                          
               
               else if (choice1 == 2)
               {
                  //  to get random numbers
                  inputNumbers = new int[5];
                  newNum = true;
                  end = false;
               
               // for the number position  
                  int numberPos = 0;
               
                  while (numberPos < inputNumbers.length)
                  {
                     randomNumber = 1 + random.nextInt(20);
                     newNum = true;
                  
                     for (int i = 0; i < inputNumbers.length; i++)
                     {
                        if (inputNumbers[i] == randomNumber)
                        {
                           newNum = false;
                        }
                     }
                     if (newNum)
                     {
                        inputNumbers[numberPos] = randomNumber; 
                        numberPos += 1;  
                     }
                  }   
               
               } 
               
               System.out.println();
            
               System.out.print("Your Numbers: ");
               
               for (int i = 0; i < inputNumbers.length; i++)
               {  
                  
                  System.out.printf("%2d ", inputNumbers[i]);
               }
                 
               System.out.println();
            
               
               
                                    
               newNum = true;
               end = false;
               winnings = new int[5];
           
            // for the number position
               int numberPos = 0;
            
               while (numberPos < winnings.length)
               {
                  randomNumber = 1 + random.nextInt(20);
                  newNum = true;
               
                  for (int i = 0; i < winnings.length; i++)
                  {
                     if (winnings[i] == randomNumber)
                     {
                        newNum = false;
                     }
                  }
                  if (newNum)
                  {
                     winnings[numberPos] = randomNumber; 
                     numberPos += 1;  
                  }
               }
                
                  
            
               rounds -= 1;
                  
            }     
            // for 2nd option
            
            else if (options == 2)
            {  
               if (!once)
               {
               
                  continue;
               }
               
               System.out.println();
               
               System.out.print("Winning Numbers: ");
               for (int i = 0; i < winnings.length; i++)
               {  
                  
                  System.out.printf("%2d ", winnings[i]);
               }
                  
               System.out.println();
               
               matches = 0;
            
               for (int i = 0; i < inputNumbers.length; i++)
               {
               
                  for (int j = 0; j < winnings.length; j++)
                  {
                     if (inputNumbers[i] == winnings[j])
                     {
                        matches += 1;
                     }            
                  
                  }        
               
               }
               
               winning += matches * 10.0;
               
               
               System.out.print("Player  Numbers: ");
               for (int i = 0; i < inputNumbers.length; i++)
               {  
                  
                  System.out.printf("%2d ", inputNumbers[i]);
               }
                     
               System.out.println();   
                        
               System.out.println("\nMatches: " + matches);
               System.out.printf("Prize:   $%.2f\n", matches *10.0);
            
               System.out.println("\nRounds Left: " + rounds);
            
            
               if (rounds == 0)
               {  
               
                  System.out.println("\n-------------------------------");
                        
                  System.out.println("\nTotal Prize: $" + winning);
               
                  System.out.println("\nPlease take your winnings.\n\nThanks for playing!");
                     
                  System.out.println("\n-----------------------------------\n");
                     
                  break;
               }
                     
            }  
            
            else if (options == 3)
            {
               // quit
            
               quit = true; 
               
                            
                           
               // add the money of the remaining rounds to winning 
            
               winning += rounds * 1;
               
               System.out.println("\nTotal Prize: $" + winning);
               System.out.println("\nPlease take your winnings.\n\nThanks for playing!\n");
               System.out.println("-----------------------------------\n");
                  
               break;
            
            }
            
            else
            {
               System.out.println("Please enter a valid number.");
            }
            
            System.out.println("\n-----------------------------------");
         
         }
      }
        
      
   }
   
   
   
   
}