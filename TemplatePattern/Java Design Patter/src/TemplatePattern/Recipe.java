package TemplatePattern;

public abstract class Recipe {

	private theSauceCommand sauce;
	
	Recipe(theSauceCommand sauce){
		this.sauce = sauce;
	}
	
	public void printRecipe() {
		System.out.println("1. 양배추 썰기");
		wayTocut();
		System.out.println("3. 또띠야 펴기");
		System.out.println("4. 밥 넣기");
		System.out.println("5. 양배추 넣기");
		sauce.putSauce();
		whatToput();
		System.out.println("8. 또띠야 말기");
	}
	
	protected abstract void wayTocut();
	protected abstract void whatToput();
	
}

class Beef extends Recipe{
	
	Beef(theSauceCommand sauce){
		super(sauce);
	}
	
	protected void wayTocut() {
		System.out.println("2. 소고기 다지기");
	}
	protected void whatToput() {
		System.out.println("7. 소고기 넣기");
	}
	
}

class Chicken extends Recipe{
	
	Chicken(theSauceCommand sauce){
		super(sauce);
	}
	protected void wayTocut() {
		System.out.println("2. 닭고기 잘게 썰기");
	}
	protected void whatToput() {
		System.out.println("7. 닭고기 넣기");
	}
	
}

class Crammy extends Recipe{
	
	Crammy(theSauceCommand sauce){
		super(sauce);
	}
	protected void wayTocut() {
		System.out.println("2. 게살 찢기");
	}
	protected void whatToput() {
		System.out.println("7. 게살 넣기");
	}
}




