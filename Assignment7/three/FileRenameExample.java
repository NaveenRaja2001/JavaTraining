package three;

import java.io.File;
/**
 * 
 * @author naveenraja
 * This program shows how to rename a file
 */
public class FileRenameExample {
	public static void main(String[] args) {
		//creating the file object with path
		File file = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/three/Demo.txt");
		//creating the file object with new path(new name)
		File fileRename = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/three/Rename.txt");
		//checking hte existence of the file
		if (file.exists()) {
			//renaming the file
			file.renameTo(fileRename);
			System.out.println("File is succesfully renamed");
		} else {
			System.out.println("File doesn't exist");
		}

	}
}
