public class test
{  
  public static void main(String[] args) 
  {
            AnimalTransport obj = new AnimalTransport("iwmo1.csv");
            String test1 = "Cheetah,Dog,Vesper mouse,Roe deer,Cow";
            String test2 = "Owl monkey,Mountain beaver,Vesper mouse,Three-toed sloth";

            System.out.println(obj.minContainers(test1)); 
            System.out.println(obj.minContainers(test2));
            
            
                                 


            
            
            
            
   }
}