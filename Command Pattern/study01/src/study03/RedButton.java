package study03;

public class RedButton {
	private RedCommand theCommand;
	
	public RedButton(RedCommand theCommand) {
		setCommand(theCommand);
	}
	public void setCommand(RedCommand newCommand) {
		this.theCommand = newCommand;
	}
	public void pressed() {//��ư�� ������ �־��� Command�� execute �޼��� ȣ����
		theCommand.execute();
		
	}

}
