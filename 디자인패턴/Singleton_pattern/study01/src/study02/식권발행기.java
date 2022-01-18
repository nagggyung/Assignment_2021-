package study02;

public class 식권발행기 {
	private static 식권발행기 발행기;
	private int limits; //발행할 수 있는 식권 수
	public static int count; // 발행된 식권 수
	
	private 식권발행기() {
		count = 0;
	}
	
	//오직 하나의 식권 발행기 생성 
	public synchronized static 식권발행기 get식권발행기() {
		if(발행기 == null) {
			발행기 = new 식권발행기();
		}
		return 발행기;
	}
	
	public synchronized void set식권Limits(int limits) {
		this.limits = limits;
	}
	
	public synchronized 식권 get식권(String type) {
		if(this.count<this.limits) {
			return new Normal식권(++this.count, type);
		}
		return new Null식권();
	}
    public int 남은식권개수() {
    	return 100-(--count);
    }

}

