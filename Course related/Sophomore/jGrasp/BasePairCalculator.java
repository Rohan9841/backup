import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class BasePairCalculator
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File infile = new File("Alatin.fasta");
      
      Scanner in = new Scanner(infile);
      
      int counter = 0;
      
      int i = 0;
      
      while (in.hasNextLine())
      {
         try{
            String sentence = in.nextLine();
         
            if(sentence.charAt(0) != '>')
            {
            
               for(i = 0; i<sentence.length();i++)
               {
                  char character = sentence.charAt(i);
               
               
               
                  if(character=='A' || character == 'G' || character == 'C' || character == 'T')
                  {
                     counter += 1;                  
                  }
               }
            }   
         }
         
         catch(StringIndexOutOfBoundsException outOfBounds){
            counter = counter;
         }   
      }   
      
      System.out.print(counter);
               
   }
}