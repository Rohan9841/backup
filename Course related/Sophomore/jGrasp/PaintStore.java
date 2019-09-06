/*
Name: Rohan Maharjan

Course: CSCI 2003 42733

Instructor: Ms.Greer

File name: PaintStore.java

Program Description: This is a driver class which simulates a customer buying paint
                     to paint a room. The program will greet the customer and then
                     ask them for the paint color, number of walls, height of one
                     wall, and width of one wall. Then, the program will calculate 
                     and display the number of cans of paint needed and the total 
                     square feet of walls. Finally, it will calculate and display
                     the subtotal,tax and total.
                     

Date Assigned: Jan 31,2017

Date Due: Feb 7,2017      
*/


import java.util.Scanner; //importing Scanner class from util package 

public class PaintStore //defining class
{
   public static void main(String[] args) //defining main method
   {
      final double TAX = 0.11; //declaring a constant
      
      //creating an object for scanner class
      
      Scanner in = new Scanner(System.in);
      
      //displaying certain texts
      
      System.out.println("Welcome to the Paint Store!");
      System.out.println("===========================\n");
      
      System.out.println("Step 1: Choose your paint color");
      System.out.println("-------------------------------\n");
      
      //using pritf to format the texts and then display them
     
      System.out.printf("%5s %8s","purple","green\n");
      System.out.printf("%4s %9s","blue","teal\n");
      System.out.printf("%6s %5s","yellow","red");
      
      //asking user to input a paint color
      
      System.out.print("\n\nEnter a paint color: ");
      String color = in.nextLine();
      
      //displaying certain texts
      
      System.out.println("\n\nStep 2: Tell us about your room");
      System.out.println("-------------------------------");
      
      //asking user to enter the number of walls
     
      System.out.print("Enter the number of walls in the room: ");
      int walls = in.nextInt();
      
      //asking user to enter the height of one wall
      
      System.out.print("Enter the height of one wall: ");
      double height = in.nextDouble();
      
      //asking user to enter the width of one wall
      
      System.out.print("Enter the width of one wall: ");
      double width = in.nextDouble();
      
      //displaying certain texts
      
      System.out.println("\n\nStep 3: Paint needed");
      System.out.println("--------------------");
      
      //creating an object for Room class without argument constructor
      
      Room obj = new Room(); 
      
      //using set method to set the values entered by user to instance variables
      
      obj.setNumOfWalls(walls);
      obj.setHeight(height);
      obj.setWidth(width);  
      
      //using get method to get the area of room and storing it in variable 'area'
      
      double area = obj.getArea(); 
      
      /*using Math.ceil method to round the number of cans to next whole number and
      storing the value in variable 'cans'*/
      
      double cans = Math.ceil(area/250);  
      
      //calculating subtotal
      
      double subTotal = (cans*8.99);
      
      //calculating tax
      
      double tax = TAX*subTotal;
      
      //calculating total
      
      double total = subTotal+tax;
      
      //using printf to display certaing texts and numbers in a certain format
      
      System.out.printf("You need %1.0f cans of %3s paint to cover %5.1f sqft.",cans,color,area);
      
      System.out.println("\n\n\nStep 4: Final price");
      System.out.println("-------------------");
      System.out.printf("Subtotal: $%5.2f",subTotal);
      System.out.printf("\nTax:      $%4.2f",tax);
      System.out.printf("\nTotal:    $%5.2f",total);
      
      //displaying certain texts
      
      System.out.print("\n\nThank you for shopping with us!");
      
   }
}