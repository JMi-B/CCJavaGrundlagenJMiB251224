package oop.thema1.grundlagen.tictactoe.copycc;

public class TicTacToeGame {

	private Board board;

	private Player player1;

	private Player player2;

	// Konstruktor
	public TicTacToeGame() {
		board = new Board();
		player1 = new HumanPlayer();
		Symbol computerSymbol = (player1.getSymbol() == Symbol.X) ? Symbol.O : Symbol.X;
		player2 = new ComputerPlayer(computerSymbol, "Computer");
	}

	// Methode

	public void play()
	{
		while(!board.isFull()){
			board.printBoard();
			currentPlayer.makeMove(board);
			if(board.checkWin(currentPlayer.getSymbol())) {
				board.printBoard();
				System.out.println(currentPlayer.getSymbol() + " gewinnt!");
				
				return;			
			}currentPlayer (currentPlayer == player1) ? player2: player1;

		} board.printBoard();
		System.out.println("Unterscheiden!");
		
	}
}
