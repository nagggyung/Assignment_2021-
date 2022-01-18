package Decorator;

public abstract class Ticket {
	public int cost;

	public abstract int getDiscountedCost();
}

class OriginalTicket extends Ticket{
	private int choice;
	
	OriginalTicket(int choice) {
		this.choice = choice;
	}
	OriginalTicket(){
		
	}
	
	public int getDiscountedCost() {
		if (choice==1)
			return 10000;
		else if(choice == 2)
			return 15000;
		else if(choice == 3)
			return 3000;
		return 0;
	}
}

class SaleDecorator extends Ticket{
	private Ticket saleDecorate;
	
	public  SaleDecorator(Ticket saleDecorate) {
		this.saleDecorate = saleDecorate;
	}
	public int getDiscountedCost() {
		return saleDecorate.getDiscountedCost();
	}
}

class SamsungCard extends SaleDecorator{
	public int cost=super.getDiscountedCost();
	public SamsungCard(Ticket sd) {
		super(sd);
	}
	
	public int getDiscountedCost() {
		int finalCost = (int)(cost* getSamsungDiscount());
		return finalCost;
	}
	
	private double getSamsungDiscount() {
		return 0.3;
		
	}
	
}

class ShinhanCard extends SaleDecorator{
	public int cost=super.getDiscountedCost();
	public ShinhanCard(Ticket sd) {
		super(sd);
	}
	public int getDiscountedCost() {
		int finalCost = (int)(cost* getShinhanDiscount());
		return finalCost;
	}
	private double getShinhanDiscount() {
		return 0.2;
	}
}

class WooriCard extends SaleDecorator{
	public int cost=super.getDiscountedCost();
	public WooriCard(Ticket sd) {
		super(sd);
	}
	
	public int getDiscountedCost() {
		int finalCost = (int)(cost* getWooriDiscount());
		return finalCost;
	}
	private double getWooriDiscount() {
		return 0.4;
	}
}

class KTMember extends SaleDecorator{
	public int cost=super.getDiscountedCost();
	public KTMember(Ticket sd) {
		super(sd);
	}
	
	public int getDiscountedCost() {
		int finalCost = (int)(cost* getKTDiscount());
		return finalCost;
	}			
	private double getKTDiscount() {
		return 0.1;
	}

}

class SKTMember extends SaleDecorator{
	public int cost=super.getDiscountedCost();
	public SKTMember(Ticket sd) {
		super(sd);
	}
	public int getDiscountedCost() {
		int finalCost = (int)(cost* getSKTDiscount());
		return finalCost;
	}
	private double getSKTDiscount() {
		return 0.2;
	}

}

class ParkMember extends SaleDecorator{
	public int cost=super.getDiscountedCost();;
	public ParkMember(Ticket sd) {
		super(sd);
	}
	
	public int getDiscountedCost() {
		int finalCost = (int)(cost* getParkDiscount());
		return finalCost;
	}
	private double getParkDiscount() {
		return 0.05;
	}

}

class Weekday extends SaleDecorator{
	public int cost=super.getDiscountedCost();
	public Weekday(Ticket sd) {
		super(sd);
	}
	
	public int getDiscountedCost() {
		int finalCost = (int)(super.getDiscountedCost()* getWeekDiscount());
		return finalCost;
	}
	private double getWeekDiscount() {
			return 0.5;
	}

}

class Weekend extends SaleDecorator{
	public int cost=super.getDiscountedCost();
	public Weekend(Ticket sd) {
		super(sd);
	}
	public int getDiscountedCost() {
		int finalCost = (int)(cost* getWeekendDiscount());
		return finalCost;
	}
	private double getWeekendDiscount() {
		return 0.3;
	}

}


	


