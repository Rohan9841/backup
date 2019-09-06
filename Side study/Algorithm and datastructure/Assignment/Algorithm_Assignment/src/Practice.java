/* IMPORTANT: Multiple classes and nested static classes are supported */


//  * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Practice {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        
        Scanner in = new Scanner(System.in);
        
      int T = in.nextInt();
      
      String vowels = "AEIOUaeiou";
      Set<Character> aSet = new HashSet<>();
      
      for(int i = 0; i<vowels.length();i++)
      {
    	  aSet.add(vowels.charAt(i));
      }
      
      for(int i = 0; i<T; i++)
      {
    	  int counter = 0;
    	  String str = in.next();
    	  
    	  for(int j = 0; j<str.length(); j++){
    		  char c = str.charAt(j);
    		  if(aSet.contains(c))
    		  {
    			  counter++;
    		  }
    	  }
    	  System.out.println(counter);
      }
        
    }
}
