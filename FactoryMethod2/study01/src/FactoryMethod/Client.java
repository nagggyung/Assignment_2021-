package FactoryMethod;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		int picPizza;
		PizzaRecipe recipe;
		Scanner sc = new Scanner(System.in);
		System.out.println("피자를 선택하세요!(1:콤비네이션, 2:페퍼로니, 3:불고기) : ");
		picPizza = sc.nextInt();
		
		switch(picPizza) {
		case 1: 
			recipe = new CombiRecipe();
			recipe.makePizza();
			break;
		case 2:
			recipe = new PepperoniRecipe();
			recipe.makePizza();
			break;
		case 3:
			recipe = new BulgogiRecipe();
			recipe.makePizza();
			break;
		 
	}

}
}
