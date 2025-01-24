package oop.thema1.grundlagen.tictactoe;

public abstract class AbstractPlayer implements Player, GameConfig {

	//Atribute
	protected final String name;
	protected final Symbol symbol;
	
	//Konstruktor
	public AbstractPlayer(Symbol symbol, String name) {
		this.name = name;
		this.symbol = symbol;
		
		
	}
	

	//Methoden
	public String getName() {
		return name;
	}
	
	public Symbol getSymbol() {
		return symbol;
	}
	
	@Override
	public abstract boolean isHuman();

	

}
