package Command;
/**
 * 
 * @author naveenraja
 * calling the dataOn method in mobileData class
 */
public class MobileDataOn implements Command {
	MobileData mobileData;

	public MobileDataOn(MobileData mobileData) {
		this.mobileData = mobileData;
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		mobileData.dataOn();
	}

}
