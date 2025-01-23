package oop.thema1.grundlagen.tictactoe;

public abstract class AbstractPlayer implements Player, GameConfig {

	protected String name;
	protected Symbol symbol;
	
	@Override
	public void addSpieler(String name, Symbol symbol) {
		// TODO Auto-generated method stub

	}

	@Override
	public Symbol getSpielerSymbol(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	abstract boolean isPlayer() {
		// TODO Auto-generated method stub
		return false;
	}

}
