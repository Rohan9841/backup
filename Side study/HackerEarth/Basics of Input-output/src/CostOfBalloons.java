import java.util.*;

public class CostOfBalloons {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numOfTest = in.nextInt();
		int[] minimum = new int[numOfTest];

		for (int i = 0; i < numOfTest; i++) {
			int greenCost = in.nextInt();
			int purpleCost = in.nextInt();
			int numOfUsers = in.nextInt();

			int firstQuestion = 0;
			int secondQuestion = 0;

			for (int j = 0; j < numOfUsers; j++) {
				firstQuestion += in.nextInt();
				secondQuestion += in.nextInt();
			}

			int result1 = firstQuestion * greenCost + secondQuestion * purpleCost;
			int result2 = firstQuestion * purpleCost + secondQuestion * greenCost;

			if (result1 < result2) {
				minimum[i] = result1;
			} else {
				minimum[i] = result2;
			}

		}
		for (int k = 0; k < minimum.length; k++) {
			System.out.println(minimum[k]);
		}

		in.close();
	}
}
