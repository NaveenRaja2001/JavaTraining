package builder;

public class ShowRoom {
	/**
	 * This program demonstrates Builder pattern
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// creating object for manual and deisel independently
		Car newCar = new ManufacturingUnit().setGearSystem("manual").setFuelType("Deisel").getCar();
		System.out.println(newCar);
	}
}
