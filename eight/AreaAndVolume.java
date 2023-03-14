package eight;

public class AreaAndVolume {
	public static void main(String[] args) {
		Circle cir = new Circle();
		Square sqr = new Square();
		Sphere sph = new Sphere();
		Cuboid cub = new Cuboid();
		System.out.println("The area of circle " + cir.area(5));
		System.out.println("The area of square " + sqr.area(5));
		System.out.println("The area of sphere  " + sph.area(5) + "  The volume of sphere  " + sph.volume(10));
		System.out.println("The area of cuboid " + cub.area(5) + "  The volume of cuboid  " + cub.volume(10));
	}
}
//Interface for Area
interface CalcArea {
	double area(int value);
}
//Interface for Volume
interface CalcVolume {
	double volume(int value);
}
//Circle area
class Circle implements CalcArea {

	@Override
	public double area(int value) {
		// TODO Auto-generated method stub

		return Math.PI * value * value;
	}

}
//Square area
class Square implements CalcArea {

	@Override
	public double area(int value) {
		// TODO Auto-generated method stub
		return value * value;
	}

}
//Sphere area and Volume
class Sphere implements CalcVolume, CalcArea {

	@Override
	public double area(int value) {

		return Math.PI * value * value;
	}

	@Override
	public double volume(int value) {
		// TODO Auto-generated method stub
		return 2 * Math.PI * value;
	}

}
//Cuboid area and Volume
class Cuboid implements CalcVolume, CalcArea {

	@Override
	public double area(int value) {
		// TODO Auto-generated method stub
		return value * value;
	}

	@Override
	public double volume(int value) {
		// TODO Auto-generated method stub
		return 4 * value;
	}

}