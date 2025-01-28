package oop.thema1.grundlagen.tictactoeJMiB;



public class HumanPlayer extends AbstractPlayer {
	
	//Konstruktor
	public HumanPlayer( Symbol symbol, String name) {
	        super(symbol, name); // Name und Symbol korrekt an die abstrakte Klasse weitergeben
	    }

	@Override
	public  String getName() {
		return name;
	}
	
	@Override
	public Symbol getSymbol() {
		return symbol;
	}
	
	
	@Override
	public boolean isHuman() {
		return true;
	}

	




}
