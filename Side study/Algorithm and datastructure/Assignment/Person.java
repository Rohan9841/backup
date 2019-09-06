
import java.util.ArrayList;
import java.util.Stack;

public class Person {
	
	
	//instance
	private ArrayList<Character> hate;
	private ArrayList<Character> love;
	
	public Person(ArrayList<Character> yum, ArrayList<Character> eww) {
		this.love = yum;
		this.hate = eww;
	}
	
	//tells if this person will be satisfied with a pizza
	public boolean okay(Stack<Character> aPizza) {
		
		for(int i=0; i<aPizza.size(); i++) {
			if (hate.contains(aPizza.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	
	////is he satisfied by the final pizza
	public boolean isSatified(Stack<Character> pizza) {

			for(int i=0; i<pizza.size(); i++) {
				if(hate.contains(pizza.get(i))) {
					return false;
				}
				else if(love.isEmpty()) {
					return true;
				}
				
				else if((love.contains(pizza.get(i))) ) {
					return true;
				}
			}	
			return	false;
	}
}
