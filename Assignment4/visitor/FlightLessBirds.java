package visitor;

class FlightLessBirds extends Birds {
	public FlightLessBirds(String name) {
		super(name);
	}
	//visit method for flightlessbirds class
	public void visit(MyCapabilities capability) {
		capability.whatIdo(this);
	}

}