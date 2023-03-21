package Builder;

public class Car {
	private String type;
	private String company;
	private String fuelType;
	private String gearSystem;
	private int price;
//	constructor of a car class
	public Car(String type, String company, String fuelType, String gearSystem, int price) {
		super();
		this.type = type;
		this.company = company;
		this.fuelType = fuelType;
		this.gearSystem = gearSystem;
		this.price=price;
	}
	@Override
//	to print the object 
	public String toString() {
		return "Car [type=" + type + ", company=" + company + ", fuelType=" + fuelType + ", gearSystem=" + gearSystem
				+ ", price=" + price + "]";
	}
	
	

}
