/**
   This class simulates a dog with size and coat length attributes.
*/
public class Dog
{
   //Instance Variables
   private String size;
   private String coatLength;
   
   /**
      Creates a dog without specifying size and coat length.
   */
   public Dog()
   {
      size = "";
      coatLength = "";
   }
   
   /**
      Creates a dog with specific size and coat length.
      @param s the size of the dog
      @param c the length of the dog's coat
   */
   public Dog(String s, String c) 
   {
      size = s;
      coatLength = c;
   }
   
   /**
      Sets the size of the dog.
      @param s the size of the dog
   */
   public void setSize(String s)
   {
      size = s; 
   }
   
   /**
      Sets the length of the coat.
      @param c the length of the dog's coat
   */
   public void setCoatLen(String c)
   {
      coatLength = c;
   }
   
   /**
      Gets the size of the dog.
      @return the size of the dog
   */  
   public String getSize()
   {  
      return size;
   }
   
   /**
      Gets the length of the coat.
      @return the length of the dog's coat
   */   
   public String getCoatLen()
   {  
      return coatLength;
   }
   
   
   /**
      Determines the breed of the dog based on size and coat.
      @return the breed of the dog
   */
   public String getBreed()
   {  
      if(size.equals("Small") && coatLength.equals("Short"))
      {
         return "Pug";
      }
      
      else if(size.equals("Small") && coatLength.equals("Medium"))
      {
         return "Shiba Inu";
      }
      
      else if(size.equals("Small") && coatLength.equals("Long"))
      {
         return "Cocker Spaniel";
      }
      
      else if(size.equals("Medium") && coatLength.equals("Short"))
      {
         return "Basset Hound";
      }
      
      else if(size.equals("Medium") && coatLength.equals("Medium"))
      {
         return "Gordon Setter";
      }
      
      else if(size.equals("Medium") && coatLength.equals("Long"))
      {
         return "Irish Setter";
      } 
      
      else if(size.equals("Large") && coatLength.equals("Short"))
      {
         return "Weimaraner";
      }
      
      else if(size.equals("Large") && coatLength.equals("Medium"))
      {
         return "Goldendoodle";
      }
      
      else
      {
         return "Belgian Sheepdog";
      }   
   }
}

