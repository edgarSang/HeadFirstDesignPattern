package ch6command.command;

import ch6command.Command;
import ch6command.obj.CdPlayerReceiver;

public class CdPlayerOffCommand  implements Command{
	CdPlayerReceiver cdPlayer;
	
	public CdPlayerOffCommand(CdPlayerReceiver cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	@Override
	public void execute() {
		cdPlayer.off();
	}

	@Override
	public void undo() {
		cdPlayer.on();
	}

}
