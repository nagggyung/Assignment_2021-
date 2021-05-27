package TemplatePattern;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		int pickfood;
		int picksauce;
		Recipe recipe;
		theSauceCommand saucecommand;
		Sauce s = new Sauce();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��Ḧ �����ϼ��� (1:�Ұ��, 2:�߰��, 3:ũ����): ");
		pickfood = sc.nextInt();
		System.out.println("�ҽ��� �����ϼ��� (1:��ø, 2:ĸ���̽�): ");
		picksauce = sc.nextInt();
		
		if(picksauce == 1) {
			if(pickfood ==1) {
				System.out.println("[�Ұ�� �긮�� ������]");
				saucecommand = new Ketchup(s);
				recipe = new Beef(saucecommand);
				recipe.printRecipe();
			}
			if(pickfood == 2) {
				System.out.println("[�߰�� �긮�� ������]");
				saucecommand = new Ketchup(s);
				recipe = new Chicken(saucecommand);
				recipe.printRecipe();
			}
			if(pickfood == 3) {
				System.out.println("[ũ���� �긮�� ������]");
				saucecommand = new Ketchup(s);
				recipe = new Crammy(saucecommand);
				recipe.printRecipe();
			}
		}
		else {
			if(pickfood ==1) {
				System.out.println("[�Ұ�� �긮�� ������]");
				saucecommand = new Capsaicin(s);
				recipe = new Beef(saucecommand);
				recipe.printRecipe();
			}
			if(pickfood == 2) {
				System.out.println("[�߰�� �긮�� ������]");
				saucecommand = new Capsaicin(s);
				recipe = new Chicken(saucecommand);
				recipe.printRecipe();
			}
			if(pickfood == 3) {
				System.out.println("[ũ���� �긮�� ������]");
				saucecommand = new Capsaicin(s);
				recipe = new Crammy(saucecommand);
				recipe.printRecipe();
			}
		}
		
		
	}

}
