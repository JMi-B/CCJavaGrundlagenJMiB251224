package oop.thema1.grundlagen.tictactoe.copycc;

import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer {
	
	private Scanner scanner = new Scanner(System.in);

	// Konstruktor
	public HumanPlayer() {
		
		super(); // Name und Symbol korrekt an die abstrakte Klasse weitergeben
	

	// Symbol Auswahl und Namen eingeben

		

		System.out.println("Bitte gib deinen Namen ein:");
		
		this.name = scanner.nextLine();
		
		//SymbolAuswahl
		System.out.println("Wähle ein X oder ein O:");
		
		Symbol playerSymbol = null;
		while (playerSymbol == null) {
			
			String input = scanner.nextLine().toUpperCase();
			if (input.equals("X")) {
				playerSymbol = Symbol.X;
			} else if (input.equals("O")) {
				playerSymbol = Symbol.O;
			} else {
				System.out.println("Das ist keine gültige Eingabe. Bitte X oder O eingeben");
			}
		}

//		// Spieler Menschlich und Name inizialisiert
//
//		HumanPlayer human = new HumanPlayer(playerSymbol, playerName);
//		System.out.println("Hallo, " + human.getName() + " Du spielst mit dem " + human.getSymbol() + ".");
//	}

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
		return true;
	}

	// todo:
	@Override
	public void makeMove(Board board) {
		System.out.println(name + ", gib deine Bewegung ein (Reihe, Spalte");
		int row = scanner.nextInt();
		int col = scanner.nextInt();

		while (!board.makeMove(row, col, symbol)) {
			System.out.println("Ungültiger Zug, Vesuch es nochmal.");
			row = scanner.nextInt();
			col = scanner.nextInt();
		}

	}

	
	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSpieler(Symbol symbol, String name) {
		// TODO Auto-generated method stub

		// Scanner Schließen nicht vergessen
		scanner.close();

	}

}
