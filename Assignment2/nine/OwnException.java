package nine;

import java.util.Scanner;

public class OwnException {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int iterator = 0;
		int sum = 0;
		while (iterator < 10) {
			try {
				System.out.println("Enter the "+(iterator+1)+" student marks" );
				int number = Integer.parseInt(sc.nextLine());
				if(number<0) {
					throw new NegativeValue("Number is NegativeValue 12");
				}
				if(number>100) {
					throw new OutofRangeException("Number is OutofRange");
				}
				sum += number;
				iterator++;
			} catch (NumberFormatException e) {
				System.out.println("Enter an Integer");
//				System.out.println(e);
			}
			catch(OutofRangeException e) {
				System.out.println(e.getMessage());
			}
			catch(NegativeValue e) {
				System.out.println(e.getMessage());
			}
			
		}
		System.out.println("Average of marks of 10 students is:" + sum / 10);
		sc.close();
	}
}

class OutofRangeException extends Exception{
	 public OutofRangeException(String str) {
		 super(str);
	 }
}
class NegativeValue extends Exception{
	 public NegativeValue(String str) {
		 super(str);
	 }
}