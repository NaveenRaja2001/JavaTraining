package one;

import java.util.Scanner;

public class CharacterCounter{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str;
			int count = 0;
			while (sc.hasNextLine()) {
				str = sc.nextLine();
				String[] arr = str.split(" ");

				for (int i = 0; i < arr.length; i++) {
					count = count + arr[i].length();
				}

			}
			System.out.println(count);
		}
		//finally

	}
}
