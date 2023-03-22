package Bridge;
/**
 * 
 * @author naveenraja
 * This program derscribes the Bridge pattern
 */
public class User {
	public static void main(String []args) {
	    //creating the object of pizza by using Cooking and Serving classes
		Hotel pizza=new Pizza(new Cooking(),new Serving());
		pizza.prepare();
		//creating the object of dosa by using Cooking and Serving classes
		Hotel dosa=new Dosa(new Cooking(),new Serving());
		dosa.prepare();
		
	}
}
