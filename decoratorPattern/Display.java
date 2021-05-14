package 실습8;

public abstract class Display {
	public abstract void draw();

}

class RoadDisplay extends Display{
	public void draw() {
		System.out.println("도로 기본 표시");
	}
}

