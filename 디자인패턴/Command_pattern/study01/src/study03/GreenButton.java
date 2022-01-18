package study03;

public class GreenButton {
	private GreenCommand theCommand;
	
	public GreenButton(GreenCommand theCommand) {
		setCommand(theCommand);
	}
	public void setCommand(GreenCommand newCommand) {
		this.theCommand = newCommand;
	}
	public void pressed() {//��ư�� ������ �־��� Command�� execute �޼��� ȣ����
		theCommand.execute();
		
	}

}
