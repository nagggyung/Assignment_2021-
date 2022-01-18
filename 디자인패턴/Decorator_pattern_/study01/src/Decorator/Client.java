package Decorator;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		System.out.println("B689063 ������");
		int type;
		int card;
		int membership;
		int week;
		int finalcost;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ƽ���� ��� �ּ���! (1: 1�� ���� �̿��, 2: 2�� ���� �̿��, 3: 5�� ���̱ⱸ �̿��)");
		type = sc.nextInt();
		
		Ticket ticket = new OriginalTicket(type);
		Ticket samsung = new SamsungCard(ticket);
		Ticket shinhan = new ShinhanCard(ticket);
		Ticket woori = new WooriCard(ticket);
		Ticket ktm = new KTMember(ticket);
		Ticket sktm = new SKTMember(ticket);
		Ticket parkm = new ParkMember(ticket);
		Ticket weekday = new Weekday(ticket);
		Ticket weekend = new Weekend(ticket);
		
		
		System.out.println("Original Ticket Cost: "+ ticket.getDiscountedCost());
		
		System.out.println("ī�� ���� �Ǵ°� �����Ű���? (1: �Ｚī��, 2: ����ī��, 3: �츮ī��)");
		card = sc.nextInt();
		if(card == 1) {
			finalcost = ticket.getDiscountedCost()- samsung.getDiscountedCost();
		}
		else if(card == 2) {
			finalcost = ticket.getDiscountedCost()-shinhan.getDiscountedCost();
		}
		else {
			finalcost = ticket.getDiscountedCost()-woori.getDiscountedCost();
		}
		
		System.out.println("����� ���� �Ǵ°� �����Ű���? (1: KT, 2: SKT, 3: Park)");
		membership = sc.nextInt();
		if(membership == 1) {
			ktm.cost = finalcost;
			finalcost =  finalcost - ktm.getDiscountedCost();
		}
		else if(membership == 2) {
			sktm.cost = finalcost;
			finalcost = finalcost - sktm.getDiscountedCost();
		}
		else {
			parkm.cost = finalcost;
			finalcost = finalcost - parkm.getDiscountedCost();
		}
		
		System.out.println("�������� �ָ����� ���� ? (1: weekday, 2: weekend)");
		week = sc.nextInt();
		if(week == 1) {
			weekday.cost = finalcost;
			finalcost = finalcost - weekday.getDiscountedCost();
	
		}
		else {
			weekend.cost = finalcost;
			finalcost = finalcost- weekend.getDiscountedCost();
		}
	
		System.out.println(finalcost + "�Դϴ�.");
	
	

	}

}
