package �ǽ�8;

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
	private void drawLane() {System.out.println("\t ���� ǥ��");}
}

class TrafficDecorator extends DisplayDecorator{
	public TrafficDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}
	public void draw() {
		super.draw();
		drawTraffic();
	}
	private void drawTraffic() {System.out.println("\t ���뷮 ǥ��");}
}

class DaytimeMode extends DisplayDecorator{
	public DaytimeMode(Display decoratedDisplay) {
		super(decoratedDisplay);
	}
	public void draw() {
		super.draw();
		drawDaytimeMode();
	}
	private void drawDaytimeMode() {System.out.println("\t �ְ� ��� �׸� ���  on");}
	
}

class NighttimeMode extends DisplayDecorator{
	public NighttimeMode(Display decoratedDisplay) {
		super(decoratedDisplay);
	}
	public void draw() {
		super.draw();
		drawNighttimeMode();
	}
	private void drawNighttimeMode() {System.out.println("\t �߰� ��� �׸� ��� on");}
}