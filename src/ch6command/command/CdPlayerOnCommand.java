package ch6command.command;

import ch6command.Command;
import ch6command.obj.CdPlayerReceiver;

public class CdPlayerOnCommand  implements Command{
	CdPlayerReceiver cdPlayer;
	
	public CdPlayerOnCommand(CdPlayerReceiver cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	@Override
	public void execute() {
		cdPlayer.on();
		cdPlayer.setCd();
		cdPlayer.setVolume(11);
	}

	@Override
	public void undo() {
		cdPlayer.off();
	}

}
