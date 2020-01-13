package ch6command;

//인보커
public class SimpleRemotecontrol {
	Command com;
	
	public SimpleRemotecontrol() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCom(Command com) {
		this.com = com;
	}
	
	public void btnPressed() {
		com.execute();
	}
	
}
