package factory;

import java.util.Scanner;

/**
 * this program demonstrates factory pattern
 * 
 * @author naveenraja
 * 
 */
public class MainFactory {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// creating the object og operatingFactory
		OperatingFactory operatingFactory = new OperatingFactory();
		// getting input
		BestPlayer bestPlayer = operatingFactory.getInstance(scan.next());
		bestPlayer.playerName();
		scan.close();
	}
}
