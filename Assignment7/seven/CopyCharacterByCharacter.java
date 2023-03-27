package seven;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacterByCharacter {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/seven/Demo.txt");
		File writeFile = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/seven/DupilicateDemo.txt");

		FileReader fileReader = new FileReader(file);
		FileWriter fileWriter = new FileWriter(writeFile);
//pipedInputStream
		
		char[] charArr = new char[1];
		int length=0;
		while ((length=fileReader.read(charArr)) != -1) {
			fileWriter.write(charArr, 0,length);
		}
		System.out.println("Content in Demo is copyied to DupilicateDemo");
		fileWriter.close();
		fileReader.close();

	}
}
