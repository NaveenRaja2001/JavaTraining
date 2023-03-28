package factory;

public class OperatingFactory {
	/**
	 * input based on which the object is created
	 * 
	 * @param str
	 * @return an object based on the input
	 */
	public BestPlayer getInstance(String gameName) {
		if (gameName.equals("Cricket")) {
			return new Cricket();
		} else if (gameName.equals("FootBall")) {
			return new FootBall();
		} else if (gameName.equals("VollyBall")) {
			return new VolleyBall();
		} else {
			return new GameNotFound();
		}
	}
}
