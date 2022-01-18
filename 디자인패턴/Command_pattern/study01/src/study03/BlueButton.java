package study03;

public class BlueButton {

	private BlueCommand theCommand;
	
	public BlueButton(BlueCommand theCommand) {
		setCommand(theCommand);
	}
	public void setCommand(BlueCommand newCommand) {
		this.theCommand = newCommand;
	}
	public void pressed() {//버튼이 눌리면 주어진 Command의 execute 메서드 호출함
		theCommand.execute();
		
	}

}
