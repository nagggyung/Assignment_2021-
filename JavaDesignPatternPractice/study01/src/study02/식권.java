package study02;

interface �ı� {
	public String getType();
	public int getCount();
}

class Normal�ı� implements �ı�{
	String type;
	int num;
	public Normal�ı�(int num, String type) {
		this.type = type;
		this.num = num;
	}
	public String getType() {
		return type;
	}
	public int getCount() {
		return num;
	}
}

class Null�ı� implements �ı�{
	String type = "�ı��� ������ �� �����ϴ�.";
	public String getType() {
		return type;
	}
	public int getCount() {
		return 0;
	}
}
