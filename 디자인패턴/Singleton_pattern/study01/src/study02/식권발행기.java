package study02;

public class �ıǹ���� {
	private static �ıǹ���� �����;
	private int limits; //������ �� �ִ� �ı� ��
	public static int count; // ����� �ı� ��
	
	private �ıǹ����() {
		count = 0;
	}
	
	//���� �ϳ��� �ı� ����� ���� 
	public synchronized static �ıǹ���� get�ıǹ����() {
		if(����� == null) {
			����� = new �ıǹ����();
		}
		return �����;
	}
	
	public synchronized void set�ı�Limits(int limits) {
		this.limits = limits;
	}
	
	public synchronized �ı� get�ı�(String type) {
		if(this.count<this.limits) {
			return new Normal�ı�(++this.count, type);
		}
		return new Null�ı�();
	}
    public int �����ıǰ���() {
    	return 100-(--count);
    }

}

