package eight;

import java.util.Scanner;


public class Average{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int iterator = 0;
		int sum = 0;
		while (iterator < 10) {
			try {
				System.out.println("Enter the "+(iterator+1)+" student marks" );
				int number = Integer.parseInt(sc.nextLine());
				sum += number;
				iterator++;
			} catch (NumberFormatException e) {
				System.out.println("Enter an Integer");
//				System.out.println(e);
			}
		}
		System.out.println("Average of marks of 10 students is:" + sum / 10);
		sc.close();
	}
}
