package study01;

interface ȸ��{
	public String getName();
	public void addAccPrice(int price);
	public int getAccPrice();
	
}
public class Memeber implements ȸ�� {
	//ȸ���� �̸��� ���� �뿩 �ݾ��� ����
	private String name; //�̸�
	private int accPrice; // ���� �뿩 �ݾ�
	
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


   class VIP implements ȸ��{
	private String name; //�̸�
	private int accPrice; // ���� �뿩 �ݾ�
	
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