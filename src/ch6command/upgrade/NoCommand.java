package ch6command.upgrade;

import ch6command.Command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("no command put the command");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
