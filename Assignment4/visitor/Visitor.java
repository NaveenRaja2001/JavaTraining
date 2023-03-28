package visitor;

/**
 * This program demonstrates visitor pattern
 * 
 * @author naveenraja
 *
 */
public class Visitor {
	public static void main(String[] args) throws Exception {
		// creating flyingbirds object and pass the value
		Birds bird = new FlightLessBirds("Kuruvi");
		MyCapabilities capability = new Capabilities();
		//passing the capability in visit methods
		bird.visit(capability);
	}
}
