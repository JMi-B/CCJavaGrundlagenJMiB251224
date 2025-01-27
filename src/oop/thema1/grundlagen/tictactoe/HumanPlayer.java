package oop.thema1.grundlagen.tictactoe;

import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer {
	private Scanner scanner = new Scanner(System.in);
	
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

	//todo: 
	@Override
	public void makeMove(Board board) {
		System.out.println(name + ", gib deine Bewegung ein (Reihe, Spalte");
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		
		while (!board.makeMove(row, col symbol)) {
			System.out.println("Ungültiger Zug, Vesuch es nochmal.");
			row = scanner.nextInt();
			col = scanner.nextInt();
		}
			
		
	}




}
