package five;

public class Student {
	String name;
	int roll;
//Student class 
	public Student() {
		name = "Naveen";
		roll = 34;
	}

	public static void main(String args[]) {
		Result obj = new Result();
		System.out.println("Total Marks " + obj.caltotalMark());
	}
}
//Exam class 
class Exam extends Student {
	static int science = 75;
	int social = 99;
	int maths = 89;

}
//Result class 
class Result extends Exam {
	int totalMark;

	public int caltotalMark() {
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + roll);
		totalMark = maths + science + social;
		return totalMark;
	}

}