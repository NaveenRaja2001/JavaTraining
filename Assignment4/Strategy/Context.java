package strategy;

public class Context {
	private FamousFood famousFood;
	
	public Context(FamousFood famousFood) {
		this.famousFood=famousFood;
	}
	//calling the foodName in the object created class
	public void executeStrategy() {
		famousFood.foodName();
	}
}
