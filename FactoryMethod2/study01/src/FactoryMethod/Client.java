package FactoryMethod;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		int picPizza;
		PizzaRecipe recipe;
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �����ϼ���!(1:�޺���̼�, 2:���۷δ�, 3:�Ұ��) : ");
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
