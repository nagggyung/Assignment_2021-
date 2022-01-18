package study03;

interface BlueCommand {
	void execute();
}

class RightDiceComm implements BlueCommand{
	private Game1 theGame;
	
	public RightDiceComm(Game1 theGame){
		this.theGame = theGame;
	}
	public void execute() {
		theGame.selRightDice();
	}
}

class BlueBlockComm implements BlueCommand{
	private Game2 theGame;
	
	public BlueBlockComm(Game2 theGame) {
		this.theGame = theGame;
	}
	
	public void execute() {
		theGame.selBlueBlock();
	}
}

class PattyComm implements BlueCommand{
	private Game3 theGame;
	
	public PattyComm(Game3 theGame) {
		this.theGame = theGame;
	}
	public void execute() {
		theGame.selPatty();
	}
}
