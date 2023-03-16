package one;

import java.util.Scanner;

/**
 * 
 * @author naveenraja
 * 
 */
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
		sc.close();
	}

	/**
	 * checks where number is ArmStrong Number
	 * 
	 * @param num used to check whether the number is Armstrong or not
	 * @return boolean
	 */
	public static boolean isArmStrong(int num) {
		int numcopy = num;
		int sum = 0;

		int digits = (int) (Math.log10(num) + 1);
		while (numcopy > 0) {
			int temp = numcopy % 10;
			sum = sum + (int) (Math.pow(temp, digits));
			numcopy = numcopy / 10;
		}
		if (sum == num) {
			return true;
		}
		return false;

	}

	/**
	 * checks where number is Prime or not
	 * 
	 * @param num used to check whether the number is Prime or not
	 * @return boolean
	 */
	public static boolean isPrime(int num) {
		if (num % 2 == 0) {
			return false;
		} else {
			for (int i = 3; i < num / 2; i = i + 2) {
				if (num % i == 0)
					return false;

			}

			return true;
		}
	}

	/**
	 * checks where number is PerfectNumber
	 * 
	 * @param num used to check whether the number is PerfectNumber or not
	 * @return boolean
	 */
	public static boolean isPerfectNumber(int num) {
		int numbercopy = num;
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
				System.out.println(sum);
			}
		}
		if (sum == numbercopy)
			return true;
		else
			return false;

	}

	/**
	 * checks where number is Palindrome
	 * 
	 * @param num used to check whether the number is Palindrome or not
	 * @return boolean
	 */
	public static boolean isPalindrome(int num) {
		int temp = num;
		int reverse = 0;
		while (temp > 0) {
			int lastdigit = temp % 10;
			reverse = (reverse * 10) + lastdigit;
			temp = temp / 10;
		}
		if (reverse == num) {
			return true;
		}

		return false;
	}

}
