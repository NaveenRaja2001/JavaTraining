package four;

import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author naveenraja This program show List of files and directories name
 */
public class ListFilesAndDirectories {
	public static void main(String[] args) {
		// creating the file object

		try (Scanner sc = new Scanner(System.in)) {
			String fileName = sc.nextLine();
			// storing the list of file in an array
//      /Users/naveenraja/eclipse-workspace/Assignment7/src
			File directory = new File(fileName);
			

			// diff file and directory
			File[] arrList = directory.listFiles();
			// printing the file name
			for (int i = 0; i < arrList.length; i++) {
				System.out.println(arrList[i].getName());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
