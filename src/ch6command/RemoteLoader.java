package ch6command;

import ch6command.command.CdPlayerOffCommand;
import ch6command.command.CdPlayerOnCommand;
import ch6command.command.GarageDoorUpCommand;
import ch6command.command.GrageDoorDownCommand;
import ch6command.command.LightOffCommand;
import ch6command.command.LightonCommand;
import ch6command.obj.CdPlayerReceiver;
import ch6command.obj.GarageDoorReceiver;
import ch6command.obj.LightReceiver;
import ch6command.upgrade.RemoteControl;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		LightReceiver lightReceiver = new LightReceiver();
		GarageDoorReceiver garageDoorReceiver = new GarageDoorReceiver();
		CdPlayerReceiver cdPlayerReceiver = new CdPlayerReceiver();
		
		LightonCommand lightonCommand = new LightonCommand(lightReceiver);
		LightOffCommand ligOffCommand = new LightOffCommand(lightReceiver);
		
		GrageDoorDownCommand garDoorDownCommand = new GrageDoorDownCommand(garageDoorReceiver);
		GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoorReceiver);
		
		CdPlayerOffCommand cdPlayerOffCommand = new CdPlayerOffCommand(cdPlayerReceiver);
		CdPlayerOnCommand cdPlayerOnCommand = new CdPlayerOnCommand(cdPlayerReceiver);
		
		remoteControl.setCommand(0, cdPlayerOnCommand, cdPlayerOffCommand);
		remoteControl.setCommand(1, garDoorDownCommand, garageDoorUpCommand);
		remoteControl.setCommand(2, lightonCommand, ligOffCommand);
		
		remoteControl.onButtonPushed(0);
		remoteControl.offButtonPushed(0);
		
		remoteControl.onButtonPushed(1);
		remoteControl.undoButtonPushed();
		remoteControl.offButtonPushed(1);
		
		remoteControl.onButtonPushed(2);
		remoteControl.offButtonPushed(2);
		
		remoteControl.onButtonPushed(3);
		remoteControl.offButtonPushed(3);
		
	}

}
