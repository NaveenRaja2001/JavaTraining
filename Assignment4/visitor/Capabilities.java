package visitor;


class Capabilities implements MyCapabilities {
	@Override
	public void whatIdo(FlyingBirds bird) {
		System.out.println("I Can Fly.......");
	}
	
	@Override
	public void whatIdo(FlightLessBirds bird) {
		System.out.println("I Can't Fly.......");
	}
}
