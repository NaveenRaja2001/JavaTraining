package Command;
/**
 * 
 * @author naveenraja
 * calling the wifiON method in Wifi class
 */
public class WifiOn implements Command{
	Wifi wifi;
	 public WifiOn(Wifi wifi) {
		 this.wifi=wifi;
	 }
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		wifi.wifiOn();
	}

}
