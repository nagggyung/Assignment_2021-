package study02;

interface 식권 {
	public String getType();
	public int getCount();
}

class Normal식권 implements 식권{
	String type;
	int num;
	public Normal식권(int num, String type) {
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

class Null식권 implements 식권{
	String type = "식권을 발행할 수 없습니다.";
	public String getType() {
		return type;
	}
	public int getCount() {
		return 0;
	}
}
