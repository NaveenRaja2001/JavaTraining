package three;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Inventory {
	/**
	 * 
	 * @param args unused creating the two threads and calling the consumer to
	 *             consume and producer to produce
	 */
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		ConsumerAndProducer obj = new ConsumerAndProducer();
		// thread one
		executorService.execute(() -> {
			obj.produce();
			obj.produce();
		});
		// thread two
		executorService.execute(() -> {
			obj.consume();
			obj.consume();
		});

	}
}

class ConsumerAndProducer {
	int item = 0;

	/**
	 * when this method is called producer produces the item
	 */
	synchronized public void produce() {

		if (item == 1) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		System.out.println("Item produced");
		// increase the item when the item is produces
		item++;
		System.out.println("Item count in Inventory is" + item);
		notify();
	}

	/**
	 * when this method is called consumer produces the consumes
	 */
	synchronized public void consume() {
		// consumer is called when the item count is zero
		if (item == 0) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("Item consumed");
		// decrease the item when the item is consumed
		item--;
		System.out.println("Item count in Inventory is" + item);
		notify();
	}
}