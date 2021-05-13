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
		System.out.println("경보 level" + s.getLevel()
				+ " 방안의 불을 켭니다.");

	}
}

class Alarm implements Observer{
	private Sensor s;
	public Alarm(Sensor s) {
		this.s = s;
	}
	public void update() {
		System.out.println("경보 level" + s.getLevel()+
				" 알람을 작동합니다.");
	}
}
class Phone implements Observer{
	private Sensor s;
	public Phone(Sensor s) {
		this.s = s;
	}
	public void update() {
		System.out.println("경보 level" + s.getLevel()+
				" 경찰에 연락합니다. ");
	}
}