package three;

import java.io.File;

/**
 * 
 * @author naveenraja 
 * This class shows how to delete the file
 */
public class DeleteFileExample {
	public static void main(String[] args) {
		// creating hte file object
		File file = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/three/Demo.txt");
		// checking where the file is exist or not
		if (file.exists()) {
			// deleting the file
			file.delete();
			System.out.println("File deleted successfully");
		} else {
			System.out.println("File doesn't exist");
		}

	}
}
