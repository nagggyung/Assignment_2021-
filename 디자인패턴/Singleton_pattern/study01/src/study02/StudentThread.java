package study02;

public class StudentThread extends Thread {
	private �ı� my�ı�;
	String type;

	public StudentThread(String name) {
		super(name);
	}
	public void run() {
		�ıǹ���� ����� = �ıǹ����.get�ıǹ����();
		my�ı� = �����.get�ı�(type);
	}
	
	public �ı� getMy�ı�() {
		return my�ı�;
	}
	
}
