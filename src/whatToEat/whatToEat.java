package whatToEat;

import java.util.Scanner;

public class whatToEat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* What To Eat
		 * by Alex Nouhan
		 * 2019-03
		 * Grand Circus Java Bootcamp
		 */
		
		//Declare variables
		
		int eventType;
		int partySize;
		String event = "-";
		String meal = "-";
		String prep = "-";
		String result = "-";
		
		//Get event type from user
		
		System.out.println("Welcome to the party planner!");
		System.out.print("Enter 0 for casual, 1 for semi-formal, or 2 for formal: ");
		
		eventType = sc.nextInt();
		
		//Get party size from user
		
		System.out.print("How many guests?: ");
		
		partySize = sc.nextInt();
		
		//Branches
		
		if (eventType == 0) {
			event = "casual";
			meal = "sandwiches";
		} else if (eventType == 1) {
			event = "semi-formal";
			meal = "fried chicken";
		} else if (eventType == 2) {
			event = "formal";
			meal = "chicken parmesan";
		}
		
		if (partySize == 1) {
			prep = "in the microwave";
		} else if (partySize < 13) {
			prep = "in your kitchen";
		} else {
			prep = "by a caterer";
		}
		
		
		//Print result
		
		result = "Since you’re hosting a " + event + " event for " + partySize +
		" participants, you should serve " + meal + " prepared " + prep + ".";
		
		System.out.println("");
		System.out.println(result);
	}

}
