package Factory;

public class OperatingFactory {
	/**
	 * 
	 * @param str input based on which the object is created
	 * @return an object based on the input
	 */
		public BestPlayer getInstance(String str) {
			if(str.equals("Cricket")) {
				return new Cricket();
			}
			else if(str.equals("FootBall")) {
				return new FootBall();
			}
			else {
				return new VollyBall();
			}
		}
}
