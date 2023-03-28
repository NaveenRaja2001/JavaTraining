package command;

/**
 * calling the wifiON method in Wifi class
 * 
 * @author naveenraja
 * 
 */
public class WifiOn implements Command {
	final Wifi wifi;

	public WifiOn(Wifi wifi) {
		this.wifi = wifi;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		wifi.wifiOn();
	}

}
