package hw7;

import java.util.ArrayList;
import java.util.List;



public class Subject {
	private List<Observer> osvs = new ArrayList<Observer>();
	
	public void attach(Observer osv) {
		osvs.add(osv);
	}
	public void detach(Observer osv) {
		osvs.remove(osv);
		
	}
	
	public void notifyObservers(int level) {
		for(int i = 0; i< level; i++) {
			osvs.get(i).update();
		}
	}

}
