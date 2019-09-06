//Java program to solve the pascal problem

import java.util.*;
import java.io.*;

public class pascal
{
   public static void main (String[] args) throws FileNotFoundException
   {
      int s1Correct = 0;
      int s2Correct = 0;
      int s3Correct = 0;
      
      String question = "";
      String missed = "";
      
      int[] questionMissed = new int[10];
      
      File infile = new File("pascal.txt");
      Scanner in = new Scanner(infile);
      
      String correct = in.nextLine();
      String[] cArray = correct.split("");
      
      in.nextLine();
      
      String stud1 = in.nextLine();
      String[] s1Array = stud1.split("");
      
      String stud2 = in.nextLine();
      String[] s2Array = stud2.split("");
      
      String stud3 = in.nextLine();
      String[] s3Array = stud3.split("");
      
      for(int i = 0; i<10; i++)
      {
         if(cArray[i].equals(s1Array[i]))
         {
            s1Correct++;
         }
         else
         {
            questionMissed[i]++;
         }
         
         if(cArray[i].equals(s2Array[i]))
         {
            s2Correct++;
         }
         else
         {
            questionMissed[i]++;
         }

         if(cArray[i].equals(s3Array[i]))
         {
            s3Correct++;
         }
         else
         {
            questionMissed[i]++;
         }

      }
      
      System.out.println("Student 1: "+s1Correct+" correct "+(10-s1Correct)+" incorrect "+(int)((s1Correct/10.0)*100)+" percent ");
      System.out.println("Student 2: "+s2Correct+" correct "+(10-s2Correct)+" incorrect "+(int)((s2Correct/10.0)*100)+" percent ");
      System.out.println("Student 3: "+s3Correct+" correct "+(10-s3Correct)+" incorrect "+(int)((s3Correct/10.0)*100)+" percent ");
            
      for(int j=0; j<10; j++)
      {
        question += ("Q"+(j+1)+" ");
        missed += questionMissed[j]+"  ";
      }
      System.out.println(question);
      System.out.print(missed);
   }
}