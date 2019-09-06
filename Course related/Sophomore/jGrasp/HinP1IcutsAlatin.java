import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HinP1IcutsAlatin
{
   public static void main(String[] args) throws FileNotFoundException
   {
      int counter = 0;
      String requiredWord = "HinP1I";
      
      File infile = new File("Alatin.txt");
      Scanner in = new Scanner(infile);
      
      System.out.print("\nHere is the position of cuts:\n ");

      
      while(in.hasNextLine())
      {
      
         String sentence = in.nextLine();
         
         int i = 0;
         
         for (i = 0; i<sentence.length(); i++)
         {
            char characters = sentence.charAt(i);
            
            if (characters == 'H')
            {
               try
               {
               
                  String word = sentence.substring(i,i+6);
               
                  if (word.equals("HinP1I"))
                  {
                     counter++;
                     String numbers = "";
                     
                     for(int n = 0; n<sentence.length();n++)
                     {
                     
                        char c = sentence.charAt(n);
                        
                        
                        if (Character.isDigit(c))
                        {
                           
                           numbers = numbers + c;
                        
                        }
                        
                     
                     }
                     
                     String requiredNumber = numbers.substring(0,numbers.length()-1);   
                     System.out.printf("%n%5s",requiredNumber);
                     
                  }
               }  
               
               catch(StringIndexOutOfBoundsException exception)
               {
                
               } 
            
            }
         }
      
      }
      
      System.out.println("\n\nHinP1I cuts Alatin "+counter+" times.");
   }
}