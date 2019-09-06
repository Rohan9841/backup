public class RoomTester
{
   public static void main(String[] args)
   {  
   
      Room obj1 = new Room(3,10.0,15.0);
      
      System.out.println("TESTING ARGUMENT CONSTRUCTOR");
      System.out.println("----------------------------\n");
      
      System.out.println(obj1.getNumOfWalls());
      System.out.println("Expected: 3\n");
      
      System.out.println(obj1.getHeight());
      System.out.println("Expected: 10.0\n");
      
      System.out.println(obj1.getWidth());
      System.out.println("Expected: 15.0\n");
      
      System.out.println("TESTING toString Method");
      System.out.println("-----------------------");
      
      System.out.println(obj1.toString());
      
      Room obj2 = new Room();
      
      obj2.setNumOfWalls(5);
      obj2.setHeight(8.0);
      obj2.setWidth(11.0);
      
      System.out.println("\nTESTING NO-ARGUMENT CONSTRUCTOR");
      System.out.println("-------------------------------\n");
      
      System.out.println(obj2.getNumOfWalls());
      System.out.println("Expected: 5\n");
      
      System.out.println(obj2.getHeight());
      System.out.println("Expected: 8.0\n");
      
      System.out.println(obj2.getWidth());
      System.out.println("Expected: 11.0\n");
      
      System.out.println("Testing toString Method");
      System.out.println("-----------------------");
      
      System.out.println(obj2.toString());
   }
}      