package study03;

import java.util.Scanner;

public class Game1 {
	Scanner sc = new Scanner(System.in);
	int button;
	int a,b,c;
	public int selectNum(int num) {
		num = (int)(Math.random()*5+1);
		return num;
	}
	public void start() {
		System.out.println("Game 1 �� �����Ͽ����ϴ�.");
		a = selectNum(a);
		b = selectNum(b);
		c = selectNum(c);
		System.out.println("�� ���� �ֻ��� �� ���� ū ���� �ֻ����� ���� ���� �Դϴ�. Red = left, Green = Center, Blue = right");
		System.out.printf("����, ���, ������ = %d %d %d \n", a,b,c);
		System.out.println("��ư�� ��������!: (1:red, 2:green, 3:blue)");
	}
	
	public void selLeftDice() {
		if(a>=b && a>=c){
			System.out.println("�����Դϴ�.");
			return;
		}
		else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("Game Over");
			return;			
			}
	}
	public void selCenterDice() {
		if(b>=a && b>=c) {
			System.out.println("�����Դϴ�.");
			return;
		}
		else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("Game Over.");
			return;
			
		}
	
}
	public void selRightDice() {
		if(c>=a && c>=b) {
			System.out.println("�����Դϴ�.");
			return;
		}
		else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("Game Over.");
		}
	}
}
