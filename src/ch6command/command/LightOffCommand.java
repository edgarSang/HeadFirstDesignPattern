package ch6command.command;

import ch6command.Command;
import ch6command.obj.*;

public class LightOffCommand implements Command{
	LightReceiver light;
	
	public LightOffCommand(LightReceiver light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
