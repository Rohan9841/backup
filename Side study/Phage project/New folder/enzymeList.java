import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class enzymeList
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File infile = new File("ENZYMEguess.txt");
      Scanner in = new Scanner(infile);
      PrintWriter outfile = new PrintWriter("enzymesList.txt");
      
      int counter = 0;
      
     
      while (in.hasNextLine())
      {
         String word = in.nextLine();
         String wordOrder = "";
         String enzyme = "";
         
         for (int i = 0; i<word.length(); i++)
         {
            char c = word.charAt(i);
            
            if (c == 'O')
            {
               try
               {
                  wordOrder = word.substring(i, i+5);
                  
                  if(wordOrder.equals("Order"))
                  {
                     enzyme = word.substring(i+5, word.length());
                     counter++;
                  }   
               }
               catch(StringIndexOutOfBoundsException exception)
               {
                  
               }
            }
         }
         outfile.println(enzyme);
    
      }
      System.out.print("There are "+counter+" enzymes.");
      in.close();
      outfile.close();
   }
}