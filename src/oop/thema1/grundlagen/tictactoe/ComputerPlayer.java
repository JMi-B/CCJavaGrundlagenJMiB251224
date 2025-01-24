package oop.thema1.grundlagen.tictactoe;

public class ComputerPlayer extends AbstractPlayer {

	//Konstruktor
	 public ComputerPlayer(Symbol symbol, String name) {
	        super(symbol, name); // Name und Symbol korrekt an die abstrakte Klasse weitergeben
	    }
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public Symbol getSymbol() {
		return symbol;
	}
	
	@Override
	public boolean isHuman() {
		return false;
	}

}
