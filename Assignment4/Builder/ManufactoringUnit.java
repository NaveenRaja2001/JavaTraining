package Builder;

/**
 * contain the default values which can be changed by creating object
 * independently
 */
public class ManufactoringUnit {
	// default values
	private String type = "4 seater";
	private String company = "Tata";
	private String fuelType = "petrol";
	private String gearSystem = "mannual";
	private int price = 2000000;

	// using setter to change the default value by creating independent object
	public ManufactoringUnit setType(String type) {
		this.type = type;
		return this;
	}

	public ManufactoringUnit setCompany(String company) {
		this.company = company;
		return this;
	}

	public ManufactoringUnit setFuelType(String fuelType) {
		this.fuelType = fuelType;
		return this;
	}

	public ManufactoringUnit setGearSystem(String gearSystem) {
		this.gearSystem = gearSystem;
		return this;
	}

	public ManufactoringUnit setPrice(int price) {
		this.price = price;
		return this;
	}

	//	return the car object
	public Car getCar() {
		return new Car(type, company, fuelType, gearSystem, price);
	}

}
