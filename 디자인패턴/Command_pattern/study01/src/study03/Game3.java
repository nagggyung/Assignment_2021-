package study03;

import java.util.ArrayList;
import java.util.Scanner;

public class Game3 {
	Scanner sc = new Scanner(System.in);
	String[] gm2 = {"토마토", "양상추", "고기"};
	int button;
	int a;
	ArrayList<String> array = new ArrayList<String>();
	public void start() {
		System.out.println("Game 3 을 선택하였습니다.");
		System.out.println("3개의 재료를 사용하여 햄버거를 만드는 게임입니다.(토마토:빨강, 양상추:초록, 고기:파랑)");
		System.out.println("재료 순서:");
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
		System.out.println("정답입니다.");
		array.remove(0);
	}
	public void selLattuce() {
		System.out.println("정답입니다.");
		array.remove(0);
	}
	public void selPatty() {
		System.out.println("정답입니다.");
		array.remove(0);
	}
	
}
