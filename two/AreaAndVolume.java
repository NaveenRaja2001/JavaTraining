package two;

public class AreaAndVolume {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Square square = new Square();
		Sphere sphere = new Sphere();
		Cuboid cuboid = new Cuboid();
		System.out.println("The area of circle " + circle.area(5));
		System.out.println("The area of square " + square.area(5));
		System.out.println("The area of sphere  " + sphere.area(5) + "  The volume of sphere  " + sphere.volume(10));
		System.out.println("The area of cuboid " + cuboid.area(5) + "  The volume of cuboid  " + cuboid.volume(10));
	}
}

/**
 * interface contains area method
 *
 */
interface CalcArea {
	double area(int value);
}

/**
 * interface contains volume method
 */
interface CalcVolume {
	double volume(int value);
}

/**
 * class contains the area method to calculate circle area
 */
class Circle implements CalcArea {
	/**
	 * method is used to calculate the circle area
	 * 
	 * @param value used to calculate the area
	 * @return area(type of:double)
	 */
	@Override
	public double area(int value) {
		// TODO Auto-generated method stub

		return Math.PI * value * value;
	}

}

/**
 * class contains the area method to calculate Square area
 */
class Square implements CalcArea {
	/**
	 * method is used to calculate the Square area
	 * 
	 * @param value used to calculate the area
	 * @return area(type of:double)
	 */
	@Override
	public double area(int value) {
		// TODO Auto-generated method stub
		return value * value;
	}

}

/**
 * class contains the area method to calculate Sphere area and Sphere volume
 */
class Sphere implements CalcVolume, CalcArea {
	/**
	 * method is used to calculate the Sphere area
	 * 
	 * @param value used to calculate the area
	 * @return area(type of:double)
	 */
	@Override
	public double area(int value) {

		return Math.PI * value * value;
	}

	/**
	 * method is used to calculate the Sphere volume
	 * 
	 * @param value used to calculate the volume
	 * @return volume(type of:double)
	 */
	@Override
	public double volume(int value) {
		// TODO Auto-generated method stub
		return 2 * Math.PI * value;
	}

}

/**
 * class contains the area method to calculate Cuboid area and Cuboid volume
 */
class Cuboid implements CalcVolume, CalcArea {
	/**
	 * method is used to calculate the Cuboid area
	 * 
	 * @param value used to calculate the area
	 * @return area(type of:double)
	 */
	@Override
	public double area(int value) {
		// TODO Auto-generated method stub
		return value * value;
	}

	/**
	 * method is used to calculate the Cuboid volume
	 * 
	 * @param value used to calculate the volume
	 * @return volume(type of:double)
	 */
	@Override
	public double volume(int value) {
		// TODO Auto-generated method stub
		return 4 * value;
	}

}