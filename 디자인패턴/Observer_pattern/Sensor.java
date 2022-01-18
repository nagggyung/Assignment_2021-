package hw7;

public class Sensor extends Subject {
	
	int SECU_LVL1 = 1;
	int SECU_LVL2 = 2;
	int SECU_LVL3 = 3;
	private int stateLevel = SECU_LVL1;

	private boolean stateDetected = false;
	
	public void setLevel(int level) {
		if(level==1) {
			stateLevel = SECU_LVL1;
		}
		else if (level == 2) {
			stateLevel = SECU_LVL2;
			
		}
		else {
			stateLevel = SECU_LVL3;
			
		}
		
	}
	
	public void setDetected(boolean b) {
		this.stateDetected = b;
		System.out.println("침입자가 감지되었습니다.");
		notifyObservers(stateLevel);
	}
	public int getLevel() {
		return stateLevel;
	}
	public boolean getDetected() {
		return stateDetected;
	}
	

}
