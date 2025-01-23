package oop.thema1.grundlagen.tictactoe;

public interface Player {

	
	
	void makeMove(Board board);//wird in der class board gefüllt
	
	void  addPalyer(String name, Symbol symbol);
	
	boolean isPlayer(String name);// Wann kommt die Abfrage? Hier oder in der Player Classe
	
	Symbol getSpielerSymbol(String name);
}
