package Singleton;



public class Singleton {
	/**
	 * 
	 * @param args unused
	 * creating the object of capitalOfIndia but it returns same object which is created for the firstTime
	 */
   public static void main(String[] args) {
	   CapitalOfIndia obj=CapitalOfIndia.getIntsance();
	   CapitalOfIndia obj1=CapitalOfIndia.getIntsance();
//	 System.out.println(obj+" "+obj1);
}
}
