package oop.thema1.grundlagen.tictactoe;

//import java.util.Arrays;

public class Board {

	// Inizialisiert board als zweidimensionales Array
	private final Symbol[][] board;

	// Konstruktor

	public Board() {
		board = new Symbol[GameConfig.Board_SIZE][GameConfig.Board_SIZE];
	}
	// Leeres Speilfeld anzeigen

	public void printBoard() {
		for (int row = 0; row < GameConfig.Board_SIZE; row++) {
			for (int col = 0; col < GameConfig.Board_SIZE; col++) {
				if (board[row][col] == null) {
					System.out.print("-");// Leeresfeld
				} else {
					System.out.println(board[row][col] + " ");// X und O
				}
			}
			System.out.println();
		}
	}

	// Methoden
	// MAke Move

	public boolean makeMove(int row, int col, Symbol symbol) {

		if (row < 0 || row >= GameConfig.Board_SIZE || col < 0 || col >= GameConfig.Board_SIZE) {
			return false;
		}

		if (board[row][col] == null) {
			board[row][col] = symbol;
			return true;

		}
		return false;
	}

	// todo isFull
	public boolean isFull() {
		for (int row = 0; row < GameConfig.Board_SIZE; row++) {
			for (int col = 0; col < GameConfig.Board_SIZE; col++) {
				if (board[row][col] == null) {
					return false;
				}
			}
		}
		return false;

	}

	// todo checkWin
	public boolean checkWin(Symbol symbol) {
		for (int row = 0; row < GameConfig.Board_SIZE; row++) {
			if ((board[row][0] == symbol && board[row][1] == symbol && board[row][2] == symbol)
					|| (board[0][row] == symbol && board[1][row] == symbol && board[2][row] == symbol)) {
				return true;
			}
		}

		if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
				|| (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
			return true;

		}
		return false;
	}
}
