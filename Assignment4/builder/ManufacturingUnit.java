package builder;

/**
 * contain the default values which can be changed by creating object
 * independently
 */
public class ManufacturingUnit {
	// default values
	private String type = "4 seater";
	private String company = "Tata";
	private String fuelType = "petrol";
	private String gearSystem = "mannual";
	private int price = 2000000;

	// public ManufacturingUnit() {
	//
	// }
	// using setter to change the default value by creating independent object
	public ManufacturingUnit setType(String type) {
		this.type = type;
		return this;
	}

	public ManufacturingUnit setCompany(String company) {
		this.company = company;
		return this;
	}

	public ManufacturingUnit setFuelType(String fuelType) {
		this.fuelType = fuelType;
		return this;
	}

	public ManufacturingUnit setGearSystem(String gearSystem) {
		this.gearSystem = gearSystem;
		return this;
	}

	public ManufacturingUnit setPrice(int price) {
		this.price = price;
		return this;
	}

	// return the car object
	public Car getCar() {
		return new Car(type, company, fuelType, gearSystem, price);
	}

}
