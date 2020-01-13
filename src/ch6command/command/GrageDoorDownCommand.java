package ch6command.command;

import ch6command.Command;
import ch6command.obj.GarageDoorReceiver;

public class GrageDoorDownCommand implements Command{
	GarageDoorReceiver graDoorReceiver;
	
	public GrageDoorDownCommand(GarageDoorReceiver garageDoorReceiver) {
		this.graDoorReceiver = garageDoorReceiver;
	}

	@Override
	public void execute() {
		graDoorReceiver.down();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
}
