package five;

public class ThreadStart {
	/**
	 * 
	 * @param args unused creating a thread object and starting the thread two times
	 */
	public static void main(String[] args) {
		// creating object for thread class
		Thread obj = new Thread();
		// calling the start methods two times show an error
		obj.start();
		obj.start();
	}
}
