package 실습8;

class DisplayDecorator extends Display{
	private Display decoratedDisplay;
	public DisplayDecorator(Display decoratedDisplay) {
		this.decoratedDisplay = decoratedDisplay;
	}
	
	public void draw() {
		decoratedDisplay.draw();
	}
	
}

class LaneDecorator extends DisplayDecorator{
	public LaneDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}
	
	public void draw() {
		super.draw();
		drawLane();
	}
	private void drawLane() {System.out.println("\t 차선 표시");}
}

class TrafficDecorator extends DisplayDecorator{
	public TrafficDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}
	public void draw() {
		super.draw();
		drawTraffic();
	}
	private void drawTraffic() {System.out.println("\t 교통량 표시");}
}

class DaytimeMode extends DisplayDecorator{
	public DaytimeMode(Display decoratedDisplay) {
		super(decoratedDisplay);
	}
	public void draw() {
		super.draw();
		drawDaytimeMode();
	}
	private void drawDaytimeMode() {System.out.println("\t 주간 모드 테마 기능  on");}
	
}

class NighttimeMode extends DisplayDecorator{
	public NighttimeMode(Display decoratedDisplay) {
		super(decoratedDisplay);
	}
	public void draw() {
		super.draw();
		drawNighttimeMode();
	}
	private void drawNighttimeMode() {System.out.println("\t 야간 모드 테마 기능 on");}
}