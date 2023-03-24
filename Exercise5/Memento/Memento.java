package Memento;
/**
 * this program describes the Memento design pattern
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Memento {
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		PersonalDataBase personalDatabase = new PersonalDataBase("Naveen", 2056, "Sri Krishna", "B postive");
		//printing the name after saving
		System.out.println(personalDatabase.name);
		//creating the personaldetails.dat
		ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream("PersonalDetails.dat"));

		objectOutputStream.writeObject(personalDatabase);
		//changing the name 
		personalDatabase.name = "Raja";
		
		System.out.println("if i want i can restore the old name...");
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("PersonalDetails.dat"));
		//reteriving the old name
		personalDatabase = (PersonalDataBase) objectInputStream.readObject();
		
		System.out.println("personal Details" + personalDatabase);
		//updating the new name
		objectInputStream = new ObjectInputStream(new FileInputStream("PersonalDetails.dat"));
		personalDatabase = (PersonalDataBase) objectInputStream.readObject();

	}
}
