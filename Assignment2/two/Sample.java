package two;

/**
 * 
 * @author naveenraja class Sample contain two method in which mth2 throws an
 *         Arithmetic Exception
 */
public class Sample {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}

	/**
	 * method throws an Arithmetic Exception
	 */
	public void mth2() {
		try {
			int number = 1 / 0; // Arithmetic Exception
			return;
			
		} catch (Exception e) {
			System.out.println("catch-mth2");
			
		} finally {
			System.out.println("finally-mth2");
		}
	}

	/**
	 * method creates the object on Sample class and calls mth1 method
	 * 
	 * @param args unsed
	 */
	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.mth1();
	}
}
