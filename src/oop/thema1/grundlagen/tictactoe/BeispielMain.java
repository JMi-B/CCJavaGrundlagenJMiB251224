package oop.thema1.grundlagen.tictactoe;

import java.util.Scanner;

public class BeispielMain {

	public static <addPlayer> void main(String[] args) {

		// Symbol Auswahl und Namen eingeben

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte gib deinen Namen ein:");
		String playerName = scanner.nextLine();

		Symbol playerSymbol = null;
		while (playerSymbol == null) {
			System.out.println("Wähle ein X oder ein O:");
			String input = scanner.nextLine().toUpperCase();
			if (input.equals("X")) {
				playerSymbol = Symbol.X;
			} else if (input.equals("O")) {
				playerSymbol = Symbol.O;
			} else {
				System.out.println("Das ist keine gültige Eingabe. Bitte X oder O eingeben");
			}
		}

		// Spieler Menschlich und Name inizialisiert

		HumanPlayer human = new HumanPlayer(playerSymbol, playerName);
		System.out.println("Hallo, " + human.getName() + " Du spielst mit dem " + human.getSymbol() + ".");

		// Computer bekommt anderes Symbol
		Symbol computerSymbol = (playerSymbol == Symbol.X) ? Symbol.O : Symbol.X;
		ComputerPlayer computer = new ComputerPlayer(computerSymbol, "Computer");
		System.out.println("Der Computer spielt mit " + computer.getSymbol() + " .");

//		System.out.println(human.getName() + " spielt mit " + human.getSymbol());
//		System.out.println(computer.getName() + " spielt mit " + computer.getSymbol());
//
//		System.out.println(human.getName() + " ist Mensch" + human.isHuman());
//		System.out.println(computer.getName() + "ist Mensch " + computer.isHuman());

		// Spielfeld
		Board board = new Board();

		System.out.println("Leeres Spielfeld:");
		board.printBoard();

		// Scanner Schließen nicht vergessen
		scanner.close();
	}

}
