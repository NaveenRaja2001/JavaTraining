package nine;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ReadWriteDateObject {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream objectOutputStream = null;
		BufferedReader bufferedReader = null;
		try {
			//Create the date object
			Date date = new Date();
			FileOutputStream fileOutputStream;
			fileOutputStream = new FileOutputStream(
					"/Users/naveenraja/eclipse-workspace/Assignment7/src/nine/Demo.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(date);
			//using bufferReader to 
			bufferedReader = new BufferedReader(
					new FileReader("/Users/naveenraja/eclipse-workspace/Assignment7/src/nine/Demo.txt"));
			String s;
			while ((s = bufferedReader.readLine()) != null) {
				//printing the line
				System.out.println(s);
			}
		} catch (Exception e) {
			System.out.print(e);
		} finally {
			objectOutputStream.close();
			bufferedReader.close();
		}

	}
}
