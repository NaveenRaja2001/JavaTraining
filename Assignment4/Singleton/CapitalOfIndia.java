package Singleton;


public class CapitalOfIndia{
	//private constructor
	private CapitalOfIndia() {
		System.out.println("Delhi");
	}
	
	private static CapitalOfIndia obj;

	synchronized public static CapitalOfIndia getIntsance() {
		//creating the object if the reference is null
		if(obj==null) {
			 obj=new CapitalOfIndia();
		}
		//returning object of capital of India class
		return obj;
	}
}
