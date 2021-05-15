package study01;

interface 회원{
	public String getName();
	public void addAccPrice(int price);
	public int getAccPrice();
	
}
public class Memeber implements 회원 {
	//회원은 이름과 누적 대여 금액을 갖음
	private String name; //이름
	private int accPrice; // 누적 대여 금액
	
	public Memeber(String name) {
		this.name = name;
		accPrice = 0;
	}
	
	public String getName() {
		return name;
	}
	public void addAccPrice(int price) {
		accPrice += price;
	}
	public int getAccPrice() {
		return accPrice;
	}


}


   class VIP implements 회원{
	private String name; //이름
	private int accPrice; // 누적 대여 금액
	
	public VIP(String name) {
		this.name = name;
		accPrice = 0;
	}
	
	public String getName() {
		return name;
	}
	public void addAccPrice(int price) {
		accPrice += price;
	}
	public int getAccPrice() {
		return accPrice;
	}
}