package oop.thema1.grundlagen.tictactoe;

public class Board {

	private final Symbol[][] grid;
	
	//Konstructor: Leeres Spielfeld aus dem Interface GameConfig
	
	public Board() {
		grid = new Symbol[GameConfig.SIZE][GameConfig.SIZE];
	}
	
	//Leeres Speilfeld anzeigen
	
	public void printBoard() {
		for (int row = 0; row < GameConfig.SIZE;row++) {
			for(int col = 0; col < GameConfig.SIZE; col++) {
				if(grid[row][col] == null) {
					System.out.print("-");//Leeresfeld
				} else {
					System.out.println(grid[row][col]+ " ");//X und O
				}
			}
		System.out.println();
		}
	}
}
