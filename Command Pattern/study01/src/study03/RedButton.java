package study03;

public class RedButton {
	private RedCommand theCommand;
	
	public RedButton(RedCommand theCommand) {
		setCommand(theCommand);
	}
	public void setCommand(RedCommand newCommand) {
		this.theCommand = newCommand;
	}
	public void pressed() {//버튼이 눌리면 주어진 Command의 execute 메서드 호출함
		theCommand.execute();
		
	}

}
