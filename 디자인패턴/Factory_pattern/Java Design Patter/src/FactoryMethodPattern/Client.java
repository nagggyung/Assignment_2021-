package FactoryMethodPattern;

public class Client {
	public static void main(String[] args){
		ShapeFactory sf1 = new CircleFactory();
		sf1.paint();

		ShapeFactory sf2 = new RectangleFactory();
		sf2.paint();

		ShapeFactory sf3 = new SquareFactory();
		sf3.paint();
		
		ShapeFactory sf4 = new TriangleFactory();
		sf4.paint();

		ShapeFactory[] arrSf = { new CircleFactory(), new RectangleFactory(), new SquareFactory(), new TriangleFactory() };
		for(int i=0; i<arrSf.length; i++){
			arrSf[i].paint();
		}
	}
}