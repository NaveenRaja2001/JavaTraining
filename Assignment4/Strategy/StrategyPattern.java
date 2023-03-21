package Strategy;

public class StrategyPattern {
	/**
	 * 
	 * @param args unused
	 *  creating the object for similar classes which give a different behaviour
	 */
	public static void main(String[] args) {
		Context context = new Context(new Chinese());
		context.excuteStrategy();
		context = new Context(new SouthIndian());
		context.excuteStrategy();
		context = new Context(new NorthIndian());
		context.excuteStrategy();
	}
}
