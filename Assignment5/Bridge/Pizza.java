package Bridge;

public class Pizza extends Hotel {
	
	public Pizza(Kitchen food1, Kitchen food2) {
		super(food1, food2);
		// TODO Auto-generated constructor stub
	}

	@Override
	//calling cooking and preparing method
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Pizza is");
		food1.work();
		food2.work();
	}

}
