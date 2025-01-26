package oop.thema1.grundlagen.tictactoe;

import java.util.Scanner;

public class BeispielMain {

	public static <addPlayer> void main(String[] args) {

		//Spieler Menschlich und Name
		
		HumanPlayer human = new HumanPlayer(Symbol.X, "Alice");
		ComputerPlayer computer = new ComputerPlayer(Symbol.O, "Computer");
		
		System.out.println(human.getName() + " spielt mit " + human.getSymbol());
		System.out.println(computer.getName() + " spielt mit " + computer.getSymbol());
		
				
		System.out.println(human.getName() + " ist Mensch" + human.isHuman());
		System.out.println(computer.getName() + "ist Mensch " + computer.isHuman());

	
		//Spielfeld
		Board board = new Board();
	
		System.out.println("Leeres Spielfeld:");
		board.printBoard();
	
	}


}
