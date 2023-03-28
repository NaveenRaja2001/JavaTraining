package eight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyLineByLine {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = null;
		FileWriter fileWriter = null;
		try {
			// file writer print writer
			bufferedReader = new BufferedReader(
					new FileReader("/Users/naveenraja/eclipse-workspace/Assignment7/src/eight/Demo.txt"));
			fileWriter = new FileWriter(
					new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/eight/Duplicate.txt"));
			String input;
			while ((input = bufferedReader.readLine()) != null) {
				System.out.println(input);
				fileWriter.write(input);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			bufferedReader.close();
			fileWriter.close();
		}
	}
}
