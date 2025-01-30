package oop.thema1.grundlagen.tictactoe.copycc;

public abstract class AbstractPlayer implements Player, GameConfig {

	// Atribute
	protected final String name;
	protected final Symbol symbol;

	// Konstruktor
	public AbstractPlayer() {
		this.name = name;
		this.symbol = symbol;

	}

	// Methoden
	public String getName() {
		return name;
	}

	public Symbol getSymbol() {
		return symbol;
	}

	@Override
	public abstract boolean isHuman();

}
