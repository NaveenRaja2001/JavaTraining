package Factory;

import java.util.Scanner;

/**
 * 
 * @author naveenraja 
 * 					this class gets the input and pass on to the operating
 *         factory class . So that the object can be created based on the input
 */
public class MainFactory {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//creating the object og operatingFactory
		OperatingFactory operatingFactory = new OperatingFactory();
		// getting input
		BestPlayer obj = operatingFactory.getInstance(sc.next());
		obj.playerName();
	}
}
