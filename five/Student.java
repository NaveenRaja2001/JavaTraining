package five;
/**
 * class contains the main method and a constructor in which the name and rollno is initialized
 */
public class Student {
	String name;
	int rollno;
	public Student() {
		name = "Naveen";
		rollno = 34;
	}
/**
 * function created the result object and total marks method is called which returns the total marks
 * @param args unsued
 */
	public static void main(String args[]) {
		Result obj = new Result();
		System.out.println("Total Marks " + obj.callculatetotalMark());
	}
}
/**
 * class contains a constructor in which the social and maths mark is initialized and extend student class
 */

class Exam extends Student {
	static int science = 75;
	int social = 99;
	int maths = 89;
}

/**
 * class contains a constructor in which the name and rollno is initialized and extend the Exam class
 */
class Result extends Exam {
	int totalMark;
/**
 * function return the totalMark
 * @return totalMark
 */
	public int callculatetotalMark() {
		System.out.println("Name: " +name);
		System.out.println("Roll No: " + rollno);
		totalMark = maths + science + social;
		return totalMark;
	}

}