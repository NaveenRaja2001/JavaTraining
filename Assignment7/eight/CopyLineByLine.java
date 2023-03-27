package eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLineByLine {
public static void main(String[] args) throws IOException{
	//file writer print writer
	BufferedReader bufferedReader=new BufferedReader(new FileReader("/Users/naveenraja/eclipse-workspace/Assignment7/src/eight/Demo.txt"));
	PrintWriter printWriter=new PrintWriter(new FileWriter("/Users/naveenraja/eclipse-workspace/Assignment7/src/eight/Duplicate.txt"));
	String input;
	while((input=bufferedReader.readLine())!=null) {
		System.out.println(input);
		printWriter.write(input);
		
	}
	bufferedReader.close();
	printWriter.close();
}
}
