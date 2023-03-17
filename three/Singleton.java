package three;

/**
 * Demo class consist of a method in which only one instance of the class can be
 * made
 *
 */
class Demo {
	private Demo() {
		System.out.println("The Object is created ........!");
	}

	static private Demo obj;

	/**
	 * only one object will be created for the class
	 * 
	 * @return object of the Demo(type:object)
	 */
	public static Demo getInstance() {
		if (obj == null) {
			obj = new Demo();
		}
		return obj;
	}

}

/**
 * class creates the object of Demo class by calling static method
 */
public class Singleton {
	public static void main(String[] args) {
		Demo obj1 = Demo.getInstance();
		Demo obj2 = Demo.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
