package FlyWeightPattern;

public class Buyer {
	public static void main(String[] args) {
	    //creating a laptop object
		Specification laptop=Factory.getDevice("Laptop");
		laptop.color("Blue");
		laptop.RAM(1);
		laptop.buy();
		laptop.color("Black");
		laptop.RAM(10);
		laptop.buy();
		//creating a mobile object
		Specification mobile =Factory.getDevice("Mobile");
		mobile.color("Yellow");
		mobile.RAM(64);
		mobile.buy();
		//no mobile object is creating using the exciting one
		Specification imobile =Factory.getDevice("Mobile");
		imobile.color("purewhite");
		imobile.RAM(128);
		imobile.buy();
	}
		
		
		}

