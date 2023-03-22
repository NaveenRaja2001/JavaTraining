package Bridge;
/**
 * 
 * @author naveenraja
 * abstract class with prepare method
 */
public abstract class Hotel {
	protected Kitchen food1;
	protected Kitchen food2;
	//constructor
	public Hotel(Kitchen food1, Kitchen food2) {
		this.food1 = food1;
		this.food2 = food2;
	}

	abstract public void prepare();
}
