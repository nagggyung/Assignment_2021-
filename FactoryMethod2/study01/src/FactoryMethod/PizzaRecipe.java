package FactoryMethod;

import java.util.ArrayList;

enum Amount {
	LARGE, MEDIUM, SMALL
}
public abstract class PizzaRecipe {
	public void makePizza() {
		System.out.println("피자의 구성은 다음과 같습니다.");
		Dough dough = getDough();
		dough.getThickness();
		System.out.print(" ");
		for(int i = 0; i < getTopping().size(); i++) {
			Topping topping = getTopping().get(i);
			topping.getAmount();
			System.out.print(" ");
		}
	}
	protected abstract Dough getDough();
	protected abstract ArrayList<Topping> getTopping();
	
}

class CombiRecipe extends PizzaRecipe{
	Amount amount;
	protected Dough getDough() {
		Dough dough = new ThinDough();
		return dough;
	}
	
	protected ArrayList<Topping> getTopping(){
		ArrayList<Topping> topping = new ArrayList<Topping>();
		topping.add(new Bacon(amount.SMALL));
		topping.add(new Olive(amount.MEDIUM));
		topping.add(new Piment(amount.MEDIUM));
		topping.add(new Onion(amount.MEDIUM));
		topping.add(new Bulgogi(amount.SMALL));
		topping.add(new Pepperoni(amount.SMALL));
		topping.add(new Cheese(amount.MEDIUM));
		
		return topping;
		
	}
}

class PepperoniRecipe extends PizzaRecipe{
	Amount amount = null;
	protected Dough getDough() {
		Dough dough = new ThickDough();
		return dough;
	}
	protected ArrayList<Topping> getTopping(){
		ArrayList<Topping> topping = new ArrayList<Topping>();
		topping.add(new Pepperoni(amount.LARGE));
		topping.add(new Cheese(amount.LARGE));
		
		return topping;
		
	}
	
}

class BulgogiRecipe extends PizzaRecipe{
	Amount amount = null;
	protected Dough getDough() {
		Dough dough = new ThickDough();
		return dough;
	}
	protected ArrayList<Topping> getTopping(){
	
		ArrayList<Topping> topping = new ArrayList<Topping>();
		topping.add(new Bulgogi(amount.LARGE));
		topping.add(new Cheese(amount.LARGE));
		topping.add(new Onion(amount.SMALL));
		topping.add(new Piment(amount.SMALL));
		topping.add(new Olive(amount.MEDIUM));
		topping.add(new Cheese(amount.MEDIUM));
		
		
		return topping;
		
	}
}