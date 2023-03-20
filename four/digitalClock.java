package four;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class digitalClock {
	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		calculateTime obj = new calculateTime();
		executorService.execute(() -> {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {

				}
				obj.calculateSecond();

			}
		});
		executorService.execute(() -> {
			while (true) {

				obj.calculateMinute();
			}
		});
		executorService.execute(() -> {
			while (true) {

				obj.calculateHour();

			}
		});
		executorService.shutdown();
	}


}

class calculateTime {
	int second;
	int minute;
	int hour=0;

	public calculateTime() {
		LocalTime time = LocalTime.now();
		this.second = time.getSecond();
		this.minute = time.getMinute();
		this.hour = time.getHour();

	}

	synchronized void calculateSecond() {
		if(second<60) {
			second++;
		
		if(second==60) {	
			
			notify();
		}
		else {
			this.display();
		}

		}
		
		
	}

	synchronized void calculateMinute() {
		
		if (minute < 60 && second == 60) {
			minute++;
			
			if (minute == 60) {
				notify();
			}
			else {
				second=0;
				this.display();
			}
		}
		

	}
//
	synchronized void calculateHour() {
		
			
			if (second==60 && minute == 60) {
				second=0;
				minute=0;
				
				hour=(hour++)%24;
				notify();
				this.display();
			}
	}

	void display() {
		System.out.println(second + "   " + minute + "  " + hour);
	}

}
