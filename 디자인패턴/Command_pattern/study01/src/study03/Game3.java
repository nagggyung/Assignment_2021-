package study03;

import java.util.ArrayList;
import java.util.Scanner;

public class Game3 {
	Scanner sc = new Scanner(System.in);
	String[] gm2 = {"�丶��", "�����", "���"};
	int button;
	int a;
	ArrayList<String> array = new ArrayList<String>();
	public void start() {
		System.out.println("Game 3 �� �����Ͽ����ϴ�.");
		System.out.println("3���� ��Ḧ ����Ͽ� �ܹ��Ÿ� ����� �����Դϴ�.(�丶��:����, �����:�ʷ�, ���:�Ķ�)");
		System.out.println("��� ����:");
		for(int i=0; i<3; i++) {
			a = (int)(Math.random()*2);
			array.add(gm2[a]);
		}
		for(int i=0; i<3; i++) {
			System.out.print(array.get(i));
			System.out.print(" ");
		}

	}
	
	public void selTomato() {
		System.out.println("�����Դϴ�.");
		array.remove(0);
	}
	public void selLattuce() {
		System.out.println("�����Դϴ�.");
		array.remove(0);
	}
	public void selPatty() {
		System.out.println("�����Դϴ�.");
		array.remove(0);
	}
	
}
