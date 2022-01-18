package study03;

interface RedCommand {
	void execute();
}

class LeftDiceComm implements RedCommand{
	private Game1 theGame;
	
	public LeftDiceComm(Game1 theGame) {
		this.theGame = theGame;
	}
	public void execute() {
		theGame.selLeftDice();
	}
}

class RedBlockComm implements RedCommand{
	private Game2 theGame;
	
	public RedBlockComm(Game2 theGame) {
		this.theGame = theGame;
	}
	public void execute() {
		theGame.selRedBlock();
	}
}

class TomatoComm implements RedCommand{
	private Game3 theGame;
	
	public TomatoComm(Game3 theGame) {
		this.theGame = theGame;
	}
	public void execute() {
		theGame.selTomato();
	}
}