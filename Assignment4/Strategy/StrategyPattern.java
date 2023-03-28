package strategy;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class StrategyPattern {
	/**
	 * This program demonstrates strategy pattern
	 * 
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, ClassNotFoundException {
		System.out.println("Chinese\nSouthIndian\nNorthIndian");
		System.out.println("Enter your option :");
		Scanner scan = new Scanner(System.in);
		String option = scan.nextLine();
		FamousFood food = (FamousFood) Class.forName("strategy." + option).getConstructor().newInstance();
		Context context = new Context(food);
		context.executeStrategy();
		scan.close();
	}
}
