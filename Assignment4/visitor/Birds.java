package visitor;

// abstract bird class
abstract class Birds {
	String name;
	//constructor for setting the bird name
	public Birds(String name) {
		this.name = name;
	}

	public abstract void visit(MyCapabilities capability);
}