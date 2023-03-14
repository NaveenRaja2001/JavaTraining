package three;

class Demo {
	private Demo() {
		System.out.println("The Object is created ........!");
	}

	static private Demo obj;
//method for creating object 
	public static Demo getInstance() {
		if (obj == null) {
			obj = new Demo();
		}
		return obj;
	}

}

public class Singleton {
	public static void main(String[] args) {
		Demo obj1 = Demo.getInstance();
		Demo obj2 = Demo.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
