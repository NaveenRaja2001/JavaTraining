package singleton;

public class CapitalOfIndia {
	// private constructor
	private CapitalOfIndia() {
		System.out.println("Delhi");
	}

	private static CapitalOfIndia capitalOfIndia;

	public static CapitalOfIndia getIntsance() {
		// creating the object if the reference is null
		if (capitalOfIndia == null) {
			// synchronized block to remove overhead
			synchronized (CapitalOfIndia.class) {
				if (capitalOfIndia == null) {
					// if instance is null, initialize
					capitalOfIndia = new CapitalOfIndia();
				}
			}

		}
		// returning object of capital of India class
		return capitalOfIndia;
	}
}
