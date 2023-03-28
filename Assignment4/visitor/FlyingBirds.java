package visitor;

class FlyingBirds extends Birds {
	public FlyingBirds(String name) {
		super(name);
	}

	// visit method for flightlessbirds class
	public void visit(MyCapabilities capability) {
		capability.whatIdo(this);
	}
}
