package ch6command.command;

import ch6command.Command;
import ch6command.obj.*;

public class GarageDoorUpCommand implements Command{
	GarageDoorReceiver gar;
	
	public GarageDoorUpCommand(GarageDoorReceiver gar) {
		this.gar = gar;
	}
	
	@Override
	public void execute() {
		gar.up();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
