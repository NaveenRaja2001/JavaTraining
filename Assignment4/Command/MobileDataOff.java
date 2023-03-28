package command;

/**
 * calling the dataOff in mobileData class
 * 
 * @author naveenraja
 * 
 */
public class MobileDataOff implements Command {
	final MobileData mobileData;

	public MobileDataOff(MobileData mobileData) {
		this.mobileData = mobileData;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		mobileData.dataOff();
	}

}
