/**
*Program Description: This program gives us the minimum cost of reaching the last element in an array. 
*
*@author Rohan Maharjan
*@Date Assigned: 02/26/2018
*@Date Due: 03/09/2018
*@version 1.0
*/

public class SlideOrJump
{ 
   /**
      array variable  
   **/ 
   private int[] myArray;
   
   /**
      instance variables
   **/
   private int recCount;
   private int dynCount;
   
   /**
      argument constructor  
      @param board this will be an array passed from the main program 
   **/   
   public SlideOrJump(int[] board)
   {
      myArray = board;
      recCount = 0;
      dynCount = 0;
   }
   
   /**
      method to find an index containing smaller element in an array
      @param i first index
      @param j second index
      @return the index containing smaller element in the array
   **/
   public int minimum (int i, int j)
   {
      if (myArray[i]<myArray[j])
      {
         return i;
      }
      else
      {
         return j;
      }
   }
   
   
   /**
      method to recursively count the minimum cost to get to the end of an array from index 'n'
      @param n this is the starting position for counting the cost
      @return the minimum total cost to reach the end of an array from index n. 
   **/
   public long totalCost(int n)
   { 
      long result = 0;
              
      if ( n == myArray.length - 1)
      {
         result =  myArray[n];
      }
         
      else if (n == myArray.length - 2)
      {
         result = myArray[n] + myArray[n+1];
      }
         
      else if (n == myArray.length - 3)
      {
         result = myArray[n] + myArray[n+2];
      }
         
      else
      {
         recCount++;
         result = (myArray[n] + Math.min(totalCost(n+1),totalCost(n+2)));
      }
      
      return result;
   }
   
   /**
      method to call the totalCost method
      @return the recursively produced minimum cost to reach the end of an array from index 0.
   **/
   public long recSolution()
   {
      return totalCost(0);
   }
   
   /**
      method to find the minimum cost to reach the end of an array using dynmaic programming solution
      @return the element at index 0 which is the minimum total cost to reach the end of the array from index 0.
   **/
   public long dpSolution()
   {
      
      int n = myArray.length;
      myArray[n-2] = myArray[n-2] + myArray[n-1];
      
       
      for (int i = n-3; i >= 0; i--)
      {
         dynCount++;
         myArray[i] = myArray[i] + myArray[minimum(i+1,i+2)];
      }
                  
      return myArray[0];
  
      
   }
   
   /**
      method to find whether the program 'Slides' or 'Jumps' to reach the end of the array
      @return sequence of moves requred to get to the end of the array
   **/
   public String getMoves()
   {
     String moves = "";
     int n = myArray.length;
     int i = 0;
               
     while (i<n-3)
     {
         if(myArray[i+1] < myArray[i+2])
         {
            moves += "S";
            i++;
         }
         
         else
         {
            moves += "J";
            i += 2;
         }
      
     }
     
     if (i == n-2)
     {
      moves += "S";
     }
     
     if (i == n-3)
     {
      moves += "J";
     }
     
     System.out.println("The number of recursive calls is " + recCount);
     System.out.println("The number of loop iterations in dynamic programming is " + dynCount);

     return moves;
   }
   
}