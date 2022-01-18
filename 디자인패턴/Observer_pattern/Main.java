package hw7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sensor sensor = new Sensor();
		int level = 0;
		
		Lamp lamp = new Lamp(sensor);
		Alarm alarm = new Alarm(sensor);
		Phone phone = new Phone(sensor);
		
		sensor.attach(lamp);
		sensor.attach(alarm);
		sensor.attach(phone);
		
		System.out.println("�溸 level�� �����ϼ���: ");
		level = sc.nextInt();
		sensor.setLevel(level);
		
		sensor.setDetected(true);//ħ���� ����
		
	}
}
