 package oop.thema1.grundlagen.tictactoeJMiB;

import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer {
	
	//Konstruktor
	public HumanPlayer( Symbol symbol, String name) {
	        super(); // Name und Symbol korrekt an die abstrakte Klasse weitergeben
	    }
	
	

	@Override
	public  String getName() {
		return name;
	}
	
	Scanner scanner = new Scanner(System.in);

    // Frage den Namen des menschlichen Spielers
	
	System.out.print("Bitte geben Sie Ihren Namen ein:");
    String playerName = scanner.nextLine();

    // Frage nach dem Symbol (X oder O)
    Symbol playerSymbol = null;
    
    @Override
	public Symbol getSymbol() {
		return symbol;
	}
	
    while (playerSymbol == null) {
        System.out.print("Wählen Sie ein Symbol (X oder O): ");
        String input = scanner.nextLine().toUpperCase();
        if (input.equals("X")) {
            playerSymbol = Symbol.X;
        } else if (input.equals("O")) {
            playerSymbol = Symbol.O;
        } else {
            System.out.println("Ungültige Eingabe. Bitte wählen Sie X oder O.");
        }
    }
	
	
	
	@Override
	public boolean isHuman() {
		return true;
	}

	




}
