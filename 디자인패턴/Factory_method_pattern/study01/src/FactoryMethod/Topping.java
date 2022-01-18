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
			System.out.print("ġ��(����)");
		}
		else if(amount == amount.MEDIUM) {
			System.out.print("ġ��(����)");
	}
		else
			System.out.print("ġ��(����)");
}
}
class Bacon extends Topping{
	Bacon(Amount amount){
		super(amount);
	}
	public void getAmount() {
		if (amount == amount.LARGE) {
			System.out.print("������(����)");
		}
		else if(amount == amount.MEDIUM) {
			System.out.print("������(����)");
	}
		else
			System.out.print("������(����)");
	}
}
class Olive extends Topping{
	Olive(Amount amount){
		super(amount);
	}
	public void getAmount() {
		if (amount == amount.LARGE) {
			System.out.print("�ø���(����)");
		}
		else if(amount == amount.MEDIUM) {
			System.out.print("�ø���(����)");
	}
		else
			System.out.print("�ø���(����)");
	}
}

class Piment extends Topping{
	Piment(Amount amount){
		super(amount);
	}
	public void getAmount() {
		if (amount == amount.LARGE) {
			System.out.print("�Ǹ�(����)");
		}
		else if(amount == amount.MEDIUM) {
			System.out.print("�Ǹ�(����)");
	}
		else
			System.out.print("�Ǹ�(����)");
	}
	}

class Onion extends Topping{
	Onion(Amount amount){
		super(amount);
	}
	public void getAmount() {
		if (amount == amount.LARGE) {
			System.out.print("����(����)");
		}
		else if(amount == amount.MEDIUM) {
			System.out.print("����(����)");
	}
		else
			System.out.print("����(����)");
	}
	}

class Bulgogi extends Topping{
	Bulgogi(Amount amount){
		super(amount);
	}
	public void getAmount() {
		if (amount == amount.LARGE) {
			System.out.print("�Ұ��(����)");
		}
		else if(amount == amount.MEDIUM) {
			System.out.print("�Ұ��(����)");
	}
		else
			System.out.print("�Ұ��(����)");
	}
	}

class Pepperoni extends Topping{
	 Pepperoni(Amount amount){
		super(amount);
	}
	public void getAmount() {
		if (amount == amount.LARGE) {
			System.out.print("���۷δ�(����)");
		}
		else if(amount == amount.MEDIUM) {
			System.out.print("���۷δ�(����)");
	}
		else
			System.out.print("���۷δ�(����)");
	}
	}

