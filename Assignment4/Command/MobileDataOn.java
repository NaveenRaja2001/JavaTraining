package command;

/**
 * calling the dataOn method in mobileData class
 * 
 * @author naveenraja
 * 
 */
public class MobileDataOn implements Command {
	final MobileData mobileData;

	public MobileDataOn(MobileData mobileData) {
		this.mobileData = mobileData;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		mobileData.dataOn();
	}

}
