package application;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Cafe smolCafe = new Cafe();
		boolean orderingFlag = false;
		Scanner scanner = new Scanner(System.in);

		// run a method that displays the greeting
		smolCafe.printGreeting();
		

		// run a method that takes user input in a loop
		orderingFlag = true;
		while (orderingFlag) {
			// run a method that displays the menu items
			smolCafe.printMenu();
			
			// User prompt
			System.out.println("Make a menu selection. You can add more things later.");
			String input = scanner.nextLine();
			
			// save current order, display items and total
			
			// prompt for next item or done
			
			// Ordering finished, break loop
			orderingFlag = false;
		}

		// run a method that totals the order items and displays them,

		// ... then confirms y/n

		// display some final text to represent giving the order to user
	}
}
