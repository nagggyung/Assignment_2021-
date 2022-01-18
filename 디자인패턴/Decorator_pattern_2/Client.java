package ½Ç½À8;

public class Client {

	public static void main(String[] args) {
		Display road = new RoadDisplay();
		road.draw();
		
		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw();
		
		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
		roadWithTraffic.draw();
		
		Display roadwithDayMode = new DaytimeMode(new RoadDisplay());
		roadwithDayMode.draw();
		
		Display roadwithNightMode = new NighttimeMode(new RoadDisplay());
		roadwithNightMode.draw();

	}

}
