package six;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileViewer {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/six/Demo.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String content = sc.nextLine();
			System.out.println(content);
		}
		sc.close();
	}
}
