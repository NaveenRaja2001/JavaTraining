package two;

import java.util.Scanner;
/**
 * 
 * @author naveenraja
 * This program count the number of words
 */
public class WordCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		//spliting the line into words and storing them in array
		String stringArr[] = sc.nextLine().split(" ");
		//Print the number of words
		System.out.println(stringArr.length);
		sc.close();
	}
}
