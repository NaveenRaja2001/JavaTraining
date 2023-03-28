package command;

/**
 * calling the wifiOff method in Wifi class
 * 
 * @author naveenraja
 * 
 */
public class WifiOff implements Command {
	final Wifi wifi;

	public WifiOff(Wifi wifi) {
		this.wifi = wifi;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		wifi.wifiOff();
	}

}
