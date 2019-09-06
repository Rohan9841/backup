/**
   Main program to test the basic functionality of the Toppings class.
*/
public class ToppingsTest{
   
	public static void main(String [] args){
    
		Toppings pizza1 = new Toppings("src/requests1.txt");
		System.out.println("SATISFIED? " + pizza1.canBeSatisfied());
		System.out.println("TOPPINGS: " + pizza1.getToppings());   // EXPECTED: "BHOP"
      
//      Toppings pizza2 = new Toppings("requests2.txt");     
//      System.out.println("SATISFIED? " + pizza2.canBeSatisfied());
//      System.out.println("TOPPINGS: " + pizza2.getToppings());    // EXPECTED: "NO PIZZA!!"
   }
}
