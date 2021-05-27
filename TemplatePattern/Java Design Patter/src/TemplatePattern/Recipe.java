package TemplatePattern;

public abstract class Recipe {

	private theSauceCommand sauce;
	
	Recipe(theSauceCommand sauce){
		this.sauce = sauce;
	}
	
	public void printRecipe() {
		System.out.println("1. ����� ���");
		wayTocut();
		System.out.println("3. �Ƕ�� ���");
		System.out.println("4. �� �ֱ�");
		System.out.println("5. ����� �ֱ�");
		sauce.putSauce();
		whatToput();
		System.out.println("8. �Ƕ�� ����");
	}
	
	protected abstract void wayTocut();
	protected abstract void whatToput();
	
}

class Beef extends Recipe{
	
	Beef(theSauceCommand sauce){
		super(sauce);
	}
	
	protected void wayTocut() {
		System.out.println("2. �Ұ�� ������");
	}
	protected void whatToput() {
		System.out.println("7. �Ұ�� �ֱ�");
	}
	
}

class Chicken extends Recipe{
	
	Chicken(theSauceCommand sauce){
		super(sauce);
	}
	protected void wayTocut() {
		System.out.println("2. �߰�� �߰� ���");
	}
	protected void whatToput() {
		System.out.println("7. �߰�� �ֱ�");
	}
	
}

class Crammy extends Recipe{
	
	Crammy(theSauceCommand sauce){
		super(sauce);
	}
	protected void wayTocut() {
		System.out.println("2. �Ի� ����");
	}
	protected void whatToput() {
		System.out.println("7. �Ի� �ֱ�");
	}
}




