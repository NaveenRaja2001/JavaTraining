package three;

import java.io.File;
/**
 * 
 * @author naveenraja
 * this program describes how to find the length of the file
 */
public class FileSizeDisplayExample {
	public static void main(String[] args) {
		//creating the file object 
		
		File file = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/three/Rename.txt");
		//checking the file exists or not
		if (file.exists()) {
			//finding the length
			long filelength = file.length();
			System.out.println("Size of the file is " + filelength);
		} else {
			System.out.println("File does not exist");
		}
	}
}
