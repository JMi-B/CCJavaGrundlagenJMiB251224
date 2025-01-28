package oop.thema1.grundlagen.tictactoeJMiB;

public class Board {

	private final Symbol[][] grid;

	// Konstructor: Leeres Spielfeld aus dem Interface GameConfig

	public Board() {
		grid = new Symbol[GameConfig.SIZE][GameConfig.SIZE];
	}

	// Leeres Speilfeld anzeigen

	public void printBoard() {
		for (int row = 0; row < GameConfig.SIZE; row++) {
			for (int col = 0; col < GameConfig.SIZE; col++) {
				if (grid[row][col] == null) {
					System.out.print("-");// Leeresfeld
				} else {
					System.out.println(grid[row][col] + " ");// X und O
				}
			}
			System.out.println();
		}
	}
	// Make Move

	public boolean makeMove(int row, int col, Symbol symbol) {

		if (row < 0 || row >= GameConfig.SIZE || col < 0 || col >= GameConfig.SIZE) {
			return false;
		}

		if (grid[row][col] == null) {
			grid[row][col] = symbol;
			return true;

		}
		return false;
	}

	// todo isFull
	public boolean isFull() {
		for (int row = 0; row < GameConfig.SIZE; row++) {
			for (int col = 0; col < GameConfig.SIZE; col++) {
				if (grid[row][col] == null) {
					return false;
				}
			}
		}

	}

	// todo checkWin
	public boolean checkWin(Symbol symbol) {
		for (int row = 0; row < GameConfig.SIZE;row++) {
	if (
			(grid [row][0] == symbol && grid[row][1]== symbol&& grid [row][2]==symbol )||
			(grid [0][row] == symbol && grid[1][row]== symbol&& grid [2][row]==symbol )
			)
		return true;
		}
		if((board[0][0])==symbol&&board[1][1]==symbol&&board[2][2]==symbol)||(board[0][2])==symbol&&board[1][1]==symbol&&board[2][0]==symbol)){
return false;
}
