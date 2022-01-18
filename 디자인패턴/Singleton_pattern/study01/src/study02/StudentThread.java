package study02;

public class StudentThread extends Thread {
	private 식권 my식권;
	String type;

	public StudentThread(String name) {
		super(name);
	}
	public void run() {
		식권발행기 발행기 = 식권발행기.get식권발행기();
		my식권 = 발행기.get식권(type);
	}
	
	public 식권 getMy식권() {
		return my식권;
	}
	
}
