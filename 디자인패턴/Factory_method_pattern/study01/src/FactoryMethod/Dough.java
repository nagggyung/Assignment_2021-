package FactoryMethod;

public interface Dough {
	public abstract void getThickness();
}

class ThinDough implements Dough{
	public void  getThickness() {
		System.out.print("����(���)");
	}
}

class ThickDough implements Dough{
	public void getThickness() {
		System.out.print("����(�β���)");
	}
}
