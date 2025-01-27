package oop.thema1.grundlagen.tictactoe;

import java.util.Arrays;

public class Board {

	private final Symbol[][] board;

	// ander Methode
	public Board() {
		
		board = new Symbol[GameConfig.Board_SIZE][GameConfig.Board_SIZE];
		for (int i = 0; i<GameConfig.Board_SIZE; i++) {
			Arrays.fill(board,null);
		}
	
		}
	
	public boolean makeMove(int row, int col, Symbol symbol) {
		
		if(row < 0 || row >= GameConfig.Board_SIZE || col < 0 || col >= GameConfig.Board_SIZE) {
			return false;
					}
		
		if(board[row][col]== null) {
			board[row][col] = symbol;
			return true;
			
		}
		return false;
	}
	// Konstructor: Leeres Spielfeld aus dem Interface GameConfig

//	public Board() {
//		board = new Symbol[GameConfig.Board_SIZE][GameConfig.Board_SIZE];
//	}
//
//	// Leeres Speilfeld anzeigen
//
//	public void printBoard() {
//		for (int row = 0; row < GameConfig.Board_SIZE; row++) {
//			for (int col = 0; col < GameConfig.Board_SIZE; col++) {
//				if (board[row][col] == null) {
//					System.out.print("-");// Leeresfeld
//				} else {
//					System.out.println(board[row][col] + " ");// X und O
//				}
//			}
//			System.out.println();
//		}
	public void printBoard() {
		for (int i = 0; i < GameConfig.Board_SIZE; i++) {
			for (int j = 0; j < GameConfig.Board_SIZE; j++) {
				if (board[i][j] == null) {
					System.out.print("-");// Leeresfeld
				} else {
					System.out.println(board[i][j] + " ");// X und O
				}
			}
			System.out.println();
		}
		
		//todo makeMove 
//		public boolean makeMove(int row, int col, symbol symbol) {
//		
//			return false;
//		}
		
		//todo isFull
		public boolean isFull() {
			for (int i = 0; i < GameConfig.Board_SIZE; i++) {
				for (int j = 0; j < GameConfig.Board_SIZE; j++) {
					if (board[i][j] == null) {
						return false;
					}
					}
				}
			
		}
		//todo checkWin
		public boolean checkWin(Symbol symbol) {
			for (int i = 0; i < GameConfig.Board_SIZE;i++) {
		if (
				(board [i][0] == symbol && board[i][1]== symbol&& board [i][2]==symbol )||
				(board [0][i] == symbol && board[1][i]== symbol&& board [2][i]==symbol )
				)
			return true;
			}
	}
		if ((board[0][0])==symbol && board[1][1]==symbol && board[2][2]==symbol)||
			(board[0][2])==symbol && board[1][1]==symbol && board[2][0]==symbol)){
	return false;
	
}