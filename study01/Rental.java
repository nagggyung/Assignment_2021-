package study01;

public class Rental {
	private Memeber member;
	private VIP vip;
	private Book book;
	private PricePolicy pricePolicy; //가격 정책 참조
	int n;
	
	public Rental(Memeber member, Book book, PricePolicy pricePolicy, int n) {
		this.member = member;
		this.book = book;
		this.pricePolicy = pricePolicy; //가격 정책 주입
		this.n = n;
		this.member.addAccPrice(pricePolicy.calcPrice(book.getPrice(),n));
	}
	public Rental(VIP vip, Book book, PricePolicy pricePolicy, int n) {
		this.vip = vip;
		this.book = book;
		this.pricePolicy = pricePolicy; //가격 정책 주입
		this.n = n;
		this.vip.addAccPrice(pricePolicy.calcPrice(book.getPrice(),n));
	}
	
	public int getPrice() {
		return pricePolicy.calcPrice(book.getPrice(),n); //가격 정책에 따른 책 가격 계산
	}

}

interface PricePolicy{
	public int calcPrice(int price, int n);
}
