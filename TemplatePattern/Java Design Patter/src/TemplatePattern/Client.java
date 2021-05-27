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
		System.out.println("재료를 선택하세요 (1:소고기, 2:닭고기, 3:크래미): ");
		pickfood = sc.nextInt();
		System.out.println("소스를 선택하세요 (1:케첩, 2:캡사이신): ");
		picksauce = sc.nextInt();
		
		if(picksauce == 1) {
			if(pickfood ==1) {
				System.out.println("[소고기 브리또 레시피]");
				saucecommand = new Ketchup(s);
				recipe = new Beef(saucecommand);
				recipe.printRecipe();
			}
			if(pickfood == 2) {
				System.out.println("[닭고기 브리또 레시피]");
				saucecommand = new Ketchup(s);
				recipe = new Chicken(saucecommand);
				recipe.printRecipe();
			}
			if(pickfood == 3) {
				System.out.println("[크래미 브리또 레시피]");
				saucecommand = new Ketchup(s);
				recipe = new Crammy(saucecommand);
				recipe.printRecipe();
			}
		}
		else {
			if(pickfood ==1) {
				System.out.println("[소고기 브리또 레시피]");
				saucecommand = new Capsaicin(s);
				recipe = new Beef(saucecommand);
				recipe.printRecipe();
			}
			if(pickfood == 2) {
				System.out.println("[닭고기 브리또 레시피]");
				saucecommand = new Capsaicin(s);
				recipe = new Chicken(saucecommand);
				recipe.printRecipe();
			}
			if(pickfood == 3) {
				System.out.println("[크래미 브리또 레시피]");
				saucecommand = new Capsaicin(s);
				recipe = new Crammy(saucecommand);
				recipe.printRecipe();
			}
		}
		
		
	}

}
