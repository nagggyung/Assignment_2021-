package study01;

public class OrdinaryPricePolicy implements PricePolicy {
	public int calcPrice(int price, int n) {
		return price*n;
	}
}

class BookDiscountPricePolicy implements PricePolicy{ //책 자체 가격 할인 정책
	public int calcPrice(int price, int n) {
		return (int)(price*n*0.95);
	}
}

class MemberDiscountPricePolicy implements PricePolicy{ //회원 가격 할인 정책
	public int calcPrice(int price, int n) {
		return (int)(price*n*0.9);
	}
}

class VIPDiscountPricePolicy implements PricePolicy{
	public int calcPrice(int price, int n) {
		return (int)(price*n*0.5);
	}
}
