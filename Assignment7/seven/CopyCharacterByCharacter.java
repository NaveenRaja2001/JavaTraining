package seven;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacterByCharacter {

	public static void main(String[] args) throws IOException {
		File readFile = null;
		File writeFile = null;
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			readFile = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/seven/Demo.txt");
			writeFile = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/seven/DupilicateDemo.txt");
			fileReader = new FileReader(readFile);
			fileWriter = new FileWriter(writeFile);

			char[] charArr = new char[1];
			int length = 0;
			while ((length = fileReader.read(charArr)) != -1) {
				fileWriter.write(charArr, 0, length);
			}

			System.out.println("Content in Demo is copyied to DupilicateDemo");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			fileWriter.close();
			fileReader.close();
		}

	}
}
