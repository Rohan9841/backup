/**
 * 
 */

/**
 * @author bijay
 *
 */

import java.util.Scanner;

import java.util.Stack;


import java.io.File;

import java.util.ArrayList;

public class Toppings {

	private ArrayList<Person> students;
	public ArrayList<Character> toppingChoices;
	private Stack<Character> addedtoppings;

	public Toppings(String dataFile) {
		students = new ArrayList<Person>(20);
		toppingChoices = new ArrayList<Character>(16);
		addedtoppings = new Stack<Character>();
		toppingChoices.add('A');
		toppingChoices.add('B');
		toppingChoices.add('C');
		toppingChoices.add('D');
		toppingChoices.add('E');
		toppingChoices.add('F');
		toppingChoices.add('G');
		toppingChoices.add('H');
		toppingChoices.add('I');
		toppingChoices.add('J');
		toppingChoices.add('K');
		toppingChoices.add('L');
		toppingChoices.add('M');
		toppingChoices.add('N');
		toppingChoices.add('O');
		toppingChoices.add('P');

		Scanner scan = null;

		try {
			File file = new File(dataFile);
			scan = new Scanner(file);

			while (scan.hasNextLine()) {

				String line = scan.nextLine();
				ArrayList<Character> yum = new ArrayList<Character>();
				ArrayList<Character> eww = new ArrayList<Character>();
				for (int i = 0; i < line.length(); i = i + 2) {
					if (line.charAt(i) == '+')
						yum.add(line.charAt(i + 1));

					else
						eww.add(line.charAt(i + 1));
				}
				students.add(new Person(yum, eww));
			}
		}

		/**
		 * @exception e3 If any other error exists.
		 */
		catch (Exception e3) {
			System.err.println("Errors detected!!! Please, check the file again.");
			System.err.println("Message: " + e3.getMessage());
			scan.close();
		}
	}

	
	
	
	//////////////////
	public boolean promising(Stack<Character> pizzaSoFar) {

		for (int i = 0; i < students.size(); i++) {
			if (!students.get(i).okay(pizzaSoFar)) {
				return false;
			}
		}
		return true;
	}

	
	private boolean isSolution(Stack<Character> pizzaSoFar) {

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).isSatified(pizzaSoFar) == false) {
				return false;
			}
		}
		return true;
	}

	
	
	private void solvePizza(int index) {

		Stack<Character> soFar = new Stack<Character>();		
	if(index <= 15)
	{
		if(promising(soFar)){
			
			if(isSolution(soFar)) {
				addedtoppings = soFar;
			}
			else
			{
				solvePizza(index+1);
			}
		}
	}		
	soFar.add(toppingChoices.get(index-1));
	}
	

	public boolean canBeSatisfied() {
		solvePizza(0);

		if (!addedtoppings.isEmpty()) {
			return true;
		}
		return false;
	}

	public String getToppings() {
		if (!addedtoppings.isEmpty()) {
			return addedtoppings.toString();
		}
		return "NO PIZZA";
	}

}