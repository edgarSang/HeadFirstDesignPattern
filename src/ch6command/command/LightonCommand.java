package ch6command.command;

import ch6command.Command;
import ch6command.obj.*;

public class LightonCommand implements Command{
	LightReceiver light;
	
	public LightonCommand(LightReceiver light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
