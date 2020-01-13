package ch6command;

import ch6command.command.*;
import ch6command.obj.*;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemotecontrol remote = new SimpleRemotecontrol();
		LightReceiver light = new LightReceiver();
		LightonCommand lightOnCommand = new LightonCommand(light);
		
		remote.setCom(lightOnCommand);
		remote.btnPressed();
		
		GarageDoorReceiver ga = new GarageDoorReceiver();
		GarageDoorUpCommand garageCommand = new GarageDoorUpCommand(ga);
		
		remote.setCom(garageCommand);
		remote.btnPressed();
	}

}
