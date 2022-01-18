package TemplatePattern;

public interface theSauceCommand {
	abstract public void putSauce();
}

class Ketchup implements theSauceCommand{
	private Sauce s;
	
	Ketchup(Sauce s){
		this.s = s;
	}
	
	public void putSauce() {
		s.putKetchup();
	}
}

class Capsaicin implements theSauceCommand{
	private Sauce s;
	
	Capsaicin(Sauce s){
		this.s = s;
	}
	
	public void putSauce() {
		s.putCapsaicin();
	}
}

class Sauce {
	
	public void putKetchup() {
		System.out.println("6. 케첩 소스 넣기");
	}
	public void putCapsaicin() {
		System.out.println("6. 캡사이신 소스 넣기");
	}
}
