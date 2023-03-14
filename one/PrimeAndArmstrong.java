package one;

import java.util.Scanner;

public class PrimeAndArmstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (isPrime(number)) {
			System.out.println(number + " " + "is prime ");
		} else {
			System.out.println(number + " " + "is not prime ");
		}
		if (isArmStrong(number)) {
			System.out.println("Yes ArmStrong Number");
		} else {
			System.out.println("No Armstrong Number");
		}
		if (isPerfectNumber(number)) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Non Perfect Number");
		}
		if (isPalindrome(number)) {
			System.out.println("Palindrome");
		} else {
			System.out.println(" not Palindrome");
		}
	}
//ArmStrong number 
	static boolean isArmStrong(int num) {
		int temp = num;
		int cube = 0;

		while (temp > 0) {
			int c = temp % 10;
			cube = cube + (int) (Math.pow(c, 3));
			temp = temp / 10;
		}
		if (cube == num) {
			return true;
		}
		return false;

	}
//Prime number 
	static boolean isPrime(int num) {
		if (num % 2 == 0) {
			return false;
		} else {
			for (int i = 3; i < num; i = i + 2) {
				if (num % i == 0)
					return false;

			}

			return true;
		}
	}
//PerfectNumber 
	static boolean isPerfectNumber(int num) {
		int a = num;
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == a)
			return true;
		else
			return false;

//		    	return true;
	}
//Palidrome 
	static boolean isPalindrome(int num) {
		int temp = num;
		int reverse = 0;
		while (temp > 0) {
			int c = temp % 10;
			reverse = (reverse * 10) + c;
			temp = temp / 10;
		}
		if (reverse == num) {
			return true;
		}

		return false;
	}

}
