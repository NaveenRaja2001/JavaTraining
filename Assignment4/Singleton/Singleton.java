package singleton;

public class Singleton {
	/**
	 * This program demonstrates singleton pattern
	 * 
	 * @param args unused
	 * 
	 */
	public static void main(String[] args) {
		CapitalOfIndia capitalOfIndia = CapitalOfIndia.getIntsance();

		CapitalOfIndia secondcapitalOfIndia = CapitalOfIndia.getIntsance();
		System.out.println(capitalOfIndia);
		System.out.println(secondcapitalOfIndia);

	}
}
