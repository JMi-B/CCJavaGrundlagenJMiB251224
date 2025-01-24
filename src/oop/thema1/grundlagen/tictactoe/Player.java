package oop.thema1.grundlagen.tictactoe;

public interface Player {

	//Interface für die Spieler
	
	//void makeMove(Board board);//wird in der class board gefüllt
	
	// Holt Symbol und Name
	
	Symbol getSymbol(Symbol symbol);
	
	String getName(String name);
	
	
//	void  addPlayer(Symbol symbol, String name);
	
	boolean isHuman();// Wann kommt die Abfrage? Hier oder in der Player Classe
	
	
}
