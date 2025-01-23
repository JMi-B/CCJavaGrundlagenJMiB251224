package oop.thema1.grundlagen.tictactoe;

import java.util.HashMap;

public interface GameConfig {
	
	int SIZE = 3;
	
	HashMap<String, Symbol> spieler = new HashMap<>();

	void addSpieler(String name, Symbol symbol);
	
	
}