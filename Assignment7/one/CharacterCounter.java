package one;

import java.util.Scanner;

public class CharacterCounter {
	public static void main(String[] args) {
		int count = 0;
		try (Scanner sc = new Scanner(System.in)) {
			String str;
			
			while (sc.hasNextLine()) {
				str = sc.nextLine();
				//spliting hte array
				String[] arr = str.split(" ");

				for (int i = 0; i < arr.length; i++) {
					//printing the length of each element in array
					count = count + arr[i].length();
				}
			}
		} finally {
			System.out.println(count);
		}
	}
}
