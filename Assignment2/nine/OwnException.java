package nine;

import java.util.Scanner;

public class OwnException {
	/**
	 * get the mark of 10 student and print the average and exception are handled
	 * 
	 * @param args unused
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int iterator = 0;
		int sum = 0;
//loop for getting 10 inputs 
		while (iterator < 10) {
			try {
				System.out.println("Enter the " + (iterator + 1) + " student marks");
				int number = Integer.parseInt(sc.next());
				if (number < 0) {
//throwing negativeValue Exception 
					throw new NegativeValue("Number is NegativeValue ");
				}
				if (number > 100) {
//throwing OutofRangeException 
					throw new OutofRangeException("Number is OutofRange");
				}
				sum += number;
				iterator++;
			} catch (NumberFormatException e) {
				System.out.println("Enter an Integer");
//System.out.println(e);
			} catch (OutofRangeException e) {
				System.out.println(e.getMessage());
			} catch (NegativeValue e) {
				System.out.println(e.getMessage());
			}

		}
		System.out.println("Average of marks of 10 students is:" + sum / 10);
		sc.close();
	}
}
/**
 * class handle the out of range exception. Range(0-100)
 *
 */
class OutofRangeException extends Exception {
	public OutofRangeException(String str) {
		super(str);
	}
}
/**
 * class handle the negative value exception. value<0
 *
 */
class NegativeValue extends Exception {
	public NegativeValue(String str) {
		super(str);
	}
}