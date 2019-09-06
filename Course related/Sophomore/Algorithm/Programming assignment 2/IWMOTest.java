/**  
   Program to test basic functionality of the AnimalTransport class.
*/

public class IWMOTest
{
   public static void main(String [] args)
   {
      AnimalTransport problem = new AnimalTransport("iwmo1.csv");
      
      String test1 = "Cheetah,Dog,Vesper mouse,Roe deer,Cow";
      System.out.print("\nTransport requires " + problem.minContainers(test1) + " containers:");
      System.out.println(problem.getListing(test1));
      /* Expectations: 2 containers (one with cheetah, dog, and vesper mouse)        */
      
      String test2 = "Owl monkey,Mountain beaver,Vesper mouse,Three-toed sloth";
      System.out.print("\nTransport requires " + problem.minContainers(test2) + " containers:");
      System.out.println(problem.getListing(test2)); 
      /* Expectations: 1 container carrying all four animals                        */
   }   
}
