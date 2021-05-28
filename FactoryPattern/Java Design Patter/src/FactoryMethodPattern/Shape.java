package FactoryMethodPattern;

interface Shape { //Product
	void draw();
}

class Circle implements Shape { //ConcreteProduct
	public void draw(){
		System.out.println("Circle - draw");
	}
}

class Rectangle implements Shape { //ConcreteProduct
	public void draw(){
		System.out.println("Rectangle - draw");
	}
}

class Square implements Shape { //ConcreteProduct
	public void draw(){
		System.out.println("Square - draw");
	}
}

class Triangle implements Shape{ //ConcreteProduct
	public void draw() {
		System.out.println("Triangle - draw");
	}
}

abstract class ShapeFactory { //Creator
	public void paint(){
		Shape s = getShape();
		s.draw();
	}

	public abstract Shape getShape();
}

class CircleFactory extends ShapeFactory { //ConcreteCreator
	public Shape getShape(){
		return new Circle();
	}
}

class RectangleFactory extends ShapeFactory { //ConcreteCreator
	public Shape getShape(){
		return new Rectangle();
	}
}

class SquareFactory extends ShapeFactory { //ConcreteCreator
	public Shape getShape(){
		return new Square();
	}
}
class TriangleFactory extends ShapeFactory{ //ConcreteCreator
	public Shape getShape() {
		return new Triangle();
	}
}