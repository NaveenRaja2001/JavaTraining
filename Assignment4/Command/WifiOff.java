package Command;
/**
 * 
 * @author naveenraja
 * calling the wifiOff method in Wifi class
 */
public class WifiOff implements Command{
	Wifi wifi;
	public WifiOff(Wifi wifi) {
		this.wifi=wifi;
	}
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		wifi.wifiOff();
	}

}
