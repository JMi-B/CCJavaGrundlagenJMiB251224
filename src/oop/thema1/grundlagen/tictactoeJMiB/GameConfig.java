package oop.thema1.grundlagen.tictactoeJMiB;

import java.util.HashMap;

public interface GameConfig {
	//Konstante für Spielfeldgröße
		int SIZE = 3;
	
	//HashMap ordnet Symbol einem Speiler zu
	
	HashMap<Symbol, String> spieler = new HashMap<>(); // Symbol als Key kürzer und immer eindeutig

  void addSpieler(Symbol symbol, String name);
	
	
}