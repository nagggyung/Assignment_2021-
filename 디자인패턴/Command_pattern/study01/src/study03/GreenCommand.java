package study03;

interface GreenCommand {
	void execute();
}

class CenterDiceComm implements GreenCommand{
	private Game1 theGame;
	
	public CenterDiceComm(Game1 theGame) {
		this.theGame = theGame;
	}
	public void execute() {
		theGame.selCenterDice();
	}
}

class GreenBlockComm implements GreenCommand{
	private Game2 theGame;
	
	public GreenBlockComm(Game2 theGame) {
		this.theGame = theGame;
	}
	public void execute() {
		theGame.selGreenBlock();
	}
}

class LattuceComm implements GreenCommand{
	private Game3 theGame;
	
	public LattuceComm(Game3 theGame) {
		this.theGame = theGame;
	}
	public void execute() {
		theGame.selLattuce();
	}
}