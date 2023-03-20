package seven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class simpleCountingThread {
	/**
	 * 
	 * @param args unused
	 * printing numbers on every 1000 ms and printing the string on every 10th number
	 */
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		//thread from a thread pool is called
		executorService.execute(() -> {
			for (int i = 1; i <= 100; i++) {
				try {
				//making the thread to wait for 1000ms 
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println(i);
				//printing string for every 1000ms
				if (i % 10 == 0) {
					System.out.println("Count passed " + i);
				}
			}
		});
		executorService.shutdown();
	}
}
