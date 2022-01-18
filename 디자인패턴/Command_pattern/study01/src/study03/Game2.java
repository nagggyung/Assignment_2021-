package study03;

import java.util.ArrayList;
import java.util.Scanner;

public class Game2 {
	Scanner sc = new Scanner(System.in);
	String[] gm2 = {"빨강", "파랑", "초록"};
	ArrayList<String> array = new ArrayList<String>();
	int button;
	int a;
	
	public void start() {
		System.out.println("Game 2 을 선택하였습니다.");
		System.out.println("블록과 동일한 색의 버튼을 누르는 게임입니다.");
		System.out.println("블록순서:");
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
		System.out.println("정답입니다.");
		array.remove(0);
	}
	public void selGreenBlock() {
		System.out.println("정답입니다.");
		array.remove(0);
	}
	public void selBlueBlock() {
		System.out.println("정답입니다.");
		array.remove(0);
	}

}
