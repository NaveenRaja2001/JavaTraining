package Command;

public class NetworkToggler {
	/**
	 * 
	 * @param args unused
	 *  encapsulate hte request in  a object
	 */
	public static void main(String[] args) {
		SimpleNetworkToggler simpleRemote = new SimpleNetworkToggler();
		// creating object for MobileData and Wifi
		MobileData mobiledata = new MobileData();
		Wifi wifi = new Wifi();
		// passing the command in form of object
		simpleRemote.setCommand(new MobileDataOn(mobiledata));
		simpleRemote.switchingNetwork();
		simpleRemote.setCommand(new MobileDataOff(mobiledata));
		simpleRemote.switchingNetwork();
		simpleRemote.setCommand(new WifiOn(wifi));
		simpleRemote.switchingNetwork();
		simpleRemote.setCommand(new WifiOff(wifi));
		simpleRemote.switchingNetwork();
	}
}
