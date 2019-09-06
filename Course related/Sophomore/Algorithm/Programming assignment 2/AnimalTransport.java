/*
   importing java packages
*/

import java.util.*;
import java.io.*;

/**
   *The AnimalTransport class contains various methods that will allow the driver program
   *to get minimum number of containers required to transport animals of different categories
   *at a time. It also has a method that provides names of every animals inside each containers 
*/

public class AnimalTransport 
{
   /**
      instance variable to store file that is to be read
   **/
   private String fileToRead = "";
   
   /**
      instance variable that stores a string of names of animals
   **/
   private String animal = "";
   
   /**
      instance variable that stores the animal names in an array
   **/
   private String[] animalArray;
   
   /**
      instance variable that stores adjacency matrix in a two-dimensional array
   **/
   private int[][] array;
   
   /**
      instance variable that stores the container number for a specific animal in an array
   **/
   private int[] cellArray;
   
   /**
      Declaring a Map of key type: String and Value type: ArrayList
   **/
   private Map<String, ArrayList> aMap;
   
   /**
      Argument constructor that will scan through the file passed as its argument .
      @param fileName This is the name of the file from which we can get our data. 
   **/ 
   public AnimalTransport(String fileName)
   {
      fileToRead = fileName;
      
      //Scanning through the file, however, it does nothing. Scanning just to fulfull technical requirement of this constructor as instructed by the programming assignment.
      try
      {
         File file = new File(fileToRead);
         Scanner stdin = new Scanner(file);
               
      }
      
      catch(FileNotFoundException exc)
      {
         System.out.print("File not found");
      }    
   }
   
   /**
      Method to return the minimum number of containers needed to transport the animals
      in the string passed as argument.
      @param animals The name of animals that needs to be put in containers.
      @return The minimum number of containers required to transport all the animals in the 'animals' string.
   **/

   public int minContainers(String animals)
   {
      putInMap(animals); //calling this method first to scan through the given file.
      array = new int[animalArray.length][animalArray.length]; //Initializing the 2D array with length of rows and columns equal to the length of 'animalArray'. 
      cellArray = new int[animalArray.length]; //Initializing the array with the length equal to the length of 'animalArray'.
      adjacencyMatrix();//calling this method to form the adjacency matrix.
      return(cellAssignAlgorithm(0));//calling this method to get the minimum number of containers required.
   }
   
   /**
      Method to return a sample transport listing that uses the minimum number of containers needed
      to transport the animals in the string passed as argument.
      @param animals The name of animals that needs to be put in containers.
      @return The container number followed by the list of animals in that container.
   **/
   public String getListing(String animals)
   {
      //Declaring a new map to store container numbers as keys and list of animals in that container as values.
      Map<Integer ,ArrayList> animalContainerMap = new HashMap<Integer, ArrayList>();
      
      //Declaring an ArrayList which stores the name of animals in a specific container.
      ArrayList<String> animalInContainer;
      
      //Storing the minimum number of containers in the variable 'numOfContainers'.
      int numOfContainers = minContainers(animals);
      
      String result = "";
      
      //Looping through all the containers.
      for(int i = 1; i<=numOfContainers; i++)
      {
         animalInContainer = new ArrayList<String>();
         
         //Looping through all the animals in the cellArray.
         for(int j = 0; j<cellArray.length; j++)
         {
            if(cellArray[j] == i)
            {
               animalInContainer.add(animalArray[j]);
            } 
         }
         
         //putting the container number as key and the animal list as value.
         animalContainerMap.put(i,animalInContainer);
         
         result += "\nContainer "+i+ " contains these animals: "+animalContainerMap.get(i)+".";
      }
      return result;
   }
   
   /*-------------------------------HELPER METHODS FROM HERE ON-------------------------------*/
   
   /**
      Method that puts each animal to its cell using the graph coloring algorithm, and returns the gretest cell number.
      @param animalIndex The index of animal in the animalArray.
      @return The minimum number of containers required to put all animals starting from the parameter index to the end of the animalArray. 
   **/
   private int cellAssignAlgorithm(int animalIndex)
   {  
      boolean flag = true;
      int cellIndex = 1;
      int requiredCell = 0;
      
      while (flag && cellIndex<=animalArray.length)
      {
         if(isSafe(animalIndex,cellIndex)) //If the animal is safe in the cell.
         {
            flag = false;
            cellArray[animalIndex] = cellIndex;
            
            if((animalIndex+1)<animalArray.length) //If there are animals still left in the animalArray. 
            {  
               cellAssignAlgorithm(animalIndex+1); //Solve recursively.
            }
         
         }
         cellIndex++;
      }  
      
      requiredCell = cellArray[0];//requiredCell is always set to 1 (cellArray[0] = 1). 
               
      for(int i = 1; i<cellArray.length; i++)//Looping through all the animals in the cellArray.
      {
         if(cellArray[i] > requiredCell) 
         {
            requiredCell = cellArray[i];
         }
      }
   
      return (requiredCell);
   }
   
