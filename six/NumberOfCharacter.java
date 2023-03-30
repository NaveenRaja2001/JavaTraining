package six;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

public class NumberOfCharacter {
	/**
	 * 
	 * @param args unused
	 * @throws NotAlphabetException gets the input and throws an exception is the
	 *                              input is not a character
	 */
	public static void main(String[] args) throws NotAlphabetException {
		Scanner sc = new Scanner(System.in);
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.execute(() -> {

			int count = 0;
			while (true) {
				System.out.println("Enter the Character");
				char character = sc.next().charAt(0);
			
				try {
					System.out.println();
					//checking character or not
					if (!Character.isLetter(character)) {
						//thowing exception if not character
						throw new NotAlphabetException(character + " is a Non Alphabetic Character");
					}
					count++;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					//printing the count
					System.out.println("count of the character is " + count);
					break;
				}
			}
		});
		executorService.shutdown();
	}
}

class NotAlphabetException extends Exception {
	public NotAlphabetException(String str) {
		super(str);
	}
}
