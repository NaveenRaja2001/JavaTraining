package one;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenAndOdd {
	/**
	 * 
	 * @param args unused creating the thread using executorservice and calling the
	 *             PrintEveNmAndOdd class to print even and odd numbers using to
	 *             different threads
	 */
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		// first Thread to print Odd number
		executorService.execute(() -> {
			PrintEvenAndOdd.printOdd();
		});
		// second Thread to print Even number
		executorService.execute(() -> {
			PrintEvenAndOdd.printEven();
		});
		// shutdown to prevent loss of memory
		executorService.shutdown();
	}
}

class PrintEvenAndOdd {
	/**
	 * print the odd number when the method is called
	 */
	synchronized static void printOdd() {
		System.out.println("Printing Odd number from 1 to 100");
		for (int i = 1; i < 100; i = i + 2) {
			System.out.println(i);
		}
	}

	/**
	 * print the even number when the method is called
	 */
	synchronized static void printEven() {
		System.out.println("Printing Even number from 1 to 100");
		for (int i = 2; i <= 100; i = i + 2) {
			System.out.println(i);
		}
	}
}