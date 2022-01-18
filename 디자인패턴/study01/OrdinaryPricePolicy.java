package study01;

public class OrdinaryPricePolicy implements PricePolicy {
	public int calcPrice(int price, int n) {
		return price*n;
	}
}

class BookDiscountPricePolicy implements PricePolicy{ //å ��ü ���� ���� ��å
	public int calcPrice(int price, int n) {
		return (int)(price*n*0.95);
	}
}

class MemberDiscountPricePolicy implements PricePolicy{ //ȸ�� ���� ���� ��å
	public int calcPrice(int price, int n) {
		return (int)(price*n*0.9);
	}
}

class VIPDiscountPricePolicy implements PricePolicy{
	public int calcPrice(int price, int n) {
		return (int)(price*n*0.5);
	}
}
