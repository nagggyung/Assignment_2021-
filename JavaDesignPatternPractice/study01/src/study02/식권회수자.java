package study02;

public class �ı�ȸ���� {
	private static �ı�ȸ���� ȸ����;
		
	public synchronized static �ı�ȸ���� get�ı�ȸ����() {
		if(ȸ����==null) {
			ȸ���� = new �ı�ȸ����();
		}
		return ȸ����;
	}
	
	public int get�ı�Count() {
		�ıǹ���� ����� = �ıǹ����.get�ıǹ����();
		return �����.�����ıǰ���();
	}

}