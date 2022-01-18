package study03;

public class BlueButton {

	private BlueCommand theCommand;
	
	public BlueButton(BlueCommand theCommand) {
		setCommand(theCommand);
	}
	public void setCommand(BlueCommand newCommand) {
		this.theCommand = newCommand;
	}
	public void pressed() {//��ư�� ������ �־��� Command�� execute �޼��� ȣ����
		theCommand.execute();
		
	}

}
