//Name: Rohan Maharjan
//
//Course: CSCI 2003 60357
//
//Instructor: Ms.Greer
//
//File name: DiceGame.java
//
//Program Description: This is a two player game. The players alternate turns, starting with player 1. During their turn, the player rolls 6 dice at
//                     once. If no sequences can be made from the numbers rolled, the player gets 0 points. If they do roll one or more
//                     sequences, for each number in the sequence(s), they receive 5 points and get to roll the dice again. The player
//                     gets to continue to roll the dice until the roll has no sequences. The first player that reaches 100 points wins the
//                     game. 
//
//Date Assigned: March 16, 2017
//
//Date Due: March 23, 2017

//importing Scanner class
import java.util.Scanner;

//importing Random class
import java.util.Random;

public class DICEGAME
{  
	public static void main(String[] args)
   {  
      //declaring variables
      boolean change = true;
      
      int p1Score = 0;
      int p2Score = 0; 
      
      String input = "";
      
      //creating an object for Random class
      Random generatedNum = new Random();
      
      //creating an object for Scanner class
      Scanner in = new Scanner(System.in);
      
      //declaring variables
      String randomNumbers = "";
      int pNumber = 2;
      
      // Printing the rules
      System.out.println("Run For It! - A Dice Game");
      System.out.println("\nRules");
      System.out.println("=====");
      System.out.println("1. 2 players take turns rolling 6 dice.\n");
      System.out.println("2. If roll contains a sequence, same player gets another turn.\n");
      System.out.println("3. If roll doesn't contain a sequence, next player's turn.\n");
      System.out.println("4. Get points if roll contains one or more sequences.\n");
      System.out.println("   1. Sequence must start from 1 and not skip any numbers.\n");
      System.out.println("   2. Get 5 points for each number in the sequence(s).\n");
      System.out.println("5. Get no points if roll contains no sequences.\n");
      System.out.println("6. First Player to get to 100 points wins.\n");
      System.out.println("============================================================");
      
      //Using do while loop 
      do 
      {       
         
         //Setting condition for if else statement
         if (p1Score >= 100 || p2Score >= 100)
         {  
          
         
            System.out.println("=================================\n");
            
            if (p1Score >= 100)
            {
               System.out.println("Player 1 wins!");
            }
            
            else if (p2Score >= 100)
            {
               System.out.println("Player 2 wins!");
            }
            
            else
            {
               System.out.println("Both above 100.");
            }
            
            System.out.println("\n=================================");
            
            break;
         }
         
         
         
         
         randomNumbers = "";
         
         //Using for loop 
         
         for (int i = 0; i < 6; i++) 
         {         
            randomNumbers += 1 + generatedNum.nextInt(5);  
         }
         
        //Setting condition for if-else statement
         if (change)
         {
         
            System.out.println("=================================\n");
            
            if (pNumber == 1)
            {
            
               pNumber = 2;
               
            }
            
            else
            
            {
            
               pNumber = 1;
               
            }                    
         }
         
         else
         {
            System.out.println("---------------------------------\n"); 

         }
         change = true;
         
         System.out.print("Player " + pNumber + " - Enter R to roll: ");
         
         input = in.nextLine();
         
         System.out.print("\nRoll: ");
         
         for (int num = 0; num < randomNumbers.length(); num++)
         {
            System.out.print( randomNumbers.charAt(num) + " " );
         }
         System.out.println("\n");
                  
      //assigning value to certain variables 
      int cNum = 1;
      String sequence = "";
      boolean sequenceFound = false;
      int numOfOnes = 0;   
      String numberString = randomNumbers;     
      
      int numOfNums = numberString.length();
      
      for (int i = 0; i < numOfNums; i++)
      {
         if (("" + numberString.charAt(i)).equals("1") )
         {
            numOfOnes += 1;
           
         }
      }      
   
      for (int j = 0; j < numOfOnes; j++)
      {
         cNum = 1;
         
         //Using another do-while loop
         do
         {
            numOfNums = numberString.length();
                        
            for (int i = 0; i < numOfNums; i++)
            {  
               
               sequenceFound = false;
            
               if (("" + numberString.charAt(i)).equals("" + cNum))
               {
               
                  sequence += cNum;
                  sequenceFound = true;
                  cNum += 1; 
                                                 
                  numberString = numberString.substring(0, i) + numberString.substring(i + 1, numberString.length());

                  break;                    
               }
            }
         }         
         while (sequenceFound && (numberString.length()) != 0);  
                
         sequence += " ";      
      }

      //assigning variables to certain variables            
      String RandomSequence = sequence;
      boolean samePlayer = false;
      
      int s = RandomSequence.indexOf(' ');
      String seq = "";
      int score = 0;
      int sequenceNum = 0;
      boolean first = true;
      boolean hasSequence = false;
      boolean doesNotHaveSequence = true;      
           
      //Creating while loop        
      while (s != -1)
      {  
      
      //using nested if-else statement
         if (s == 0 && first)
         {
                        
            first = false;
            
            break;
         }
         
         else if (s == 0)
         {
            break;
         }
         
         seq = "";
                  
         seq += RandomSequence.substring(0, s);
         
         if ((s + 1) < RandomSequence.length())
         {
            RandomSequence = RandomSequence.substring(s + 1, RandomSequence.length());         
         }
         
         else 
         { 
            RandomSequence = "";
         }
         
         if (seq.indexOf("2") != -1)
         {  
            sequenceNum += 1;
            
            System.out.println("Sequence " + sequenceNum + ": " + seq);
            
            hasSequence = true;
            
            change = false;
            
            doesNotHaveSequence = false;
            
            
            
            score += seq.length() * 5;
         } 
         
         s = RandomSequence.indexOf(" ");       
         
      }
     
      if (pNumber == 1)
      {
         p1Score += score;
      }
      
      else
      {
         p2Score += score;
      }
      if (doesNotHaveSequence)
      {
         System.out.println("No Sequence!");
      }
      
      //displaying required elements
      System.out.println( "\nPlayer 1 score: " + p1Score );      
      System.out.println( "Player 2 score: " + p2Score + "\n");
         
      //ending do-while loop    
    } while( input.equals("R") );      
      
}  
} 