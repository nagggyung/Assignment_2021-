package study02;

public class 식권회수자 {
	private static 식권회수자 회수자;
		
	public synchronized static 식권회수자 get식권회수자() {
		if(회수자==null) {
			회수자 = new 식권회수자();
		}
		return 회수자;
	}
	
	public int get식권Count() {
		식권발행기 발행기 = 식권발행기.get식권발행기();
		return 발행기.남은식권개수();
	}

}