package Command;
/**
 * 
 * @author naveenraja
 * calling the dataOff in mobileData class
 */
public class MobileDataOff implements Command{
	MobileData mobileData;
	
	public MobileDataOff(MobileData mobileData) {
		this.mobileData=mobileData;
	}
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		mobileData.dataOff();
	}
	
}
