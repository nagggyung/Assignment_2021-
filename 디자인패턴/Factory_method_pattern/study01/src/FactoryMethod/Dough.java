package FactoryMethod;

public interface Dough {
	public abstract void getThickness();
}

class ThinDough implements Dough{
	public void  getThickness() {
		System.out.print("µµ¿ì(¾ã°Ô)");
	}
}

class ThickDough implements Dough{
	public void getThickness() {
		System.out.print("µµ¿ì(µÎ²®°Ô)");
	}
}
