package study01;

public class Rental {
	private Memeber member;
	private VIP vip;
	private Book book;
	private PricePolicy pricePolicy; //���� ��å ����
	int n;
	
	public Rental(Memeber member, Book book, PricePolicy pricePolicy, int n) {
		this.member = member;
		this.book = book;
		this.pricePolicy = pricePolicy; //���� ��å ����
		this.n = n;
		this.member.addAccPrice(pricePolicy.calcPrice(book.getPrice(),n));
	}
	public Rental(VIP vip, Book book, PricePolicy pricePolicy, int n) {
		this.vip = vip;
		this.book = book;
		this.pricePolicy = pricePolicy; //���� ��å ����
		this.n = n;
		this.vip.addAccPrice(pricePolicy.calcPrice(book.getPrice(),n));
	}
	
	public int getPrice() {
		return pricePolicy.calcPrice(book.getPrice(),n); //���� ��å�� ���� å ���� ���
	}

}

interface PricePolicy{
	public int calcPrice(int price, int n);
}
