package oop.thema1.grundlagen.tictactoe;

import java.util.HashMap;
import java.util.Map;

public interface GameConfig {
	//Konstante für Spielfeldgröße
		int Board_SIZE = 3;
	
	//HashMap ordnet Symbol einem Speiler zu
	
	Map<Symbol, String> spieler = new HashMap<>(); // Symbol als Key kürzer und immer eindeutig

	void addSpieler(Symbol symbol, String name);
	
	
}