   /**
      Method to decide if an animal is safe in a particular cell.
      @param animal The index of animal in the animalArray.
      @param cell The cell number used to compare with the actual container number in the cellArray .
      @return True if the condition is not passed, false if passed. 
   **/

   private boolean isSafe(int animal, int cell)
   {
      for (int comparedAnimalIndex = 0; comparedAnimalIndex<animalArray.length; comparedAnimalIndex++) //compareAnimalIndex represents the animal in the augmented matrix with which the parameter animal is compared.
      {
         if(array[animal][comparedAnimalIndex] == 1 && cell == cellArray[comparedAnimalIndex])//If the animals can't be placed together and the cell is already filled with animals with safe properties.
         {
            return false;
         }
      }
      return true;
   }
   
   /**
      Method to scan through the given file and put the animals from the string argument into a map.
      @param animals The string that contains names of animals which are to be placed in the map.
   **/

   private void putInMap(String animals)
   {
      animal = animals;
      animalArray = animal.split(",");//storing all the elements of 'animal' variable in animalArray.
   
      aMap = new HashMap<String, ArrayList>();//creating a new HashMap.
      ArrayList<String> detailsInMap; //Declaring an array list.
      
      try{
         File infile = new File(fileToRead);
         Scanner in = new Scanner(infile);
             
         while(in.hasNextLine())
         {
            String line = in.nextLine();      
            String[] lineBreakDown = line.split(",");  //breaking each line and storing its elements in an array
               
            for(String each: animalArray)
            {                      
               if(lineBreakDown[0].equals(each))//if the first element (which is always name) matches the names in animalArray
               {
                  detailsInMap = new ArrayList<String>(); //creates new arraylist.
                     
                  detailsInMap.add(lineBreakDown[1]);
                  detailsInMap.add(lineBreakDown[3]);
                     
                  aMap.put(each, detailsInMap);//Populate the map with the animals in the animalArray as key, and the elements in the arraylist as value.
               }
            } 
              
         }
         in.close();//closing Scanner
      }
          
      catch(FileNotFoundException ex)
      {
         System.out.println("File not found");
      }
   }
   
    /**
      Method to create an adjacency matrix of 0's and 1's.
   **/
   private void adjacencyMatrix()
   {         
      for(int i = 0; i<animalArray.length; i++)//Looping through rows of the 2D array
      {
         for(int j = 0; j<animalArray.length; j++)//Looping through colums of the 2D array
         {  
            //Conditions for setting '1' in specific postions.
            
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
   
    /**
      Method to determine if an animal is a carnivore
      @param a This is the index of an animal in the animalArray which is used as a key in the map named 'aMap'.
      @returns True if the animal is Carnivore, and False if it is not.
   **/
   private boolean containsCarnivore(int a)
   {    
      if((aMap.get(animalArray[a]).contains("carnivore"))) //if the animal is a carnivore
      {
         return true;
      }
      
      return false;
   }
    
   /**
      Method to determine if an animal is a herbivore 
      @param a This is the index of an animal in the animalArray which is used as a key in the map named 'aMap'.
      @returns True if the animal is herbivore, and False if it is not.
   **/ 
   private boolean containsHerbivore(int c)
   {
      if(aMap.get(animalArray[c]).contains("herbivore"))//if the animal is a herbivore
      {
         return true;
      }
      return false;
   }
   
   
   /**
      Method to find the conservation status of an animal
      @param b This is the index of an animal in the animalArray which is used as a key in the map named 'aMap'.
      @returns The conservation statuse of an animal 
   **/   
   private String conservationStatus(int b)
   {
      if(aMap.get(animalArray[b]).contains("do"))//if the animal is domesticated
      {
         return "do";
      }
         
      else if(aMap.get(animalArray[b]).contains("nt"))//if the animal is nearly threatened
      {
         return "nt";
      }
         
      else if(aMap.get(animalArray[b]).contains("vu"))//if the animal is vulnerable
      {
         return "vu";
      }
      
      else if (aMap.get(animalArray[b]).contains("en"))//if the animal is endangered
      {
         return "en";
      }
      else
      {
         return ("not assigned");//Other statuses are not required in the conditions for placing an animal in a container so just return 'not assigned'. 
      }
   }

}