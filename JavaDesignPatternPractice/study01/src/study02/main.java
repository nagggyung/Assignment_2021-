package study02;
import java.util.Scanner;

public class main {
	private static final int THREAD_NUM = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		int b;
		Scanner sc = new Scanner(System.in);
		식권발행기 발행기 = 식권발행기.get식권발행기();
		식권회수자 회수자 = 식권회수자.get식권회수자();
		발행기.set식권Limits(100); //발행할 수 있는 식권수 100장
		StudentThread[] student = new StudentThread[THREAD_NUM]; //10명의 사용자
		
		for(int i =0; i<THREAD_NUM; i++) {
		student[i] = new StudentThread((i+1)+"-thread");
		System.out.println("발행하려는 식권 종류를 입력하세요. 1.한식 2.중식 3.양식");
		a = sc.next();
		student[i].type = a;
		student[i].start();
		}
		
		for(int i =0; i<THREAD_NUM; i++) {
			try {
				student[i].join();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i = 0; i<THREAD_NUM; i++) {
			System.out.println("Student"+(i+1)+" "+student[i].getMy식권().getType()+" "+"식권 발행 number: "+student[i].getMy식권().getCount());
		}
		for(int i= 0; i<THREAD_NUM; i++) {
			System.out.println("Student"+(i+1)+"님 식사 맛있게 하세요!");
			System.out.println("남은 식권 개수:"+ 회수자.get식권Count());
		}

	}
	

}
