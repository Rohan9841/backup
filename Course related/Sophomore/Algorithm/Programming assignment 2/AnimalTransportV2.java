/*saved before editing

import java.util.*;
import java.io.*;

public class AnimalTransport 
{

   String fileToRead = "";
   String animal = "";
   String[] animalArray;
   Scanner in;
   File infile;
   int[][] array;
   int[] cellArray;
   int requiredCell = 0;
   
   Map<String, ArrayList> aMap;
   ArrayList<String> detailsInMap;
   
   public AnimalTransport(String fileName)
   {
      fileToRead = fileName;
      
      try
      {
         infile = new File(fileToRead);
         in = new Scanner(infile);
               
      }
      
      catch(FileNotFoundException exc)
      {
         System.out.print("File not found");
      }    
   }
   
   
   public int minContainers(String animals)
   {
      putInMap(animals);
      array = new int[animalArray.length][animalArray.length];
      cellArray = new int[animalArray.length];
      adjacencyMatrix();
      return(cellAssignAlgorithm(0));
   }
   
   public String getListing(String animals)
   {
      Map<Integer ,ArrayList> animalContainerMap = new HashMap<Integer, ArrayList>();
      
      ArrayList<String> animalInContainer;
      
      int numOfContainers = minContainers(animals);
      String result = "";
      
      for(int i = 1; i<=numOfContainers; i++)
      {
         animalInContainer = new ArrayList<String>();
         
         for(int j = 0; j<cellArray.length; j++)
         {
            if(cellArray[j] == i)
            {
               animalInContainer.add(animalArray[j]);
            } 
         }
         animalContainerMap.put(i,animalInContainer);
         result += "Container "+i+ " contains these animals: "+animalContainerMap.get(i)+".";
      }
      System.out.println();
      return result;
   }
   
   private int cellAssignAlgorithm(int animalIndex)
   {  
      boolean flag = true;
      int cellIndex = 1;
      
      while (flag && cellIndex<=animalArray.length)
      {
         if(isSafe(animalIndex,cellIndex))
         {
            flag = false;
            cellArray[animalIndex] = cellIndex;
            
            if((animalIndex+1)<animalArray.length)
            {  
               cellAssignAlgorithm(animalIndex+1);
            }

         }
         cellIndex++;
      }  
      
      requiredCell = cellArray[0];
               
      for(int i = 1; i<cellArray.length; i++)
      {
         if(cellArray[i] > requiredCell)
         {
            requiredCell = cellArray[i];
         }
      }

      return (requiredCell);
   }
   
   private boolean isSafe(int animal, int cell)
   {
      for (int compareAnimalWith = 0; compareAnimalWith<animalArray.length; compareAnimalWith++)
      {
         if(array[animal][compareAnimalWith] == 1 && cell == cellArray[compareAnimalWith])
         {
            return false;
         }
      }
      return true;
   }

   public void putInMap(String animals)
   {
      aMap = new HashMap<String, ArrayList>();
       
       try{
          infile = new File(fileToRead);
          in = new Scanner(infile);
          }
          
          catch(FileNotFoundException ex)
          {
            System.out.println("File not found");
          }
      
      animal = animals;
      animalArray = animal.split(",");
      
      while(in.hasNextLine())
      {
         String line = in.nextLine();      
         String[] lineBreakDown = line.split(","); 
         
         detailsInMap = new ArrayList<String>();  
         
         for(String each: animalArray)
         {                      
            if(lineBreakDown[0].equals(each))
            {
               detailsInMap.add(lineBreakDown[1]);
               detailsInMap.add(lineBreakDown[3]);
               
               aMap.put(each, detailsInMap);
            }
         } 
        
      }
       in.close();
   }
   
   public void adjacencyMatrix()
   {         
      for(int i = 0; i<animalArray.length; i++)
      {
         for(int j = 0; j<animalArray.length; j++)
         {  
            if((containsCarnivore(i) && containsHerbivore(j)) ||(containsCarnivore(j) && containsHerbivore(i)))
            {
               if(!(conservationStatus(i).equals("do") && conservationStatus(j).equals("do")))
               {
                  array[i][j] = 1;
               } 
            }
            
            else if(conservationStatus(i).equals("en") || conservationStatus(j).equals("en"))
            {
               array[i][j] = 1;
            }
            
            else if (((conservationStatus(i).equals("nt")|| conservationStatus(i).equals("vu")) && containsCarnivore(j)) || containsCarnivore(i) && (conservationStatus(j).equals("nt")|| conservationStatus(j).equals("vu")))
            {
               array[i][j] = 1;
            }
         }
      }
   
   }
   public boolean containsCarnivore(int a)
   {    
        if((aMap.get(animalArray[a]).contains("carnivore")))
         {
            return true;
         }
      
      return false;
   }
      
   private boolean containsHerbivore(int a)
   {
      if(aMap.get(animalArray[a]).contains("herbivore"))
      {
         return true;
      }
      return false;
   }
      
   private String conservationStatus(int b)
   {
      if(aMap.get(animalArray[b]).contains("do"))
      {
         return "do";
      }
         
      else if(aMap.get(animalArray[b]).contains("nt"))
      {
         return "nt";
      }
         
      else if(aMap.get(animalArray[b]).contains("vu"))
      {
         return "vu";
      }
      
      else if (aMap.get(animalArray[b]).contains("en"))
      {
         return "en";
      }
      else
      {
         return ("not assigned");
      }
   }

}