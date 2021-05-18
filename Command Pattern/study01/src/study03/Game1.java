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
		System.out.println("Game 1 을 선택하였습니다.");
		a = selectNum(a);
		b = selectNum(b);
		c = selectNum(c);
		System.out.println("세 개의 주사위 중 가장 큰 값의 주사위를 고르는 게임 입니다. Red = left, Green = Center, Blue = right");
		System.out.printf("왼쪽, 가운데, 오른쪽 = %d %d %d \n", a,b,c);
		System.out.println("버튼을 누르세요!: (1:red, 2:green, 3:blue)");
	}
	
	public void selLeftDice() {
		if(a>=b && a>=c){
			System.out.println("정답입니다.");
			return;
		}
		else {
			System.out.println("틀렸습니다.");
			System.out.println("Game Over");
			return;			
			}
	}
	public void selCenterDice() {
		if(b>=a && b>=c) {
			System.out.println("정답입니다.");
			return;
		}
		else {
			System.out.println("틀렸습니다.");
			System.out.println("Game Over.");
			return;
			
		}
	
}
	public void selRightDice() {
		if(c>=a && c>=b) {
			System.out.println("정답입니다.");
			return;
		}
		else {
			System.out.println("틀렸습니다.");
			System.out.println("Game Over.");
		}
	}
}
