package FlyWeightPattern;

public class Laptop implements Specification {
	private String OS;
	private String color;
	private int ram;

	Laptop(){
		OS="Windows";
	}

	@Override
	public void color(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public void RAM(int ram) {
		// TODO Auto-generated method stub
		this.ram = ram;
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Laptop Specification are color:" + color +" RAM:" + ram + " OS" + OS);
	}
}
