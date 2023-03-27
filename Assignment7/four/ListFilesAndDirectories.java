package four;

import java.io.File;

/**
 * 
 * @author naveenraja This program show List of files and directories name
 */
public class ListFilesAndDirectories {
	public static void main(String[] args) {
		// creating the file object
		
		//path command line
		File directory = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src");
		// storing hte list of file in an array

		// diff file and directory
		File[] arrList = directory.listFiles();
		// printing the file name
		for (int i = 0; i < arrList.length; i++) {
			System.out.println(arrList[i].getName());
		}
	}
}
