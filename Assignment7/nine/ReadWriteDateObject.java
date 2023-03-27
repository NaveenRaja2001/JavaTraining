package nine;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ReadWriteDateObject {
   public static void main(String[] args) throws IOException {
	Date date=new Date();
	FileOutputStream fileOutputStream;
	fileOutputStream =new FileOutputStream("/Users/naveenraja/eclipse-workspace/Assignment7/src/nine/Demo.txt");
	ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
	objectOutputStream.writeObject(date);
	
	BufferedReader bufferedReader=new BufferedReader(new FileReader("/Users/naveenraja/eclipse-workspace/Assignment7/src/nine/Demo.txt"));
	String s;
	while((s=bufferedReader.readLine())!=null) {
		System.out.println(s);
	}
	objectOutputStream.close();
	bufferedReader.close();
   }
}
