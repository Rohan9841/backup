import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class justTesting
{
   public static void main(String[] args) throws FileNotFoundException
   {
      //getting locatin of file enzymesList.txt.
      File infile = new File("enzymesList.txt");
      
      //scanning the file in the location 
      Scanner in = new Scanner(infile);
      
      //opening the folder named cuts-folder
      File folder = new File("C:/Users/Nisha Dangol/Desktop/Phage project/cuts-folder");
   
      //creating file array named listOfFiles which stores all the files in the folder cuts-folder
      File[] listOfFiles = folder.listFiles();
      
      int j = 0;
      
      //declaring array of size 1000. Because there is space in between enzyme names which will cause 283*2 times size. 
      String[] names = new String[500];
      
      //setting condition that if there is next line in the file and j is smaller than \
      //the size of array
      while (in.hasNextLine() && j<names.length)
      {
         
         names[j] = in.nextLine();//setting value for array index
         j++;//value of j is raised to 283 because there are 283 enzymes
         
          
      }   
      
      for (int k = 0; k<j; k++)
      {
         //after each loop, new file with name that is stored in name[] will be created
         PrintWriter outfile = new PrintWriter("C:/Users/Nisha Dangol/Desktop/Phage project/cutPointsFolder/"+names[k]+".txt");
         
         //for each file in listOfFiles
         for (File each : listOfFiles) {
         
         //if each file is file type
            if (each.isFile()) {
            
              
               Scanner stdin = new Scanner(each);
               
               //getting name of the file
               String fullPhageName = each.getName();
               
               //cutting the name to remove ".txt"
               String requiredPhageName = fullPhageName.substring(0,fullPhageName.length()-4);
               
               //writing the name in the file
               outfile.printf("%4s%n",requiredPhageName);
               
               //In the start of each loop, the value of counter is zero
               int counter = 0;
               
               //empty string word
               String word = "";
               
               while(stdin.hasNextLine())
               {
                  String sentence = stdin.nextLine();
                  
                  for (int i = 0; i<sentence.length(); i++)
                  {
                     //reading each charater in a line
                     char character = sentence.charAt(i);
                     
                     //if we find a character equal to the first character of names[]
                     
                     if(character == names[k].charAt(0))
                     {
                        //try the following code
                        try{
                           
                           //cutting the sentence and storing in the variable word
                           word = sentence.substring(i,i+names[k].length()); 
                           
                           //if word is equal to the value in name[k]
                           if(word.equals(names[k]))
                           {  
                              counter++;
                              
                              String numbers = "";//putting number variable as empty string
                              
                              for(int n = 0; n<sentence.length();n++)
                              {
                                 
                                 char c = sentence.charAt(n);//again storing each character in a line in variable 'c'
                                 
                                 
                                 if (Character.isDigit(c))
                                 {
                                    
                                    numbers = numbers + c; //add the digit character in a string variable named number
                                    
                                 }
                                 
                                 
                              }
                              
                              int reduceFromNumber = 0;//to reduce if the enzyme has number
                              
                              for (int countNumInEnzyme = 0; countNumInEnzyme<word.length(); countNumInEnzyme++)
                              {
                                 //reading each character of word, i.e enzyme name and storing in variable analyzingEnzyme  
                                 char analyzingEnzyme = word.charAt(countNumInEnzyme);
                                 
                                 //if analyzingEnzyme has any digits on it
                                 if(Character.isDigit(analyzingEnzyme))
                                 {
                                    
                                    reduceFromNumber++;//adding the amount of number to be reduced from number variable if the enzyme has digit on it.
                                    
                                 }
                                 
                              } 
                              
                              String requiredNumber = numbers.substring(0,numbers.length()-reduceFromNumber); //then cutting the number to remove the number from enzyme
                              
                              outfile.printf("%1s%n",requiredNumber);//writing the required number in file
                              
                           }      
                           
                        }
                           
                        catch(StringIndexOutOfBoundsException exception)
                        {
                             
                        }   
                     }
                     
                  }
               }
               
               outfile.printf("%5s%2d%n%n","Number of cuts: ",counter);//writing the number of cuts in file
               stdin.close();//closing scanner
                   
            }
         }
         outfile.close();//closing outfile
      }
     
   }
     
  
}      
      
