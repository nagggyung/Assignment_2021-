package study03;

import java.util.ArrayList;
import java.util.Scanner;

public class Game2 {
	Scanner sc = new Scanner(System.in);
	String[] gm2 = {"����", "�Ķ�", "�ʷ�"};
	ArrayList<String> array = new ArrayList<String>();
	int button;
	int a;
	
	public void start() {
		System.out.println("Game 2 �� �����Ͽ����ϴ�.");
		System.out.println("��ϰ� ������ ���� ��ư�� ������ �����Դϴ�.");
		System.out.println("��ϼ���:");
		for(int i=0; i<5; i++) {
			a = (int)(Math.random()*2);
			array.add(gm2[a]);
		}
		for(int i=0; i<5; i++) {
			System.out.print(array.get(i));
			System.out.print(" ");
		}
	
	}
	
	public void selRedBlock() {
		System.out.println("�����Դϴ�.");
		array.remove(0);
	}
	public void selGreenBlock() {
		System.out.println("�����Դϴ�.");
		array.remove(0);
	}
	public void selBlueBlock() {
		System.out.println("�����Դϴ�.");
		array.remove(0);
	}

}
