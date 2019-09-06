import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class numberExtract
{
   public static void main(String[] args)throws FileNotFoundException
   {
      File infile = new File("numbersExtract.txt");
      Scanner in = new Scanner(infile);
      
      while (in.hasNextLine())
      {
      
         String sentence = in.nextLine();
         
         int i = 0;
         
         for (i=0; i<sentence.length();i++)
         {
            char c = sentence.charAt(i);
            
            if (Character.isDigit(c))
            {
            
             System.out.print(c);
            
            }
            
         }
         System.out.println("");
            
      }
      
   
   }
}   