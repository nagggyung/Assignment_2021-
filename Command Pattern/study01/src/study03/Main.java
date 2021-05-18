package study03;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sel, button;
		System.out.println("������ �����ϼ���.(����1:������ư, ����2: �ʷϹ�ư, ����3: �Ķ���ư)");
		sel = sc.nextInt();
		
		if(sel == 1)
		{
			Game1 theGame = new Game1();
			RedCommand left = new LeftDiceComm(theGame);
			GreenCommand center = new CenterDiceComm(theGame);
			BlueCommand right = new RightDiceComm(theGame);
			RedButton red = new RedButton(left);
			GreenButton green = new GreenButton(center);
			BlueButton blue = new BlueButton(right);
			theGame.start();
			button = sc.nextInt();
			if(button==1) 
				red.pressed();
			else if(button ==2 )
				green.pressed();
			else
				blue.pressed();
			
		}
		
		else if(sel==2) {
			Game2 theGame = new Game2();
			RedCommand redblock = new RedBlockComm(theGame);
			GreenCommand greenblock = new GreenBlockComm(theGame);
			BlueCommand blueblock = new BlueBlockComm(theGame);
			RedButton red = new RedButton(redblock);
			GreenButton green = new GreenButton(greenblock);
			BlueButton blue = new BlueButton(blueblock);
			theGame.start();
			while(!theGame.array.isEmpty()) {
				System.out.println("��ư�� ��������!(1:red, 2:green, 3:blue): ");
				button = sc.nextInt();
				if(button == 1) {
					if(theGame.array.get(0) == "����") {
						red.pressed();
						System.out.print(theGame.array);
					}
					else {
						System.out.println("Game Over");
						return;
					}
					}
				else if(button == 2) {
					if(theGame.array.get(0) == "�ʷ�") {
						green.pressed();
						System.out.print(theGame.array);
					}
					else {
						System.out.println("Game Over");
						return;
					}
				}
				else {
					if(theGame.array.get(0) == "�Ķ�") {
						blue.pressed();
						System.out.print(theGame.array);
					}
					else {
						System.out.println("Game Over");
					}
				}		
			
			}
			
			
		}
		else {
			Game3 theGame = new Game3();
			RedCommand tomato = new TomatoComm(theGame);
			GreenCommand lattuce = new LattuceComm(theGame);
			BlueCommand patty = new PattyComm(theGame);
			RedButton red = new RedButton(tomato);
			GreenButton green = new GreenButton(lattuce);
			BlueButton blue = new BlueButton(patty);
			theGame.start();
			
			while(!theGame.array.isEmpty()) {
				System.out.println("��ư�� ��������!(1:red, 2:green, 3:blue): ");
				button = sc.nextInt();
				if(button == 1) {
					if(theGame.array.get(0)=="�丶��") {
						red.pressed();
						System.out.print(theGame.array);
					}
					else {
						System.out.println("Game Over");
						return;
					}
					}
				else if(button == 2) {
					if(theGame.array.get(0) == "�����") {
						green.pressed();
						System.out.print(theGame.array);
					}
					else {
						System.out.println("Game Over");
						return;
					}
				}
				else {
					if(theGame.array.get(0) == "���") {
						blue.pressed();
						System.out.print(theGame.array);
					}
					else {
						System.out.println("Game Over");
					}
				}	
			
			}
		}
			
	}
}


