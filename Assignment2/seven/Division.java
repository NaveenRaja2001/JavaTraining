package seven;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Give the numerator");
				String str1 = sc.nextLine();
				if (str1.startsWith("q") || str1.startsWith("Q")) {
					System.out.println("Program is terminated");
					
					break;
				}
				
				int numerator = Integer.parseInt(str1);
				System.out.println("Give the divisor44");
				String str2 = sc.nextLine();
				
				int divisor = Integer.parseInt(str2);
				int answer = numerator / divisor;

				System.out.println("Answer is " + answer);
			} catch (Exception e) {
				System.out.println("Error is " + e);
			}
		}
		sc.close();
		
	}
}
