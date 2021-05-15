package study01;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memeber member1 = new Memeber("member1");
		Memeber member2 = new Memeber("member2");
		
		Book book1 = new Book("book1",2005,1000);
		Book book2 = new Book("book2",2004,1200);
		Book book3 = new Book("book3",2001,4300);
		
		Rental rental1 = new Rental(member1, book2, new OrdinaryPricePolicy(),2);
		Rental rental2 = new Rental(member2, book1, new OrdinaryPricePolicy(),3);
		Rental rental3 = new Rental(member2, book3, new OrdinaryPricePolicy(),4);
		Rental rental4 = new Rental(member1, book2, new OrdinaryPricePolicy(),3);
		
		System.out.println(rental1.getPrice());
		System.out.println(rental2.getPrice());
		System.out.println(rental3.getPrice());
		System.out.println(rental4.getPrice());
		
		
		

	}

}
