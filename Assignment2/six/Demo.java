package six;

/**
 * Super class contructor throws an Exception
 * 
 * @author naveenraja
 *
 */
class Super {
	public Super() {
		throw new Exception(); // throw Exception in super class constructor
	}
}

/**
 * derived class can't handle the super call exception in constructor
 *
 */
class Derived extends Super {
	public Derived() {
		super();
	}
}

/**
 * class creates the object of Derived class
 *
 */
public class Demo {
	public static void main(String args[]) {
		Derived obj = new Derived();
	}
}
