package study02;
import java.util.Scanner;

public class main {
	private static final int THREAD_NUM = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		int b;
		Scanner sc = new Scanner(System.in);
		�ıǹ���� ����� = �ıǹ����.get�ıǹ����();
		�ı�ȸ���� ȸ���� = �ı�ȸ����.get�ı�ȸ����();
		�����.set�ı�Limits(100); //������ �� �ִ� �ıǼ� 100��
		StudentThread[] student = new StudentThread[THREAD_NUM]; //10���� �����
		
		for(int i =0; i<THREAD_NUM; i++) {
		student[i] = new StudentThread((i+1)+"-thread");
		System.out.println("�����Ϸ��� �ı� ������ �Է��ϼ���. 1.�ѽ� 2.�߽� 3.���");
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
			System.out.println("Student"+(i+1)+" "+student[i].getMy�ı�().getType()+" "+"�ı� ���� number: "+student[i].getMy�ı�().getCount());
		}
		for(int i= 0; i<THREAD_NUM; i++) {
			System.out.println("Student"+(i+1)+"�� �Ļ� ���ְ� �ϼ���!");
			System.out.println("���� �ı� ����:"+ ȸ����.get�ı�Count());
		}

	}
	

}
