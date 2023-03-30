package two;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Message {
	/**
	 * 
	 * @param srgs unused create four thread and divide the string into four parts
	 *             and print them using four individual threads
	 */
	public static void main(String[] srgs) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		int strSize = string.length();
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		// first thread
		executorService.execute(() -> {
			printMessage(string, 0, strSize / 4);
		});
		// second thread
		executorService.execute(() -> {
			printMessage(string, strSize / 4, strSize / 2);
		});
		// third thread
		executorService.execute(() -> {
			printMessage(string, strSize / 2, strSize / 2 + strSize / 4);
		});
		// fourth thread
		executorService.execute(() -> {
			printMessage(string, strSize / 2 + strSize / 4, strSize);
		});
		// closing the thread to prevent loss of memory
		executorService.shutdown();
	}

	/**
	 * 
	 * @param str        string pass to print using four different thread
	 * @param startIndex used to start index of substring for individual thread
	 * @param endIndex   used to end index of substring for individual thread
	 */
	synchronized static void printMessage(String str, int startIndex, int endIndex) {
		System.out.print(" " + str.substring(startIndex, endIndex));
	}
}
