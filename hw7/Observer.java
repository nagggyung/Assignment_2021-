package hw7;

public interface Observer {
	public abstract void update();
}

class Lamp implements Observer{
	private Sensor s;
	public Lamp(Sensor s) {
		this.s = s;
	}

	public void update() {
		System.out.println("�溸 level" + s.getLevel()
				+ " ����� ���� �մϴ�.");

	}
}

class Alarm implements Observer{
	private Sensor s;
	public Alarm(Sensor s) {
		this.s = s;
	}
	public void update() {
		System.out.println("�溸 level" + s.getLevel()+
				" �˶��� �۵��մϴ�.");
	}
}
class Phone implements Observer{
	private Sensor s;
	public Phone(Sensor s) {
		this.s = s;
	}
	public void update() {
		System.out.println("�溸 level" + s.getLevel()+
				" ������ �����մϴ�. ");
	}
}