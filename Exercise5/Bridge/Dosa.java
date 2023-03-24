package Bridge;

public class Dosa extends Hotel {

	public Dosa(Kitchen food1, Kitchen food2) {
		super(food1, food2);
		// TODO Auto-generated constructor stub
	}
	//calling cooking and preparing 
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Dosa is");
		food1.work();
		food2.work();
	}

}
