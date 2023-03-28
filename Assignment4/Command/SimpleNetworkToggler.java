package command;

public class SimpleNetworkToggler{
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	// calling the excute method based on the object
	public void switchingNetwork() {
		command.execute();
	}
}
