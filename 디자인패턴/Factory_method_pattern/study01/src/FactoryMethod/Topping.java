package FactoryMethod;

public abstract class Topping {
	Amount amount;
	Topping(Amount amount){
		this.amount = amount;
	}
	public abstract void getAmount();

}

class Cheese extends Topping{
	Cheese(Amount amount){
		super(amount);
	}
	public void getAmount() {
		if (amount == amount.LARGE) {
			System.out.print("치즈(많이)");
		}
		else if(amount == amount.MEDIUM) {
			System.out.print("치즈(보통)");
	}
		else
			System.out.print("치즈(적게)");
}
}
class Bacon extends Topping{
	Bacon(Amount amount){
		super(amount);
	}
	public void getAmount() {
		if (amount == amount.LARGE) {
			System.out.print("베이컨(많이)");
		}
		else if(amount == amount.MEDIUM) {
			System.out.print("베이컨(보통)");
	}
		else
			System.out.print("베이컨(적게)");
	}
}
class Olive extends Topping{
	Olive(Amount amount){
		super(amount);
	}
	public void getAmount() {
		if (amount == amount.LARGE) {
			System.out.print("올리브(많이)");
		}
		else if(amount == amount.MEDIUM) {
			System.out.print("올리브(보통)");
	}
		else
			System.out.print("올리브(적게)");
	}
}

class Piment extends Topping{
	Piment(Amount amount){
		super(amount);
	}
	public void getAmount() {
		if (amount == amount.LARGE) {
			System.out.print("피망(많이)");
		}
		else if(amount == amount.MEDIUM) {
			System.out.print("피망(보통)");
	}
		else
			System.out.print("피망(적게)");
	}
	}

class Onion extends Topping{
	Onion(Amount amount){
		super(amount);
	}
	public void getAmount() {
		if (amount == amount.LARGE) {
			System.out.print("양파(많이)");
		}
		else if(amount == amount.MEDIUM) {
			System.out.print("양파(보통)");
	}
		else
			System.out.print("양파(적게)");
	}
	}

class Bulgogi extends Topping{
	Bulgogi(Amount amount){
		super(amount);
	}
	public void getAmount() {
		if (amount == amount.LARGE) {
			System.out.print("불고기(많이)");
		}
		else if(amount == amount.MEDIUM) {
			System.out.print("불고기(보통)");
	}
		else
			System.out.print("불고기(적게)");
	}
	}

class Pepperoni extends Topping{
	 Pepperoni(Amount amount){
		super(amount);
	}
	public void getAmount() {
		if (amount == amount.LARGE) {
			System.out.print("페퍼로니(많이)");
		}
		else if(amount == amount.MEDIUM) {
			System.out.print("페퍼로니(보통)");
	}
		else
			System.out.print("페퍼로니(적게)");
	}
	}

