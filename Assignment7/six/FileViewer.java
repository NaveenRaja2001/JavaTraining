package six;


import java.io.File;

import java.util.Scanner;

public class FileViewer {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			//Creating the file object
			File file = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/six/Demo.txt");
			sc = new Scanner(file);
		
			while (sc.hasNextLine()) {
				//printing the content
				String content = sc.nextLine();
				System.out.println(content);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sc.close();
		}

	}
}
