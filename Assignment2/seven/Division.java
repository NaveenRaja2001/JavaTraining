package seven;

import java.util.Scanner;

public class Division {
	/**
	 * 
	 * @param args unused calculate the dividend till the break condition is
	 *             satified and exceptions are handled3
	 * 
	 */
	public static void main(String[] args) {
		String stringNumerator = "";
		try (Scanner sc = new Scanner(System.in)) {
			while (!stringNumerator.equals("q")) {

				System.out.println("Give the numerator");
				// getting the first input- numerator
				stringNumerator = sc.next();
				// if conditions to stop the program
				if (stringNumerator.startsWith("q") || stringNumerator.startsWith("Q")) {
					System.out.println("Program is terminated");
					break;
				}
				int numerator = Integer.parseInt(stringNumerator);
				System.out.println("Give the divisor");
				// getting the second input- divisor
				int divisor = Integer.parseInt(sc.next());
				int answer = numerator / divisor;

				System.out.println("Answer is " + answer);

			}
		} catch (Exception e) {
			System.out.println("Error is " + e);
		}
	}
}
