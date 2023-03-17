package five;

class OwnException extends Exception {
	/**
	 * Messege needed to print is passed to Super class Constructor
	 * 
	 * @param str
	 */
	public OwnException(String str) {
		super(str);
	}
}

public class Demo {
	public static void main(String[] args) throws Exception {
		int number = 4;
		Demo obj = new Demo();
		obj.createException(number);
	}

	/**
	 * if number even number throw a Exception
	 * 
	 * @param num
	 * @throws Exception
	 */
	public void createException(int num) throws Exception {
		try {
			if (num % 2 == 0) {
				throw new OwnException("This number is even");
			}
		}
//		catch(OwnException e){
//			System.out.println(e.getMessage());
//		}
		finally {
			System.out.println("Finally it is running");
		}
	}
}