package eight;

import java.util.Scanner;

public class Average {
	/**
	 * 
	 * @param args unused
	 * @throws Exception
	 * gets the marks of 10 student and print the average and handles all the exceptions
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int iterator = 0;
		int sum = 0;
//		loop for gettting 10 inputs
		while (iterator < 10) {
			try {
				System.out.println("Enter the " + (iterator + 1) + " student marks");
				int number = Integer.parseInt(sc.nextLine());
				sum += number;
				iterator++;
			} catch (NumberFormatException e) { // catching the number format Exception
				System.out.println("Enter an Integer");
//				System.out.println(e);
			}
		}
		System.out.println("Average of marks of 10 student is:" + sum / 10);
		sc.close();
	}
}
