import java.util.*;

class TestClass {
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
    
    int N = in.nextInt();
    int M = in.nextInt();
    
    ArrayList<Integer>[] arr = new ArrayList[N+1];
    
    for(int i = 1; i<=M; i++){
        int A = in.nextInt();
        int B = in.nextInt();
        arr[A].add(B);
        arr[B].add(A);
    }
    
    int Q = in.nextInt();
    for(int i = 0;i<Q;i++){
        int A = in.nextInt();
        int B = in.nextInt();
        
        if(arr[A].contains(B)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    }
}